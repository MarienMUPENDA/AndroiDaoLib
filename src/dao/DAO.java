package dao;


import java.util.List;

/**
 * @author Marien MUPENDA
 * Date 13/12/2019
 * Time 21:17
 */
public abstract class DAO<T> {
    protected VolleyRest volleyRest;

    public DAO(VolleyRest volleyRest) {
        this.volleyRest = volleyRest;
    }

    public abstract boolean insert(T item);

    public abstract boolean insert(List<T> items);

    public abstract void update(List<T> items);

    public abstract boolean update(T obj);

/*
    abstract List<T> selectElementsByCondition(Condition... conds);

    abstract T selectElementByCondition(Condition... conds);
*/

    public abstract boolean delete(T obj);

    public abstract List<T> list();
}
