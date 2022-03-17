package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class1 {
    @BeforeClass
    public void bClass() {
        System.out.println("Before Class");
    }

    @Parameters({"print_test"})
    @Test
    public void test(String value) {
        if (value.equals("1")) {
            System.out.println("Test");
        } else if (value.equals("2")) {
            System.out.println("Test");
            System.out.println("Test");
        }
    }

    @Parameters({"print_aMethod"})
    @AfterMethod
    public void aMethod(String value) {
        if (value.equals("1")){
            System.out.println("After Method");
        }
    }
}
