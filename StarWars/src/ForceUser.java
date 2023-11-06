public abstract class ForceUser extends Entities{
    protected int level;
    protected int forcePoints;
    protected int saberAbility;

    public ForceUser() {
        this.name = "Default force user";
        this.level = 1;
        this.forcePoints = 1;
        this.saberAbility = 1;
        this.lifeTotal = 40;
        this.lifeCurrent = this.lifeTotal;
    }
    protected int attackSaber(){
        System.out.println(this.name + " does WHON!");
        return (this.level * this.saberAbility);
    }
}
