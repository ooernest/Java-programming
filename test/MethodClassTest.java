import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class MethodClassTest {

    MethodClass methodClass = new MethodClass();


    @Test
    public void test_multiplyTwoNumber(){
        int result = methodClass.multiplyTwoNumbers(4,4);
        Assertions.assertEquals(result, 16);


    }

}