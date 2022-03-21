import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NaobeniTest {

        @Test
        public void testNasobeniOk() {

            Nasobeni nasobeni1 = new Nasobeni();
            nasobeni1.nasobeni(5,6);
            assertEquals(30,nasobeni1.nasobeni(5,6));


        }
//        @Test
//        public void testNasobeniFail () {
//            Nasobeni nasobeni1 = new Nasobeni();
//            nasobeni1.nasobeni(5, 6);
//            assertEquals(29, nasobeni1.nasobeni(5, 6));
//        }
    }

