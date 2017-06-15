import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by ${Ghisa} on ${06/04/2017}.
 */
class playerTest {
    @Test
    void setAttack() {

        player hero = new player();

        hero.setPlayerName("Waldo");

        assertEquals("Waldo", hero.getPlayerName());

        hero.setAttack(1);
        hero.setAttack(1);
        hero.setAttack(3);
        hero.setAttack(2);

        hero.playerDamageTot();

        hero.setDamage(12);

        assertEquals(88, hero.getLife());

        hero.setDamage(88);

        hero.isDead();

        assertEquals(0, hero.getLife());
    }

}