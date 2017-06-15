import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by ${Ghisa} on ${06/04/2017}.
 */
class ladroTest {
    @Test
    void typeOfAttack() {

        ladro mike = new ladro();

        assertEquals(20.0, mike.getLife());

        mike.typeOfAttack();
        mike.typeOfAttack();
        mike.typeOfAttack();
        mike.typeOfAttack();
        mike.typeOfAttack();
        mike.typeOfAttack();
        mike.typeOfAttack();
        mike.typeOfAttack();
        mike.typeOfAttack();
        mike.typeOfAttack();
        mike.typeOfAttack();
        mike.typeOfAttack();

        mike.ladroDamageTot();



    }

}