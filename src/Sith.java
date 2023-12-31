public class Sith extends ForceUser implements IForceAttack {
    public Sith() {
        this.name = "Default Sith";
        this.level = 5;
        this.forcePoints = 10;
        this.saberAbility = 10;
        this.lifeTotal = 75;
        this.lifeCurrent = this.lifeTotal;
    }
    public Sith(String name, int level, int forcePoints, int saberAbility, int lifeTotal){
        this.name = name;
        this.level = level;
        this.forcePoints = forcePoints;
        this.saberAbility = saberAbility;
        this.lifeTotal = lifeTotal;
        this.lifeCurrent = this.lifeTotal;
    }

    @Override
    public int attack(int slot) {
        int damage = 0;
        if (slot == 2) {
            damage = this.forceAttack();
        } else {
            damage = this.attackSaber();
        }
        System.out.println("Enemy took " + damage + " of damage");
        return damage;
    }

    @Override
    public int forceAttack() {
        System.out.println(this.name + " used force lighting!");
        return (this.forcePoints * this.level);
    }
    @Override
    public int attackSaber() {
        System.out.println(this.name + " does WHON!");
        return (this.level * this.saberAbility);
    }
}
