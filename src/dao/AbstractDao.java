package dao;

/**
 * @author Marien MUPENDA
 * Date 13/12/2019
 * Time  21:51
 */
public class AbstractDao {
    /*public <T> List<T> selectElements(AbstractDao<T, ?> dao) {
        if (dao == null) {
            return null;
        }
        VolleyRest<T> qb = dao.volleyRest();
        return qb.list();
    }
    public <T> void insertElements(AbstractDao<T, ?> absDao, List<T> items) {
        if (items == null || items.size() == 0 || absDao == null) {
            return;
        }
        absDao.insertOrReplaceInTx(items);
    }
    public <T> T insertElement(AbstractDao<T, ?> absDao, T item) {
        if (item == null || absDao == null) {
            return null;
        }
        absDao.insertOrReplaceInTx(item);
        return item;
    }
    public <T> void updateElements(AbstractDao<T, ?> absDao, List<T> items) {
        if (items == null || items.size() == 0 || absDao == null) {
            return;
        }
        absDao.updateInTx(items);
    }
    public <T> T selectElementByCondition(AbstractDao<T, ?> absDao,
                                          Condition... conditions) {
        if (absDao == null) {
            return null;
        }
        VolleyRest<T> qb = absDao.volleyRest();
        for (Condition condition : conditions) {
            qb = qb.where(condition);
        }
        List<T> items = qb.list();
        return items != null && items.size() > 0 ? items.get(0) : null;
    }
    public <T> List<T> selectElementsByCondition(AbstractDao<T, ?> absDao, Condition... conditions) {
        if (absDao == null) {
            return null;
        }

        VolleyRest<T> qb = absDao.volleyRest();
        for (Condition condition : conditions) {
            qb = qb.where(condition);
        }
        List<T> items = qb.list();
        return items != null ? items : null;
    }
    public <T> List<T> selectElementsByConditionAndSort(AbstractDao<T, ?> absDao,
                                                        Property sortProperty,
                                                        String sortStrategy,
                                                        Condition... conditions) {
        if (absDao == null) {
            return null;
        }
        VolleyRest<T> qb = absDao.volleyRest();
        for (Condition condition : conditions) {
            qb = qb.where(condition);
        }
        qb.orderCustom(sortProperty, sortStrategy);
        List<T> items = qb.list();
        return items != null ? items : null;
    }
    public <T> List<T> selectElementsByConditionAndSortWithNullHandling(AbstractDao<T, ?> absDao,
                                                                        Property sortProperty,
                                                                        boolean handleNulls,
                                                                        String sortStrategy,
                                                                        Condition... conditions) {
        if (!handleNulls) {
            return selectElementsByConditionAndSort(absDao, sortProperty, sortStrategy, conditions);
        }
        if (absDao == null) {
            return null;
        }
        VolleyRest<T> qb = absDao.volleyRest();
        for (Condition condition : conditions) {
            qb = qb.where(condition);
        }
        qb.orderRaw("(CASE WHEN " + "T." + sortProperty.columnName + " IS NULL then 1 ELSE 0 END)," +
                "T." + sortProperty.columnName + " " + sortStrategy);
        List<T> items = qb.list();
        return items != null ? items : null;
    }
    public <T, V extends Class> List<T> selectByJoin(AbstractDao<T, ?> absDao,
                                                     V className,
                                                     Property property, Condition whereCondition)
    {
        VolleyRest<T> qb = absDao.volleyRest();
        qb.join(className, property).where(whereCondition);
        return qb.list();
    }
    public <T> void deleteElementsByCondition(AbstractDao<T, ?> absDao,
                                              Condition... conditions) {
        if (absDao == null) {
            return;
        }
        VolleyRest<T> qb = absDao.volleyRest();
        for (Condition condition : conditions) {
            qb = qb.where(condition);
            AndroidTM Notes for Professionals
            381}
        List<T> list = qb.list();
        absDao.deleteInTx(list);
    }
    public <T> T deleteElement(DaoSession session, AbstractDao<T, ?> absDao, T object) {
        if (absDao == null) {
            return null;
        }
        absDao.delete(object);
        session.clear();
        return object;
    }
    public <T, V extends Class> void deleteByJoin(AbstractDao<T, ?> absDao,
                                                  V className,
                                                  Property property, Condition whereCondition) {
        VolleyRest<T> qb = absDao.volleyRest();
        qb.join(className, property).where(whereCondition);
        qb.buildDelete().executeDeleteWithoutDetachingEntities();
    }
    public <T> void deleteAllFromTable(AbstractDao<T, ?> absDao) {
        if (absDao == null) {
            return;
        }
        absDao.deleteAll();
    }
    public <T> long countElements(AbstractDao<T, ?> absDao) {
        if (absDao == null) {
            return 0;
        }
        return absDao.count();
    }*/
}
