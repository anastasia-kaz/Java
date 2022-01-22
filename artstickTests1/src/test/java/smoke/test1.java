package smoke;

import com.beust.jcommander.Parameter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test1 {

    @Test
    public void test1 () {
        System.out.println("smoke.test1 ");
    }
}
//установить плагин тестнг хмл нажать на проект и внизу создать файл потом в фале нажать ctrl+alt+l

  /*             <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="All Test Suite">
<test verbose="2" preserve-order="true" name="C:/Users/acer/Desktop/git/Java/artstickTests1">
<classes>
<class name="smoke.test1"/>
</classes>
</test>
</suite>                   запуск одного теста


<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="All Test Suite">
    <test verbose="2" preserve-order="true" name="C:/Users/acer/Desktop/git/Java/artstickTests1">
        <packages>
            <package name="smoke"></package>
        </packages>
    </test>
</suite>                   запуск всего пакета с тестами


<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="All Test Suite">
    <test name="test1">
        <classes>
        <class name="smoke.test1"/>
        </classes>
    </test>

    <test name="test3">
        <classes>
            <class name="smoke.test3"/>
        </classes>
    </test>
</suite>           запуск отдельных тестов




<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="All Test Suite">

    <test name="test1">
        <groups>
            <run>
                <include name="regress"/>
                <include name="smokeTest"/>
            </run>
        </groups>


        <classes>
            <class name="smoke.test3"/>
            <class name="smoke.test1"/>
            <class name="smoke.test2"/>
        </classes>
    </test>
</suite>                 запуск по группам



<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="All Test Suite">

    <test name="test1">
        <parameter name="parametr" value="введенный параметр"></parameter>
        <classes>
            <class name="smoke.test1"/>
        </classes>
    </test>
</suite>                     выполнение с параметром



public class test1 {
    @Parameters({"parametr"})
    @Test (groups = {"smokeTest"})
    public void test1 (String parametr) {
        System.out.println("smoke.test1 " + parametr);
    }
}













*/