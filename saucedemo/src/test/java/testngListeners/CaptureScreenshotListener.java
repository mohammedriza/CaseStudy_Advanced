package testngListeners;

import model.CommonUtils;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CaptureScreenshotListener extends TestListenerAdapter {

    private final CommonUtils commonUtils;

    public CaptureScreenshotListener() {
        commonUtils = new CommonUtils();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        commonUtils.takeScreenshot();
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        commonUtils.takeScreenshot();
    }

    @Override
    public void onStart(ITestContext context) {
        commonUtils.takeScreenshot();
    }


}
