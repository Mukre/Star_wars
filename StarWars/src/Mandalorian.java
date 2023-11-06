public class Mandalorian extends Entities{
    public Mandalorian() {
        this.name = "Mandalorian";
        this.lifeTotal = 75;
        this.lifeCurrent = this.lifeTotal;
    }

    public int attackBlaster() {
        int min = 5;
        int max = 10;

        int randomDamage = (int) (Math.random() *( max - min + 1) + min);
        System.out.println(this.name + " shoot with his blaster! Enemy took " + randomDamage + " of damage");
        return randomDamage;
    }

    @Override
    public int attack(int slot) {
        int damage = 0;

        switch (slot){
            case 1:
                damage = this.attackBlaster();
                break;
            case 2:
                System.out.println(this.name + " used thermal grenade!  Enemy took 20 of damage");
                damage = 20;
                break;
            default:
                damage = this.attackBlaster();
                break;
        }
        return damage;
    }
}
