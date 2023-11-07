public class Sith extends ForceUser implements IForceAttack {
    public Sith() {
        this.name = "Default Sith";
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
                damage = this.attackSaber();
                break;
            case 2:
                damage = this.forceAttack();
                break;
            default:
                damage = this.attackSaber();
                break;
        }
        System.out.println("Enemy took " + damage + " of damage");
        return damage;
    }

    @Override
    public int forceAttack() {
        System.out.println(this.name + " used force lighting! Enemy took " + (this.forcePoints * this.level) + " of damage ");
        return (this.forcePoints * this.level);
    }
}
