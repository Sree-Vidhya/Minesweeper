import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FieldTest {
    int numberOfRows = 3;
    int numberOfColumns = 5;
    Field field = new Field(numberOfRows,numberOfColumns);
    @Test
    public void returnsNumberOfRows()
    {
        assertEquals(numberOfRows,field.getNumberOfRows());
    }
    @Test
    public void returnsNumberOfColumns()
    {
        assertEquals(numberOfColumns,field.getNumberOfColumns());
    }
}
