public class Inventory {
    public Item inventory[] = new Item[20];

    public void open(){
        if(inventory[0] == null){
            System.out.println("Инвентарь пустой");
            System.out.println(1 + ") Закрыть");
        }
        else {
            for (int i = 0; i < inventory.length; i++) {
                if(inventory[i] == null){
                    System.out.println(i + 1 + ") Закрыть");
                    break;
                }
                System.out.println(i + 1 + ") " + inventory[i].name + " Количество: " + inventory[i].count);
            }
        }
    }
    public String use(int n, Player player){
        if (inventory[n-1] == null || n == inventory.length){
            return "Инвентарь закрыт";
        }
        switch (inventory[n-1].name){
            case ("Log"):
                inventory[n-1].count -= 1;
                return "Вы использовали дерево, у вас осталось: " + inventory[n-1].count;
            case ("Meat"):
                inventory[n-1].count -= 1;
                player.hungry(4);
                return "Теперь ваша сытость составляет: " + player.getHUN();
        }
        return "no";
    }
    public String use(String name, Player player, int dx){
        switch (name){
            case ("Log"):
                for (int i = 0; i < inventory.length; i++) {
                    if(inventory[i] == null){
                        System.out.println("У вас недостаточно ресурсов");
                        break;
                    }
                    if(inventory[i].name.equals("Log")) {
                        inventory[i].count += dx;
                    }
                }
                //return "Вы использовали дерево, у вас осталось: " + inventory[n-1].count;
            case ("Meat"):
                //inventory[n-1].count -= 1;
                player.hungry(4);
                return "Теперь ваша сытость составляет: " + player.getHUN();
        }
        return "no";
    }
    public void add(Item item){
        for(int i = 0; i < inventory.length; i++){
            if(inventory[i] == null){
                inventory[i] = item;
                break;
            }
        }
    }
}
