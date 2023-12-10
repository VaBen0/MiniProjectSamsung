public class Scene {
    public String title, text;
    private int dHP = 0, dHUN = 0, dPR = 0;
    public Scene events[];

    public Scene(String title, String text, int variants, int dHP, int dHUN, int dPR){
        this.title = title;
        this.text = text;
        this.dHP = dHP;
        this.dHUN = dHUN;
        this.dPR = dPR;
        this.events = new Scene[variants];
    }
    public int getdHP() {
        return dHP;
    }
    public int getdHUN() {
        return dHUN;
    }
    public int getdPR() {
        return dPR;
    }
}
