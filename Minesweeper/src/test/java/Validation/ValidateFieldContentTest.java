package Validation;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class ValidateFieldContentTest {
    ValidateFieldContent field = new ValidateFieldContent();
    @Test
    public void validInputReturnsTrue()
    {
        assertEquals(true,field.validateTheInput("."));
        assertEquals(true,field.validateTheInput("*"));
    }
    @Test
    public void invalidInputReturnsFalse()
    {
        assertEquals(false,field.validateTheInput("a"));
    }
    @Test
    public void emptyInputReturnsFalse()
    {
        assertEquals(false,field.validateTheInput(""));
    }
    @Test
    public void doubleIntegerReturnsTotalNumberOfCells()
    {
        assertEquals(4,field.calculateToTalNumberofcells("22"));
    }
    @Test
    public void invalidInputReturnsZero()
    {
        assertEquals(0,field.calculateToTalNumberofcells("a"));
        assertEquals(0,field.calculateToTalNumberofcells("aa"));
        assertEquals(0,field.calculateToTalNumberofcells("2"));
    }
    @Test
    public void emptyInputReturnsZero()
    {
        assertEquals(0,field.calculateToTalNumberofcells(""));
    }

    @Test
    public void testuserEnteredEachCell(){
        ValidateFieldContent mock = new ValidateFieldContent();
        ArrayList field = new ArrayList();
        String actual;
        field.add(".");
        field.add("*");
        field.add(".");
        field.add(".");
        mock = Mockito.mock(ValidateFieldContent.class);
        when(mock.eachCellInput())
//                .thenReturn(".")
//                .thenReturn("*")
//                .thenReturn(".")
                .thenReturn(".");
        assertEquals(field,(mock.userEnteredEachCell(4)));
    }
}
