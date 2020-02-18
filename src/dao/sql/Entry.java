package dao.sql;

/**
 * @author Marien MUPENDA
 * Date 14/12/2019
 * Time  21:16
 */
public class Entry {
    private String column;
    private Object value;

    public Entry(String column, Object value) {
        this.column = column;
        this.value = (value instanceof String) ? "'" + ((String) value).replace("'","''") + "'" : value;
    }

    @Override
    public String toString() {
        return column + "=" + value;
    }
}
