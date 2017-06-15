import java.util.Random;

/**
 * Created by ${Ghisa} on ${06/04/2017}.
 */
public class ladro extends enemies {

    private int attack;
    private double damage;
    private double life = 20;
    private static Random rand = new Random(15);
    private int ladroDamage;
    private int m,s;


    public double getDamage() {
        return damage;
    }


    public int setAttack() {
        attack = rand.nextInt(15);
        return attack;
    }

    public double getLife() {
        return life;
    }


    public void typeOfAttack() {
        this.attack = attack;

        if (life >= 1) {
            attack = setAttack();

            switch (attack) {
                case (1):
                case (2):
                case (3):
                case (4):
                case (5):
                    System.out.println("Ladro usa: mazza!");
                    damage = 10;
                    m++;
                    break;

                case (6):
                case (7):
                case (8):
                case (9):
                case (10):
                    System.out.println("Ladro usa: spada!");
                    damage = 15;
                    s++;
                    break;
                default:
                    System.out.println("Ladro si autocolpisce con la mazza!");
                    life -= 10;
                    break;

            }
        }else {
            isDead();
            ladroDamageTot();
            System.out.println("Prima di morire è riuscito ad infliggerti: " + ladroDamage);
            System.exit(1);
        }

    }

    public boolean isDead(){
        if (getLife() <= 0) {
            System.out.println("Il ladro è morto!");
            return true;
        }


        return false;
    }

    public int ladroDamageTot(){
        ladroDamage = (m * 10)+(s*15);
        return ladroDamage;
    }


}
