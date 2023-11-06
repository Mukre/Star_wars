public abstract class Entities {
    protected String name;
    protected int lifeTotal;
    protected int lifeCurrent;
    protected boolean knockedOut = false;

    public Entities() {
        this.name = "default entity";
        this.lifeTotal = 30;
        this.lifeCurrent = this.lifeTotal;
    }
    public void recover(Entities entity){
        System.out.println(this.name + " took a rest after a long battle! Another one awaits..");
        this.lifeCurrent = this.lifeTotal;
    }
    public abstract int attack(int slot);
}
