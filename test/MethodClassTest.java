import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class MethodClassTest {

    MethodClass methodClass = new MethodClass();


    @Test
    public void test_subtractTwoNumber(){
        int result = methodClass.subtractTwoNumbers(6,4);
        Assertions.assertEquals(result, 2);


    }

}