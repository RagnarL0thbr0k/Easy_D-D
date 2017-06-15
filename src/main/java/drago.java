import java.util.Random;

/**
 * Created by ${Ghisa} on ${06/04/2017}.
 */
public class drago extends enemies {


    private int attack;
    private double damage;
    private double life = 50;
    private static Random rand = new Random(10);
    private int dragoDamage;
    private int a,f,p;


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

        if (life > 0) {
            attack = setAttack();

            switch (attack) {
                case (1):
                case (2):
                case (3):System.out.println("Drago usa: artigli!");
                    damage = 10;
                    a++;
                    break;
                case (4):
                case (5):
                    System.out.println("Drago usa: fuoco!");
                    damage = 20;
                    f++;
                    break;

                case (6):
                case (7):
                case (8):
                case (9):
                case (10):
                    System.out.println("Drago usa: picchiata!");
                    damage = 15;
                    p++;
                    break;
                default:
                    System.out.println("Drago si nasconde!");
                    dragoDamageTot();
                    System.out.println("Prima di nascondersi il drago è riuscito ad infliggerti: " + dragoDamage);
                    System.exit(0);
                    break;

            }
        }else {
            isDead();
            dragoDamageTot();
            System.exit(0);

        }

    }

    public boolean isDead(){
        if (getLife() <= 0) {
            System.out.println("Il drago è morto!");
            return true;
        }

        return false;
    }

    public int dragoDamageTot(){
        dragoDamage = (a*10)+(p*15)+(f*20);
        return dragoDamage;
    }

}
