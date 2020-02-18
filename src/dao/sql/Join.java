package dao.sql;

/**
 * @author Marien MUPENDA
 * Date 14/12/2019
 * Time  16:05
 */

public class Join {
    String table,type;
    Condition condition;

    public Join(String table, Condition condition,String type) {
        condition.escape=false;
        this.condition = condition;
        this.table = table;
        this.type=type;
    }

    public Join(String table, Condition condition) {
        this(table,condition,"");
    }


        @Override
    public String toString() {
        return "\n"+getType()+"JOIN "+table+" ON " + condition;
    }

    private String getType() {
        return (type.trim().length()>0)?type+" ":"";
    }
}
