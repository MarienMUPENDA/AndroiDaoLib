/**
 *
 */
package models;



import java.io.Serializable;


/**
 * @author KADIATA
 *
 */
public class Client{

    public static final String TABLE_NAME = "client";
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private int id;
    private String nom;
    private String postNom;
    private String prenom;
    private String adresse;
    private String telephone;

    public Client(String nom, String postNom, String prenom, String adresse, String telephone)  {

        this.setNom(nom);
        this.setPostNom(postNom);
        this.setPrenom(prenom);
        this.setTelephone(telephone);
        this.setAdresse(adresse);
    }

    public Client(int id, String nom, String postNom, String prenom, String adresse, String telephone)  {
        this.id=id;
        this.setNom(nom);
        this.setPostNom(postNom);
        this.setPrenom(prenom);
        this.setTelephone(telephone);
        this.setAdresse(adresse);
    }


    public Client() {
        super();
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (!(nom.isEmpty()) & nom.length() >= 3) {
            nom.toUpperCase();
            this.nom = nom;
        } else {
            System.out.println("Le nom doit avoir plus de 3 lettres");
        }
    }

    public String getPostNom() {
        return postNom;
    }

    public void setPostNom(String postNom) {
        if (!(postNom.isEmpty()) & postNom.length() >= 3) {
            postNom.toUpperCase();
            this.postNom = postNom;
        } else {
            System.out.println("Le post-nom doit avoir plus de  3 lettres");
        }

    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        if (!(prenom.isEmpty()) & prenom.length() >= 3)
            this.prenom = prenom;
        else {
            System.out.println("Le prenom doit avoir plus de  3 lettres");
        }
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        if (!(adresse.isEmpty()) & adresse.length() >= 1)
            this.adresse = adresse;
        else {
            System.out.println("L'adresse doit avoir plus de  1 lettres");
        }
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        if (telephone.length() == 10)
            this.telephone = telephone;
        else {
            System.out.println("Le numero de telephone doit avoir 10 chiffres");
        }
    }

    public String getFullName() {
        return String.format("%s %s %s", nom, postNom, prenom);
    }




    @Override
    public String toString() {
        return String.format("%S", getFullName());
    }
}
