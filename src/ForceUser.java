public abstract class ForceUser extends Entities{
    protected int level;
    protected int forcePoints;
    protected int saberAbility;
    protected int attackSaber(){
        System.out.println(this.name + " does WHON!");
        return (this.level * this.saberAbility);
    }
}
