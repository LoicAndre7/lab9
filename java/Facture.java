/**
 * Class Facture, contient un constructeur d'objet Facture, les methodes d'accès et de modification des attributs,
 * ainsi que les méthodes pour calculer une facture
 * Nom : Loïc André
 *  Code Permanent : ANDL10058801
 * Cours : INF1120 Programmation I
 * Groupe : 10
 * @version 20/04/20
 */

public class Facture {


    //Constante
    final static float TAUX_TPS      = 0.05f;
    final static float TAUX_TVQ      = 0.0997f;
    final static float TAUX_RABAIS   = 0.10f;
    final static int   SEUIL_RABAIS   = 10;


    // Attributs
    private static int numFacture = 0;
    private float prixLocation;
    private float prixAssurance;
    private float montantLocation;
    private float montantAssurance;
    private float montantRabais;
    private float sousTotalFacture;
    private float montantTPS;
    private float montantTVQ;
    private float totalFacture;


    /**
     * Construit un objet de type Facture en initialisant les attributs prix location par jour
     * et prix assurance par jour
     * @param prixLocation
     * @param prixAssurance
     */
    public Facture(float prixLocation, float prixAssurance){
        this.prixLocation = prixLocation;
        this.prixAssurance = prixAssurance;
        numFacture++;
    }


    /**
     * Retourne le prix de la location par jour
     * @return
     */
    public float getPrixLocation(){ return prixLocation;}


    /**
     * Permet de modifier le prix de la location par jour
     * @param prixLocation
     */
    public void setPrixLocation(float prixLocation){ this.prixLocation = prixLocation;}


    /**
     * Retourne le prix de l'assurance par jour
     * @return
     */
    public float getPrixAssurance(){ return prixAssurance;}


    /**
     * Permetde modifier le prix de l'assurance par jour
     * @param prixAssurance
     */
    public void setPrixAssurance(float prixAssurance){ this.prixAssurance = prixAssurance;}


    /**
     * Retourne le montant de la location
     * @return
     */
    public float getMontantLocation(){ return montantLocation;}


    /**
     * Retourne le montant de l'assurance
     * @return
     */
    public float getMontantAssurance(){ return montantAssurance;}


    /**
     * Retourne le montant du rabais
     * @return
     */
    public float getMontantRabais(){ return montantRabais;}


    /**
     * Retourne le sous total de la fcture
     * @return
     */
    public float getSousTotalFacture(){ return sousTotalFacture;}


    /**
     * Retourne le montant de la taxe TPS
     * @return
     */
    public float getMontantTPS(){ return montantTPS;}


    /**
     * Retourne le montant de la taxe TVQ
     * @return
     */
    public float getMontantTVQ(){ return montantTVQ;}


    /**
     * Retourne le montant total de la facture
     * @return
     */
    public float getTotalFacture(){ return totalFacture;}


    /**
     * Calcule le montant de la location de la voiture
     * @param nbrJours
     */
    public void calculerMontantLocation(int nbrJours){
        montantLocation = prixLocation * nbrJours;
    }


    /**
     * Calcule le montant l'assurance pour la location
     * @param nbrJours
     */
    public void calculerMontantAssurance(int nbrJours){
        montantAssurance = prixAssurance * nbrJours;
    }


    /**
     * Calcule le montant du rabais en considérant les valeures en paramettre
     * @param typeVoiture
     * @param gdrVoiture
     * @param nbrJours
     */
    public void CalculerRabais(char typeVoiture, char gdrVoiture, int nbrJours){

        switch(typeVoiture){
            case ApplicationPrincipale.TYPE_E:
            case ApplicationPrincipale.TYPE_E_MIN:

                if (nbrJours > SEUIL_RABAIS) {

                    switch (gdrVoiture) {
                        case ApplicationPrincipale.GDR_I:
                        case ApplicationPrincipale.GDR_I_MIN:
                        case ApplicationPrincipale.GDR_G:
                        case ApplicationPrincipale.GDR_G_MIN:
                            montantRabais = prixLocation * TAUX_RABAIS;
                            break;
                    }
                }
                break;

            default:
                montantRabais = 0;
        }
    }


    /**
     * Calcule le montant du sous total de la facture
     */
    public void calculerSousTotalFacture(){

        sousTotalFacture = montantLocation + montantAssurance - montantRabais;
    }


    /**
     * Calcule le montant de taxe TPS
     */
    public void calculerMontantTPS(){
        montantTPS = sousTotalFacture * TAUX_TPS;
    }


    /**
     * Calcule le montant de la taxe TVQ
     */
    public void calculerMontantTVQ(){
        montantTVQ =  sousTotalFacture * TAUX_TVQ;
    }


    /**
     * Calcule le total de la facuture
     */
    public void calculerTotalFacture(){

        totalFacture = sousTotalFacture + montantTPS + montantTVQ;
    }


    /**
     * Retourne le numéro de facture
     * @returnnumFacture
     */
    public int getNumFacture(){
        return numFacture;
    }

}
