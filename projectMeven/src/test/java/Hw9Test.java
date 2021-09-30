import org.testng.Assert;
import org.testng.annotations.Test;

public class Hw9Test {
    @Test
    void getSum(){
        Assert.assertEquals(Hw9.getSum(2,2),4);
    }
    @Test
    void getSum1(){
        Assert.assertEquals(Hw9.getSum(-2,2),0);
    }
    @Test
    void getSum2(){
        Assert.assertEquals(Hw9.getSum(-2,-2),-4);
    }
    @Test
    void getSum3(){
        Assert.assertEquals(Hw9.getSum(0,0),0);
    }



    @Test
    void getMin(){
        Assert.assertEquals(Hw9.getMin(5,10),-5);
    }
    @Test
    void getMin1(){
        Assert.assertEquals(Hw9.getMin(-2,-2),0);
    }
    @Test
    void getMin2(){
        Assert.assertEquals(Hw9.getMin(2,-2),4);
    }
    @Test
    void getMin3(){
        Assert.assertEquals(Hw9.getMin(15,10),5);
    }



    @Test
    void getMul(){
        Assert.assertEquals(Hw9.getMul(5,10),50);
    }
    @Test
    void getMul1(){
        Assert.assertEquals(Hw9.getMul(-2,2),-4);
    }
    @Test
    void getMul2(){
        Assert.assertEquals(Hw9.getMul(-2,-2),4);
    }
    @Test
    void getMul3(){
        Assert.assertEquals(Hw9.getMul(2,0),0);
    }



    @Test
    void getDiv(){
        Assert.assertEquals(Hw9.getDiv(50,10),5);
    }
    @Test
    void getDiv1(){
        Assert.assertEquals(Hw9.getDiv(-2,2),-1);
    }
    @Test
    void getDiv2(){
        Assert.assertEquals(Hw9.getDiv(-2,-2),1);
    }
    @Test
    void getDiv3(){
        Assert.assertEquals(Hw9.getDiv(0,2),0);
    }
}
