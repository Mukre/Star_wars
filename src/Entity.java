public abstract class Entities {
    protected String name;
    protected int lifeTotal;
    protected int lifeCurrent;
    protected boolean knockedOut = false;

    public void recover() {
        System.out.println(this.name + " took a rest after a long battle! Another one awaits..");
        this.lifeCurrent = this.lifeTotal;
    }

    public abstract int attack(int slot);
}
