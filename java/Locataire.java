/**
 * Class Locataire, contient un constructeur d'objet Locataire, ainsi que les methodes d'accès et de modification
 * des attributs
 * Nom : Loïc André
 * Code Permanent : ANDL10058801
 * Cours : INF1120 Programmation I
 * Groupe : 10
 * @version 20/04/20
 */



public class Locataire {

    // Attribus
    private String prenom;
    private String nom;
    private String tel;
    private String numPermis;
    private CarteCredit carteCredit;



    /**
     * Construit un objet de type Locataire avec les 5 attribus de la classe locataire
     * @param prenom
     * @param nom
     * @param tel
     * @param carteC
     */
    public Locataire(String prenom, String nom, String tel, String numPermis, CarteCredit carteC){

        this.prenom = prenom;
        this.nom = nom;
        this.tel = tel;
        this.numPermis = numPermis;
        this.carteCredit = carteC;
    }


    /**
     * Retourne le prenom du locataire
     * @return prenom;
     */
    public String getPrenom(){
        return prenom;
    }


    /**
     * Retourne le nom du locataire
     * @return
     */
    public String getNom(){
        return nom;
    }


    /**
     * Retourne le numéro de telephone du locataire
     * @return
     */
    public String getTel(){
        return tel;
    }


    /**
     * Retourne le numéro de permis de conduire du client
     * @return
     */
    public String getNumPermis(){
        return numPermis;
    }


    /**
     * Retourne l'objet carte de crédit
     * @return
     */
    public CarteCredit getCarteC(){
        return carteCredit;
    }


    /**
     * PErmet de modifier le prenom du locataire
     * @param prenom
     */
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }


    /**
     * Permet de modifier le nom du locataire
     * @param nom
     */
    public void setNom(String nom){
        this.nom = nom;
    }


    /**
     * Permet de modifier le numéro de téléphone du client
     * @param tel
     */
    public void setTel(String tel){
        this.tel = tel;
    }


    /**
     * Permet de modifier les attributs de la carte de crédit
     * @param carteCredit
     */
    public void setCarteC(CarteCredit carteCredit){
        this.carteCredit = carteCredit;
    }


    /**
     * Permet de modifier le numéro de permis de conduire du client
     * @param numPermis
     */
    public void setNumPermis(String numPermis){
        this.numPermis = numPermis;
    }

}
