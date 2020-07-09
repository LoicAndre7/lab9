import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * Class LocationVoiture, contient un constructeur d'objet LocationVoiture, les methodes d'accès et de modification
 * des attributs ainsi qu'une méthode pour afficher une facture
 * Nom : Loïc André
 * Code Permanent : ANDL10058801
 * Cours : INF1120 Programmation I
 * Groupe : 10
 * @version 20/04/20
 */

public class LocationVoiture {

    // Constantes
    final static  String NOM_CIE      = "LVV - Location des Voitures Vertes";
    final static  String ADDRESS_CIE  = "4085 boulevard Ecolo, Villeverte, QC";
    final static  String TEL_CIE      = "(999) 999-0099";
    final static String MSGE_RABAIS        = "Vous avez économisé un total de ";
    final static String MGE_REMERCIEMENT  = "Merci pour votre confiance !";

    // Attributs
    private int nbrJours;
    private LocalDateTime dateHDebut;
    private LocalDateTime dateHFin;
    private Locataire locataire;
    private VoitureLouee voitureLouee;
    private Facture facture;
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");


    /**
     * Construit un objet de type LocationVoiture en initialisant les attributs passés en parametre
     * @param nbrJours
     * @param dateHDebut
     * @param dateHFin
     * @param locataire
     * @param voitureLouee
     * @param facture
     */
    public LocationVoiture(int nbrJours, LocalDateTime dateHDebut, LocalDateTime dateHFin,
                           Locataire locataire, VoitureLouee voitureLouee, Facture facture){

        this.nbrJours = nbrJours;
        this.dateHDebut = dateHDebut;
        this.dateHFin = dateHFin;
        this.locataire = locataire;
        this.voitureLouee = voitureLouee;
        this.facture = facture;
    }

    /**
     * Retourne le nombre de jours de location
     * @return nbrJours
     */
    public int getNbrJours(){ return nbrJours;}


    /**
     * Retourne l'attribut date et heure du debut de la location
     * @return dateHDebut
     */
    public LocalDateTime getDateHDebut(){ return dateHDebut;}


    /**
     * Retourne l'attribut date et heure de la fin de la location
     * @return dateHFin
     */
    public LocalDateTime getDateHFin(){ return dateHFin;}


    /**
     * Retourne l'attribut locataire
     * @return
     */
    public Locataire getLocataire(){ return locataire;}


    /**
     * Retourne l'attribut voitureLouee
     * @return
     */
    public VoitureLouee getVoitureLouee(){ return voitureLouee; }


    /**
     * Retourne l'attribut facture
     * @return
     */
    public Facture getFacture(){
        return facture;
    }


    /**
     * Permet de saisir le nombre de jours
     * @param nbrJours
     */
    public void setNbrJours(int nbrJours){ this.nbrJours = nbrJours;}


    /**
     * Permet de saisir la date et heure de debut de location
     * @param dateHDebut
     */
    public void setDateHDebut(LocalDateTime dateHDebut){ this.dateHDebut = dateHDebut;}


    /**
     * Permet de sisir la date et heure de fin de location
     * @param dateHFin
     */
    public void setDateHFin(LocalDateTime dateHFin){ this.dateHFin = dateHFin;}


    /**
     * Permet de saisir l'attribut locataire
     * @param locataire
     */
    public void setLocataire(Locataire locataire){ this.locataire = locataire;}


    /**
     * Permet de saiair l'attribut voitureLouee
     * @param voitureLouee
     */
    public void setVoitureLouee(VoitureLouee voitureLouee){
        this.voitureLouee = voitureLouee;}


    /**
     * Permet de sisir l'attribut facture
     * @param facture
     */
    public void setFacture(Facture facture){ this.facture = facture; }


    /**
     * Affiche
     * @param dateHDebut
     * @param dateHFin
     * @param locataire
     * @param voitureLouee
     * @param facture
     */
    public void afficherFacture(LocalDateTime dateHDebut, LocalDateTime dateHFin, Locataire locataire,
                                VoitureLouee voitureLouee, Facture facture){

        System.out.print("\n                        " + NOM_CIE +
                "\n\nFacture No : " + facture.getNumFacture() +
                "                                        Date et Heure : " +
                dateHDebut.format(formatter) + "\n" +
                ADDRESS_CIE + "                                       " +
                TEL_CIE +
                "\n-----------------------------------------------------------------------------------------\n" +
                "Nom et prénom : " + locataire.getNom() + " " + locataire.getPrenom());

        for(int i=0;  (i + locataire.getNom().length() + locataire.getPrenom().length() < 29); i++) {
            System.out.print(" ");
        }

        System.out.print("Téléphone : " + locataire.getTel() + "\n" +
                "No Permis de conduire : " + locataire.getNumPermis() + "       No Plaque : " +
                voitureLouee.getPlaqueImma() + "\n" +
                "Type de la voiture : " + voitureLouee.typeVoitureString());

        if (voitureLouee.typeVoitureString().equals(VoitureLouee.TYPE_ELEC)) {
            System.out.print("               Grandeur de la voiture : ");
        }
        else{
            System.out.print("                  Grandeur de la voiture : ");
        }

        System.out.print(voitureLouee.gdrVoiturString() + "\n" + "Carte de crédit Type : " +
                locataire.getCarteC().stringTypeCarte());

        if (locataire.getCarteC().stringTypeCarte().equals( CarteCredit.TYPE_MSTR_CARTD)) {
            System.out.print("            No : " + locataire.getCarteC().getNumCarte() + "\n");
        }
        else{
            System.out.print("                   No : " + locataire.getCarteC().getNumCarte() + "\n");
        }

        System.out.print("Date et Heure Début : " + dateHDebut.format(formatter) +
                "     Fin : " + dateHFin.format(formatter) + "\n\n" +
                "Prix de la location par jour               " + String.format("%.2f",
                facture.getPrixLocation()) + " $\n" +
                "Prix de l'assurance par jour               " + String.format("%.2f",
                facture.getPrixAssurance()) + " $\n");

        if (facture.getMontantRabais() > 0){
            System.out.print("Montant de la location avec rabais         ");
        }
        else System.out.print("Montant de la location                     ");

        System.out.print(String.format("%.2f",facture.getMontantLocation()) + " $\n" +

                "Montant de l'assurance                     " + String.format("%.2f",
                facture.getMontantAssurance()) +" $\n" +
                "Sous-total                                 " + String.format("%.2f",
                facture.getSousTotalFacture()) + " $\n" +
                "Montant TPS                                " + String.format("%.2f",
                facture.getMontantTPS()) + " $\n" +
                "Montant TVQ                                " + String.format("%.2f",
                facture.getMontantTVQ()) + " $\n" +
                "montant total                              " + String.format("%.2f",
                facture.getTotalFacture()) + " $\n\n" +
                "        -----------------------------------------\n");

        if (facture.getMontantRabais() > 0) {

            System.out.print("         "+ MSGE_RABAIS +
                    String.format("%.2f", facture.getMontantRabais()) + " $\n" +
                    "        -----------------------------------------\n");
        }
        System.out.print("              " + MGE_REMERCIEMENT +"\n");
    }
}
