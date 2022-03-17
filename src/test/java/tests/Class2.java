package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class2 {
    @Parameters({"param1","param2"})
    @Test
    public void test2(String value1, String value2) {
        System.out.println("Test");
        System.out.println("Test data: " + value1 + " " + value2);
    }


    @Parameters({"print"})
    @AfterMethod
    public void aMethod(String value3) {
        if (value3.equals("2")){
            System.out.println("After Method");
            System.out.println("After Method");
        } else if (value3.equals("1")) {
            System.out.println("After Method");
        }
    }
}
