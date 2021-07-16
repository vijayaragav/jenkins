import com.google.common.base.Verify;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVsVerify {

    @Test(priority = 0)
    public static void method1() {
        int i = 10;
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(i, 11);
        System.out.println("verified successfully");
        softAssert.assertAll();

    }

    @Test(priority = 1)
    public static void method2() {
        int i = 10;
        System.out.println("second assertion method");
        Assert.assertEquals(i, 10);
        System.out.println("asserted successfully");

    }

}
