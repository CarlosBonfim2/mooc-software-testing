package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//These JUnit tests verifies that adding 5 to the input value produces the expected predefined output.
public class GettingStartedTest {

    @Test //indicates that the following method is a JUnit test
    public void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

   @Test
    public void addFiveToZero() {
      int result = new GettingStarted().addFive(0);
       Assertions.assertEquals(5, result);
   }
//this test allows you to add number 5 to -20
   @Test
    public void addFiveToMinus20() {
        int result = new GettingStarted().addFive(-20);
       Assertions.assertEquals(-15,result);
       //Assertions.assertEquals(-15,result);
   }
}
