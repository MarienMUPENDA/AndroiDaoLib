package dao.sql;

import java.util.List;

/**
 * @author Marien MUPENDA
 * Date 13/12/2019
 * Time  22:53
 */

public class QueryBuilder {
    private String table;
    private String[] columns;
    private Condition[] conditions;
    private Order order;
    private Join[] joins;
    private Entry[] entries;


    public QueryBuilder select(String... projectionIn) {
        columns = projectionIn;
        return this;
    }

    public QueryBuilder from(String table) {
        this.table = table;
        return this;
    }

    public QueryBuilder where(Condition... conds) {
        this.conditions = conds;
        return this;
    }

    public QueryBuilder where(String column, Object value) {
        this.conditions = new Condition[1];
        this.conditions[0] = new Condition(column, value);
        return this;
    }



    public QueryBuilder order(String column, String order) {
        this.order = new Order(column, order);
        return this;
    }

    public String get() {
        return String.format("SELECT %s FROM %s %s %s %s", obj2Str(columns, "*", ","), table, obj2Str(joins), getConds(), order);
    }


    private String obj2Str(Object[] items, String sep) {
        return obj2Str(items, "", sep);
    }

    private String obj2Str(Object[] items) {
        return obj2Str(items, "");
    }

    private String obj2Str(Object[] items, String def, String sep) {
        StringBuilder conds = new StringBuilder();

        if (items != null && items.length > 0) {
            conds = new StringBuilder();
            for (int i = 0; i < items.length; i++) {
                Object item = items[i];

                conds.append(item);
                if (i == items.length - 1) break;
                conds.append(sep);
            }
        } else {
            conds.append(def);
        }
        return conds.toString();
    }


    private String getConds() {
        StringBuilder conds = new StringBuilder();
        if (conditions != null && conditions.length > 0) {
            conds = new StringBuilder("\nWHERE ");
            for (int i = 0; i < conditions.length; i++) {

                Condition item = conditions[i];

                String sep = item.separator.trim();
                if (i > 0 && i <= conditions.length) {
                    conds.append(" " + sep + " ");
                }

                conds.append(item);

            }
        }
        return conds.toString();
    }


    public QueryBuilder join(Join... joins) {
        this.joins = joins;
        return this;
    }

    public QueryBuilder insert(Entry... entries) {
        this.entries = entries;
        return this;
    }

    public QueryBuilder update(Entry... entries) {
        this.entries = entries;
        return this;
    }

    public QueryBuilder into(String table) {
        this.table = table;
        return this;
    }

    public String put() {
        return String.format("INSERT INTO %s SET %s", table, obj2Str(entries, ","));

    }

    public String set() {
        return String.format("UPDATE %s SET %s %s", table, obj2Str(entries, ","), getConds());

    }


}
