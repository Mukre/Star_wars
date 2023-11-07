public final class Jedi extends ForceUser implements IForceAttack {
    public Jedi() {
        this.name = "Default Jedi";
        this.level = 5;
        this.forcePoints = 10;
        this.saberAbility = 10;
        this.lifeTotal = 75;
        this.lifeCurrent = this.lifeTotal;
    }

    @Override
    public int attack(int slot) {
        int damage = 0;
        switch (slot) {
            case 1:
                damage = attackSaber() + this.forcePoints;
                System.out.println("Enemy took " + damage + " of damage");
                break;
            case 2:
                damage = forceAttack();
                System.out.println("Enemy took " + (this.forcePoints) + " of damage");
                break;
            default:
                damage = attackSaber() + this.forcePoints;
                System.out.println("Enemy took " + damage + " of damage");
                break;
        }
        return damage;
    }


    @Override
    public int forceAttack() {
        System.out.println(this.name + " used the force and pushes the enemy!");
        return this.forcePoints;
    }
}
