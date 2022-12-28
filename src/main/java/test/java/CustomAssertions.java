import org.testng.Assert;

public class CustomAssertions extends Assert {
    public static void isImageDisplayed (Boolean expectedBool, Boolean currentBool) {
        String errorMessage = "Actual State: " + currentBool + ". Expected State: " + expectedBool;
        Assert.assertEquals(currentBool, expectedBool, errorMessage);
    }
}
