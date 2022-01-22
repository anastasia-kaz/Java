package smoke;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class Retry implements IRetryAnalyzer {
    private int actualRetry = 0;
    private static final int MAX = 3;

    @Override
    public boolean retry (ITestResult result) {
        if(actualRetry < MAX){
            actualRetry++;
            return true;
        } else {
            return false;
        }
    }
}

