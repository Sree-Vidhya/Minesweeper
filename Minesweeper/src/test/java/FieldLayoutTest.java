import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FieldLayoutTest
{
    FieldLayout fieldLayout = new FieldLayout("3","5");
    @Test
    public void returnNumberOfRows()
    {
        assertEquals("3",fieldLayout.getNumberOfRows());
    }
    @Test
    public void returnsNumberOfColumns()
    {
        assertEquals("5",fieldLayout.getNumberOfColumns());
    }
    @Test
    public void returnsFieldLayout()
    {
        assertEquals("35",fieldLayout.getFieldLayout());
    }
}
