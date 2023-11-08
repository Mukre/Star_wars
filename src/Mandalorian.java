public class Mandalorian extends Entities {
    public Mandalorian() {
        this.name = "Mandalorian";
        this.lifeTotal = 75;
        this.lifeCurrent = this.lifeTotal;
    }

    public int attackBlaster() {
        Operations op = new Operations();
        int randomDamage = op.generateRandomInt(5, 10);
        System.out.println(this.name + " shoot with his blaster! Enemy took " + randomDamage + " of damage");
        return randomDamage;
    }

    @Override
    public int attack(int slot) {
        int damage = 0;
        if (slot == 2) {
            System.out.println(this.name + " used thermal grenade!");
            damage = 20;
        } else {
            damage = this.attackBlaster();
        }
        System.out.println("Enemy took " + damage + " of damage");
        return damage;
    }
}
