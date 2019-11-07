import java.lang.ref.SoftReference;

public class FieldLayout
{
        String numberOfRows;
    String numberOfColumns;

    public FieldLayout(String numberOfRows, String numberOfColumns) {
        this.numberOfRows = numberOfRows;
        this.numberOfColumns = numberOfColumns;
    }

        public String getNumberOfRows() {
            return numberOfRows;
        }
        public String getNumberOfColumns() {
            return numberOfColumns;
        }
        public String getFieldLayout(){
            return numberOfRows + numberOfColumns;
        }

    @Override
    public String toString() {
        return "FieldLayout{" +
                "numberOfRows='" + numberOfRows + '\'' +
                ", numberOfColumns='" + numberOfColumns + '\'' +
                '}';
    }
}
