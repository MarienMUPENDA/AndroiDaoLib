import dao.VolleyRest;
import dao.imp.ClientDAO;
import dao.sql.*;

import java.sql.Time;
import java.util.Date;
import java.util.Map;

/**
 * @author Marien MUPENDA
 * Date 13/12/2019
 * Time  23:36
 */
public class Main {
    public static void main(String... args) {

        QueryBuilder queryBuilder = new QueryBuilder();
        String sql = queryBuilder
                .update(new Entry("nom", "marien's"), new Entry("date", new Time(System.currentTimeMillis())))
                .into("user")
                .where(new Condition("nom","marien",Condition.OPERATOR.NOT_EQUALS))
                .set();
        System.out.println(sql);

    }
}
