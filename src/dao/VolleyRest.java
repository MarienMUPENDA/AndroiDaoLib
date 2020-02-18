package dao;


import java.util.HashMap;

/**
 * @author Marien MUPENDA
 * Date 13/12/2019
 * Time  21:54
 */
public class VolleyRest {


    private String url;
    private HashMap<String, String> params;


    public VolleyRest() {
    }





    public void query(String sql, OnResponseListener listener) {
        //params.put("sql", sql);
        System.out.println(sql);
        // request(url + "/sql.php", params, listener);
    }


    public interface OnResponseListener {
        void onResponse(String response);

        void onError(String error);
    }


}
