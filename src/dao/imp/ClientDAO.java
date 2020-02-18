package dao.imp;

import dao.DAO;
import dao.VolleyRest;
import models.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientDAO extends DAO<Client> {

    public ClientDAO(VolleyRest volleyRest) {
        super(volleyRest);

    }


    @Override
    public boolean insert(Client item) {
        return false;
    }


    @Override
    public boolean insert(List<Client> items) {
        return false;
    }

    @Override
    public void update(List<Client> items) {

    }

    @Override
    public boolean update(Client obj) {
        return false;
    }

    @Override
    public boolean delete(Client obj) {
        return false;
    }



   /* @Override
    public boolean update(Client obj) {

        boolean status = false;
        if (obj.isValid()) {
            try {
                PreparedStatement prepare = this.connexion.prepareStatement("UPDATE client SET nom=?, postNom=?, prenom=?, telephone=? adresse=? WHERE id=?");

                prepare.setString(1, obj.getNom());
                prepare.setString(2, obj.getPostNom());
                prepare.setString(3, obj.getPrenom());
                prepare.setString(4, obj.getTelephone());
                prepare.setString(5, obj.getAdresse());
                prepare.setInt(6, obj.getId());

                int etat = prepare.executeUpdate();

                status = (etat > 0) ? true : false;
                prepare.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return status;
    }*/


    @Override
    public List<Client> list() {

        List<Client> liste = new ArrayList<Client>();

       /* String sql = volleyRest.build()
                .select()
                .from(Client.TABLE_NAME)
                .get();

        volleyRest.query(sql, null);*/


        return liste;
    }
}
