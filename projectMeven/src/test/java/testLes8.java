import org.testng.Assert;
import org.testng.annotations.Test;

public class testLes8 {

    @Test
    void  testGetSum1() {
        Assert.assertEquals(Les8.getSum(10, 10), 20);
    }
    @Test
    void  testGetSum2() {
        Assert.assertEquals(Les8.getSum(0, 0), 0);
    }
    @Test
    void  testGetSum3() {
        Assert.assertEquals(Les8.getSum(-10, 10), 0);
    }
    @Test
    void  testGetSum4() {
        Assert.assertEquals(Les8.getSum(-10, -10), -20);
    }

    @Test
    void  testGetSum(){
        int result;
        //result = Les8.getSum(10, 10);
        Assert.assertEquals(Les8.getSum(10, 10), 20);

        result = Les8.getSum(0, 0);
        Assert.assertEquals(result, 0);

        result = Les8.getSum(-10, 10);
        Assert.assertEquals(result, 0);

        result = Les8.getSum(-10, -10);
        Assert.assertEquals(result, -20);

    }

}
