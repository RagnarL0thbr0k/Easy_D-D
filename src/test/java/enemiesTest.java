import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by ${Ghisa} on ${06/04/2017}.
 */
class enemiesTest {
    @Test
    void setEnemies() {

        enemies zero = new enemies() {
            @Override
            public void setNome(String nome) {
                super.setNome(nome);
            }

            @Override
            public void setRazza(String razza) {
                super.setRazza(razza);
            }
        };

        enemies uno = new enemies() {
            @Override
            public void setNome(String nome) {
                super.setNome(nome);
            }

            @Override
            public void setRazza(String razza) {
                super.setRazza(razza);
            }
        };

        ladro mirko = new ladro();

        mirko.setNome("mirko");
        mirko.setRazza("ladro");

        assertEquals("mirko", mirko.getNome());
        assertEquals("ladro", mirko.getRazza());

        mirko.typeOfAttack();
        mirko.typeOfAttack();
        mirko.typeOfAttack();
        mirko.typeOfAttack();
        mirko.typeOfAttack();

        assertEquals(10, mirko.getXp());

    }
    @Test
    void setEnemies2() {

        murdok marko = new murdok();

        marko.setNome("marko");
        marko.setRazza("murdok");

        assertEquals("marko", marko.getNome());
        assertEquals("murdok", marko.getRazza());

        marko.typeOfAttack();
        marko.typeOfAttack();
        marko.typeOfAttack();
        marko.typeOfAttack();
        marko.typeOfAttack();

        assertEquals(5, marko.getXp());

    }
    @Test
    void setEnemies3() {

        drago murko = new drago();

        murko.setNome("murko");
        murko.setRazza("Drago");

        assertEquals("murko", murko.getNome());
        assertEquals("Drago", murko.getRazza());

        murko.typeOfAttack();
        murko.typeOfAttack();
        murko.typeOfAttack();
        murko.typeOfAttack();
        murko.typeOfAttack();

        assertEquals(5, murko.getXp());

    }

}