import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Доброго времени суток, введите пожалуйста ваш никнейм: ");
        Player player = new Player(in.next());
        Inventory inventory = new Inventory();
        System.out.println("Добро пожаловать в мою игру " + player.getName());
        Story story = new Story(player);
        while(true){
            if(story.currentScene.title.equals("Успешная рубка дерева")){
                Item log = new Item("Log", 25);
                inventory.add(log);
            }
            if(story.currentScene.title.equals("Верстак!")){
                inventory.use("Log", player, -20);
            }
            if(story.currentScene.title.equals("Маленький дом")){
                inventory.use("Log", player, -20);
            }
            System.out.println("Ваше количество сердец: " + player.getHP() + "" +
                    "\nВаше состояние защищённости: " + player.getPR() + "" +
                    "\nВаше количество сытости: " + player.getHUN());
            System.out.println("Хотите ли вы открыть и посмотреть содержимое инвенторя? \n1) Да\n2) Нет");
            if(in.nextInt() == 1){
                System.out.println("Инвентарь:");
                inventory.open();
                System.out.println("Выберите из предложенных вариантов: ");
                System.out.println(inventory.use(in.nextInt(), player));
            }
            System.out.println(story.currentScene.text);
            if(story.end()){
                System.out.println("=========================КОНЕЦ ИГРЫ===============================");
                return;
            }
            while (!story.nextScene(in.nextInt())){
                System.out.println("Вы выбрали номер действия, которое не существует.");
            }
            player.damage(story.currentScene.getdHP());
            player.protect(story.currentScene.getdPR());
            player.hungry(story.currentScene.getdHUN());
        }
    }
}