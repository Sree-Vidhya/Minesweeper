
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ContentsOfTheFieldTest {
    ArrayList allTheConTentOfTheField = new ArrayList(){{
        add(".");
        add(".");
        add(".");
        add("*");
    }};
    ContentsOfTheField content = new ContentsOfTheField(allTheConTentOfTheField);
 @Test
    public void contentsOfTheFieldReturnsanArrayList(){
     System.out.println(allTheConTentOfTheField);
     System.out.println(content.getAllTheConTentOfTheField());
     assertEquals(allTheConTentOfTheField,content.getAllTheConTentOfTheField());
 }
}
