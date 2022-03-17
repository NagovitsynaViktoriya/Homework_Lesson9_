package tests;

import org.testng.annotations.*;

public class Class3 {
    @BeforeSuite
    public void bSuite() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void bTest() {
        System.out.println("Before Test");
    }

    @Test
    public void test() {
        System.out.println("Test");
    }

    @AfterMethod
    public void aMethod() {
        System.out.println("After Method");
    }


    @AfterTest
    public void aTest() {
        System.out.println("After Test");
    }

    @AfterSuite
    public void aSuite3() {
        System.out.println("After Suite");
    }
}
