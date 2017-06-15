import java.util.Random;

/**
 * Created by ${Ghisa} on ${06/04/2017}.
 */
public class player {

    private int life = 100;
    private int damage;
    private int playerDamage;
    private String playerName;
    private int attack;
    private int p,a,m;

    public player(){}

    public player (String nome, int attackType){
        this.playerName=nome;
        this.attack=attackType;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
        if (life > 0) {
            switch (attack) {
                case (1):System.out.println( getPlayerName() + " usa: pugno!");
                            damage = 7;
                            p++;
                            break;
                case (2):System.out.println( getPlayerName() + " usa: ascia!");
                            damage = 15;
                            a++;
                            break;
                case (3):System.out.println( getPlayerName() + " usa: pistola!");
                            damage = 20;
                            m++;
                            break;
                default:System.out.println(getPlayerName() + " è sconcertato :/");
            }
        }else {
            isDead();
            playerDamageTot();
            System.out.println("Prima di morire " + getPlayerName() + " è riuscito ad infliggere: " + playerDamage);
            System.exit(0);
        }

    }


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getLife() {
        return life;
    }


    public boolean isDead(){
        if (getLife() <= 0) {
            System.out.println("Il tuo eroe è morto!");
            return true;
        }

        return false;
    }

    public int playerDamageTot(){
        playerDamage = (p*7)+(a*15)+(m*20);
        System.out.println(getPlayerName() + " è riuscito ad infliggere: " + playerDamage);
        return playerDamage;
    }

}
