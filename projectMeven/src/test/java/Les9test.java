import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.commons.lang3.StringUtils;

public class Les9test {
    @Test
    void dz(){
        Assert.assertEquals(StringUtils.abbreviate("Привет всем кто живет на луне!", 20),"Привет всем кто ж...");
    }
    @Test
    void dz1(){
        Assert.assertEquals(StringUtils.abbreviate("Привет всем кто живет на луне!", 10),"Привет ...");
    }
}
