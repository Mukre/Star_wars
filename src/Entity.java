public abstract class Entity {
    protected String name;
    protected int lifeTotal;
    protected int lifeCurrent;
    protected boolean knockedOut = false;

    public void recover() {
        System.out.println(this.name + " took a rest after a long battle! Another one awaits..");
        knockedOut = false;
        this.lifeCurrent = this.lifeTotal;
    }
    public void checkLifeCurrent(){
        if(this.lifeCurrent <= 0){
        this.knockedOut = true;
        System.out.println(this.name + " is knocked out!");
        }
    }
    public void performAttack(Entity attacker, Entity defender){
        Operations op = new Operations();
        defender.lifeCurrent -= attacker.attack(op.generateRandomInt(1,5));
        defender.checkLifeCurrent();
    }
    public abstract int attack(int slot);
}
