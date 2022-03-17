package tests;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class4 {
    @Parameters({"param1","param2"})
    @Test
    public void test(String value1, String value2) {
        System.out.println("Test");
        System.out.println("Test data: " + value1 + " " + value2);
    }

    @AfterClass
    public void aClass1() {
        System.out.println("After Class");
    }

    @AfterClass
    public void aClass2() {
        System.out.println("After Class");
    }

    @AfterTest
    public void aTest() {
        System.out.println("After Test");
    }
}
