package smoke;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class test2 {
    @Test (retryAnalyzer = Retry.class)
    public void test2 () {
        System.out.println("smoke.test2");
        Assert.fail();

    }

    @Test ( groups = {"regress"},
            dependsOnMethods = {"test2"},
            alwaysRun = true)   //будет выполнятся всегда но только после 2 теста
    public void test22 () {
        System.out.println("smoke.test2");
    }

    @Test(dependsOnMethods = {"test22"})    // жесткая зависимость те тест будет пропущен если не выполнился 22
    public void test222 () {
        System.out.println("smoke.test2");
    }
}


/* public class Retry implements IRetryAnalyzer{
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
}                      // если тест не стабилен то при провале он будет повторно выполняться максимум 3 раза*/