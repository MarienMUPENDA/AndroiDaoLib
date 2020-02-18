package dao.sql;

/**
 * @author Marien MUPENDA
 * Date 13/12/2019
 * Time  22:05
 */
public class Condition {
    public boolean escape = true;

    public interface OPERATOR {
        String EQUALS = "=",
                GREATER = ">",
                LESS = "<",
                GREATER_OR_EQUALS = ">=",
                LESS_OR_EQUALS = "<=",
                NOT_EQUALS = LESS+GREATER;


    }

    public interface SEPARATOR {
        String AND = "AND",
                OR = "OR";

    }


    public String separator, key, operator;
    public Object value;

    public Condition(String key, Object value) {
        this(key, value, OPERATOR.EQUALS, SEPARATOR.AND);
    }

    public Condition(String key, Object value, String opertator) {
        this(key, value, opertator, SEPARATOR.AND);
    }


    public Condition(String key, Object value, String opertator, String separator) {
        this.key = key;
        this.value = ((escape && value instanceof String) ? "'" + ((String) value).replace("'", "''") + "'" : value);
        this.operator = opertator;
        this.separator = separator;
    }

    @Override
    public String toString() {
        return key + operator + value;
    }
}
