public final class Jedi extends ForceUser implements IForceAttack {
    public Jedi() {
        this.name = "Default Jedi";
        this.level = 5;
        this.forcePoints = 10;
        this.saberAbility = 10;
        this.lifeTotal = 75;
        this.lifeCurrent = this.lifeTotal;
    }
    public Jedi(String name, int level, int forcePoints, int saberAbility, int lifeTotal) {
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
            damage = forceAttack();
        } else {
            damage = attackSaber() + this.forcePoints;
        }
        System.out.println("Enemy took " + damage + " of damage");
        return damage;
    }


    @Override
    public int forceAttack() {
        System.out.println(this.name + " used the force and pushes the enemy!");
        return this.forcePoints;
    }
}
