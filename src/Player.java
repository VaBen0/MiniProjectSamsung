public class Player {
    private int HP;
    private int PR;
    private int HUN;
    private String name;

    Player(String name){
        this.HP = 20;
        this.PR = 0;
        this.HUN = 20;
        this.name = name;
    }
    public void damage(int dHP){
        if(dHP + this.HP <= 0){
            this.HP = 0;
        }else{
            if(dHP + this.HP >= 20){
                this.HP = 20;
            }else{
                this.HP = this.HP + dHP;
            }
        }
    }
    public void hungry(int dHUN){
        if(dHUN + this.HUN <= 0){
            this.HUN = 0;
        }else{
            if(dHUN + this.HUN >= 20){
                this.HUN = 20;
            }else{
                this.HUN = this.HUN + dHUN;
            }
        }
    }
    public void protect(int dPR){
        if(dPR + this.PR <= 0){
            this.PR = 0;
        }else{
            if(dPR + this.PR >= 20){
                this.PR = 20;
            }else{
                this.PR = this.PR + dPR;
            }
        }
    }
    public String getName() {
        return this.name;
    }
    public int getHP() {
        return this.HP;
    }
    public int getPR() {
        return this.PR;
    }
    public int getHUN() {
        return this.HUN;
    }
}
