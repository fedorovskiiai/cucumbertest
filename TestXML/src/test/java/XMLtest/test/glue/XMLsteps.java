package XMLtest.test.glue;

import cucumber.api.java.ru.Пусть;
import cucumber.api.java.ru.Тогда;
import org.junit.Assert;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;


public class XMLsteps {

private Document document;
    @Пусть("на вход конвертора подан файл <src\\/deti.xml>")
    public void readfile ( )throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        document = builder.parse(new File("src/deti.xml"));
        throw new cucumber.api.PendingException();
    }

    @Пусть("на вход конвертора подана XML-строка <root>")
    public void getXMLstring() {
        Element root = document.getDocumentElement();
        throw new cucumber.api.PendingException();
    }


    @Тогда("результат является корректным JSON")
    public void assertJSONequals() {
        Assert.assertEquals("src/test.json", "src/deti.xml");
        throw new cucumber.api.PendingException();
    }

    @Тогда("результат содержит подстроку <employee>")
    public void assertString() {
        Assert.assertTrue("<employee>");
        throw new cucumber.api.PendingException();
    }



}
