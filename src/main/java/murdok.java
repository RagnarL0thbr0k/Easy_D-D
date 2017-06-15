import java.util.Random;

/**
 * Created by ${Ghisa} on ${06/04/2017}.
 */
public class murdok extends ladro{

    private int attack;
    private double damage;
    private double life = 5;
    private static Random rand = new Random(15);
    private int murdokDamage;
    private int f,a;

    public double getDamage() {
        return damage;
    }

    public void setDamage(int damage){
        this.damage=damage;
        life =- damage;
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
                case (3):
                case (4):
                case (5):
                    System.out.println("Murdok usa: fango!");
                    damage = 2;
                    f++;
                    break;

                case (6):
                case (7):
                case (8):
                case (9):
                case (10):
                    System.out.println("Murdok usa: artigli!");
                    damage = 15;
                    a++;
                    break;
                default:
                    System.out.println("Il murdok sta scappando!");
                    murdokDamageTot();
                    System.out.println("Danni totali subiti: " + murdokDamage);
                    System.exit(0);


            }
        }else {
            isDead();
            System.out.println("Danni totali subiti: " + murdokDamage);
            return;
        }

    }

    public boolean isDead(){
        if (getLife() <= 0) {
            System.out.println("Il murdok è morto!");
            return true;
        }


        return false;
    }

    public int murdokDamageTot(){
        murdokDamage = (f*2)+(a*15);
        return murdokDamage;
    }


}
