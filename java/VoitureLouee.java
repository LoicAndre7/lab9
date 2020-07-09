/**
 * Class VoitureLouee, contient un constructeur d'objet de type VoitureLouee, les methodes d'accès et de modification
 * des attributs ainsi que les methodes qui pour retouner le type et la grandeure de la voiture sous forme de chaine de
 * caracères
 * Nom : Loïc André
 * Code Permanent : ANDL10058801
 * Cours : INF1120 Programmation I
 * Groupe : 10
 * @version 20/04/20
 */


public class VoitureLouee {

    // Constantes
    final static String TYPE_HYBRIDE = "Hybride";
    final static String TYPE_ELEC = "Électrique";
    final static String GRANDEUR_P = "Petite";
    final static String GRANDEUR_I = "Intermédiaire";
    final static String GRANDEUR_G = "Grande";
    final static char TYPE_E = 'E';
    final static char TYPE_E_MIN = 'e';

    // Atributs
    private char typeVoiture;
    private char gdrVoiture;
    private String plaqueImma;
    static int voitureElecLouee = 0;
    static int voitureHybrideLouee = 0;


    /**
     * Constructeur avec les trois attributs de la classe
     *
     * @param typeVoiture
     * @param gdrVoiture
     * @param plaqueImma
     */
    public VoitureLouee(char typeVoiture, char gdrVoiture, String plaqueImma) {
        this.typeVoiture = typeVoiture;
        this.gdrVoiture = gdrVoiture;
        this.plaqueImma = plaqueImma;

       if (typeVoiture == TYPE_E || typeVoiture == TYPE_E_MIN){
           voitureElecLouee++;
       }
       else {
           voitureHybrideLouee++;
       }
    }


    /**
     * Retourne le type de la voiture
     *
     * @return
     */
    public char getTypeVoiture() { return typeVoiture;}


    /**
     * Retourne le grandeur de la voiture
     *
     * @return
     */
    public char getGdrVoiture() { return gdrVoiture;}


    /**
     * Retourne le numéro de plaque de la voiture
     *
     * @return
     */
    public String getPlaqueImma() { return plaqueImma;}


    /**
     * Modifi le type de la voiture
     *
     * @param typeVoiture
     */
    public void setTypeVoiture(char typeVoiture) { this.typeVoiture = typeVoiture;}


    /**
     * Modifi la grandeur de la voiture
     *
     * @param gdrVoiture
     */
    public void setGdrVoiture(char gdrVoiture) { this.gdrVoiture = gdrVoiture;}


    /**
     * Modifie le numero de la plaque d'immatriculation
     *
     * @param plaqueImma
     */
    public void setPlaqueImma(String plaqueImma) { this.plaqueImma = plaqueImma;}


    /**
     * retourne une chaine de caractère qui decrit le type de la voiture
     * @return
     */
    public String typeVoitureString() {

        String renvois = "";

        switch (typeVoiture) {

            case 'H':
            case 'h':
                renvois = TYPE_HYBRIDE;
                break;

            default:
                renvois = TYPE_ELEC;
                break;
        }
        return renvois;
    }


    /**
     * Retourne la grandeur de la voiture sous la forme d'un string
     *
     * @return
     */
    public String gdrVoiturString(){

        String renvois;

        switch (gdrVoiture){

            case 'p':
            case 'P':
                renvois = GRANDEUR_P;
                break;

            case 'i':
            case 'I':
                renvois = GRANDEUR_I;
                break;

            default:
                renvois = GRANDEUR_G;
                break;
        }
        return renvois;
    }
}