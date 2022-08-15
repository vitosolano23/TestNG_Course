package Day5;

import org.testng.annotations.Test;

public class _03_Groups {

    @Test(groups = "Regression")
    public void Test1() {
        System.out.println("Test 1");
    }

    @Test(groups = "SmokeTest")
    public void Test2() {
        System.out.println("Test 2");
    }

    @Test(groups = "Regression")
    public void Test3() {
        System.out.println("Test 3");
    }

    @Test(groups = "SmokeTest")
    public void Test4() {
        System.out.println("Test 4");
    }

    @Test(groups = "Regression")
    public void Test5() {
        System.out.println("Test 5");
    }

    @Test(groups = "SmokeTest")
    public void Test6() {
        System.out.println("Test 6");
    }

    @Test
    public void Test7() {
        System.out.println("Test 7");
    }

}


