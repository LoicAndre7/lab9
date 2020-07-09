/**
 * Class CarteCredit, contient un constructeur d'objet CarteCredit, les méthodes d'accès et de modification des attributs
 * ainsi qu'une methode pour retourner le type de carte de crédit sous forme de chaine de caractère
 * Nom : Loïc André
 * Code Permanent : ANDL10058801
 * Cours : INF1120 Programmation I
 * Groupe : 10
 *@version 20/04/20
 */



public class CarteCredit {

    //Constantes
    final static String TYPE_VISA          = "Visa";
    final static String TYPE_MSTR_CARTD    = "Master Card";

    // Attributs
    private char typeCarte;
    private String numCarte;


    /**
     * Construit un objet de type carteCredit avec les attribu type de carte et numero de carte
     * @param typeCarte
     * @param numCarte
     */
    public CarteCredit(char typeCarte, String numCarte){
        this.numCarte = numCarte;
        this.typeCarte = typeCarte;
    }


    /**
     * Retourne un char represantant le type de carte
     * @return
     */
    public char getTypeCarte(){ return typeCarte;}


    /**
     * Retourne le numéro de carte de crédit sous forme de chaine de caractère
     * @return
     */
    public String getNumCarte(){ return numCarte;}


    /**
     * Modifi le type de la carte de crédit
     * @param typeCarte
     */
    public void setTypecarte(char typeCarte){ this.typeCarte = typeCarte;}


    /**
     * modifi le numéro de la crte de crédit
     * @param numCarte
     */
    public void setNumCarte(String numCarte){ this.numCarte = numCarte;}


    /**
     * Retourne le type de la carte sous forme de chaine de caractère
     *
     * @return
     */
    public String stringTypeCarte(){

        String aRetourner;

        switch(typeCarte){
            case 'v':
            case 'V':
                aRetourner = TYPE_VISA;
                break;

            default :
                aRetourner = TYPE_MSTR_CARTD;
                break;
        }
        return aRetourner;
    }
}

