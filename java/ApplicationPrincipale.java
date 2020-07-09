import java.time.LocalDateTime;
/**
 * Classe ApplicationPrincipale contient les méthodes d’affichage de menus,
 * de saisies et de validations. Également elle contient la méthode "main".
 *
 * Nom : Loïc André
 * Code Permanent : ANDL10058801
 * Cours : INF1120 Programmation I
 * Groupe : 10
 * @version 20/04/20
 *
 */
public class ApplicationPrincipale {


    final static String BIENVENUE = "" +
            "                                *******************\n" +
            "                                *    BIENVENUE    *\n" +
            "                                *******************";

    final static String RESUME = "Ce programme permet de saisir, calculer et afficher la facturation " +
            "pour la location de voitures\nélecriques et hybrides ainsi que de comptabiliser le" +
            " nombre total de location par type de voiture.\n\n";


    final static char TYPE_H = 'H';
    final static char TYPE_E = 'E';
    final static  char TYPE_E_MIN = 'e';

    final static char GDR_P = 'P';
    final static char GDR_P_MIN = 'p';
    final static char GDR_I = 'I';
    final static char GDR_I_MIN = 'i';
    final static char GDR_G = 'G';
    final static char GDR_G_MIN = 'g';

    final static float PRIX_PETITE_H   = 25.99f;
    final static float PRIX_INTER_H    = 30.99f;
    final static float PRIX_GRANDE_H   = 35.99f;
    final static float PRIX_PETITE_E   = 20.95f;
    final static float PRIX_INTER_E    = 26.96f;
    final static float PRIX_GRANDE_E   = 31.95f;

    final static float ASSUR_PETITE_H  = 5.25f;
    final static float ASSUR_INTER_H   = 7.70f;
    final static float ASSUR_GRANDE_H  = 8.25f;
    final static float ASSUR_PETITE_E  = 4.05f;
    final static float ASSUR_INTER_E   = 5.45f;
    final static float ASSUR_GRANDE_E  = 6.15f;


    final static int JOURS_LOC_MIN = 1;
    final static int JOURS_LOC_MAX = 31;
    final static int OPTION_MENU_MIN = 1;
    final static int OPTION_MENU_MAX = 3;
    final static int CHAR_MIN_NOM_PRENOM = 2;
    final static int CHAR_MAX_NOM_PRENOM = 25;
    final static int LONG_NUM_TEL = 12;
    final static int LONG_NUM_PERMIS = 15;
    final static int LONG_PLAQUE_IMMA = 7;
    final static int LONG_NUM_CARTE_C = 19;

    final static String REPONSE_OUI = "O";
    final static String REPONSE_NON = "N";

    final static int BORNE_INF_LETTRE_MAJ = 'A';
    final static int BORNE_SUP_LETTRE_MAJ = 'Z';


    final static String OPTION_MENU = "" +
            " ----------------------------------------------------------\n" +
            "|                   MENU PRINCIPAL                         |\n" +
            " ----------------------------------------------------------\n"+
            "1. Facturer la location d'une voiture\n" +
            "2. Afficher le nombre de voiture louées par type et par grandeur de voiture\n" +
            "3. Afficher le nombre de voitures disponibles pour la location par type et par grandeur de voiture\n"+
            "4. Quitter le programme\n";

    final static String OPTION_MENUE_1 = "\n" +
            " ----------------------------------------------------------\n" +
            "|                   FACTURER UNE LOCATION                  |\n" +
            " ----------------------------------------------------------\n" ;

    final static String OPTION_MENU_2 = "\n"+
            " ----------------------------------------------------------\n" +
            "|          AFFICHER LE NOMBRE DE VOITURES LOUÉES           |\n" +
            " ----------------------------------------------------------\n\n";

    final static String OPTION_MENU_3 = "" +
            " ----------------------------------------------------------\n" +
            "|                   QUITTER LE PROGRAMME                   |\n" +
            " ----------------------------------------------------------\n";

    final static String MESSAGE_FIN = "\nFIN DU PROGRAMME, MERCI ET A BIENTÔT\n";



    /*********************************************************************
     *   Ajoutez toutes les méthodes "static" et "public" définies dans 
     *   le travail pratique 2 pour l'affichage des menus, les saisies et
     *   les validations données.
     *********************************************************************/


    /**
     * Cette methode affiche un message de bienvenue
     */
    public static void afficherMessageBienvenue(){
        System.out.println(BIENVENUE);
    }


    /**
     * Cette methode affiche un bref résumé de ce que le programme fait
     */
    public static void afficherResumeProgramme(){ System.out.print(RESUME); }


    /**
     *Cette methode affiche le menu des option principale
     *
     */
    public static void afficherMenu(){
        System.out.print(OPTION_MENU + "\n");
    }


    /**
     * Cette methode saisi, valide et retourn l'option choisi dans le menu principal
     *
     * @return choixMenu
     */
    public static int saisirChoixMenu(){

        int choixMenu;

        System.out.println("Entrez votre choix : ");
        choixMenu = Clavier.lireIntLn();

        while (choixMenu < OPTION_MENU_MIN || choixMenu > OPTION_MENU_MAX){
            System.out.println("Erreur l'option choisi est invalide.\nVeuillez recommencer :");
            choixMenu = Clavier.lireIntLn();
        }
        return choixMenu;
    }


    /**
     * Cette methode saisi, valide et retourne le nom du locataire
     *
     * @return nomLocataire
     */
    public static String saisirNomLocataire(){

        String nomLocataire;

        System.out.println("\nSaisissez votre nom (entre 2 et 25 caractères) :");
        nomLocataire = Clavier.lireString();

        while (nomLocataire.length() < CHAR_MIN_NOM_PRENOM || nomLocataire.length() > CHAR_MAX_NOM_PRENOM){
            System.out.println("\nLe nom est invalide!\nVeuillez recommencer : ");
            nomLocataire = Clavier.lireString();
        }

        String carNom = ""+ nomLocataire.charAt(0);
        carNom = carNom.toUpperCase();
        nomLocataire = carNom + nomLocataire.substring(1);

        return nomLocataire;
    }


    /**
     * Cette methode saisi, valide et retourne le prénom du locataie
     *
     * @return prenomLocataire
     */
    public static String saisirPrenomLocataire(){

        String prenomLocataire;

        System.out.println("\nsaisissez votre prenom (entre 2 et 25 caractère) : ");
        prenomLocataire = Clavier.lireString();

        while (prenomLocataire.length() < CHAR_MIN_NOM_PRENOM || prenomLocataire.length() > CHAR_MAX_NOM_PRENOM){
            System.out.println("\nLe prenom saisi est ivalide!\nVeuillez recommencer : ");
            prenomLocataire = Clavier.lireString();
        }

        String carPrenom = ""+ prenomLocataire.charAt(0);
        carPrenom = carPrenom.toUpperCase();
        prenomLocataire = carPrenom + prenomLocataire.substring(1);

        return prenomLocataire;
    }


    /**
     * cette methode saisi. valide et retourne le numéro de téléphone du locataire
     *
     * @return numTel
     */
    public static String saisirNumTel(){
        String numTel;

        System.out.println("\nVeuillez saisir votre numéro de téléphone (000-000-0000) :");
        numTel = Clavier.lireString();

        while (!validerNumTel(numTel)){
            System.out.println("\nLe numéro de téléphone saisi est invalide!\nVeuillez recommencer :");
            numTel = Clavier.lireString();
        }
        return numTel;
    }


    /**
     * cette methode permet de valider la saisie du numéro de téléphone
     * @param numTel
     * @return
     */
    public static boolean validerNumTel(String numTel){

        boolean estValide = true;

        for (int i = 0; i< numTel.length();i++){

            if (numTel.charAt(i) < '0'|| numTel.charAt(i) > '9'){

                if(numTel.charAt(i) == '-'){

                    if (i != 3 && i != 7){ estValide = false; }
                }

                else { estValide = false; }
            }
        }

        if(numTel.length() != LONG_NUM_TEL){ estValide = false;}

        return estValide;
    }



    /**
     * Cette methode saisi, valide et retourne le muméro de permis de conduire du locataire
     *
     * @return numPermis
     */
    public static String saisirNumPermis(){
        String numPermis;

        System.out.println("\nVeuillez saisir votre numéro de permis de conduire (A0000-000000-00): ");
        numPermis = Clavier.lireString();

        while (!validerNumPermis(numPermis)){

            System.out.println("\nLe numéro de permis de conduire est invalide !\nVeuillez recommencer : ");
            numPermis = Clavier.lireString();
        }

        return numPermis;
    }


    /**
     * Cette méthode permet de valider la saisie du numero de permis de conduire
     * @param numPermis
     * @return boolean estValide
     */
    public static boolean validerNumPermis(String numPermis){

        boolean estValide = true;

        for (int i = 0; i< numPermis.length(); i++) {

            if (numPermis.charAt(i) >= BORNE_INF_LETTRE_MAJ &&
                    numPermis.charAt(i) <= BORNE_SUP_LETTRE_MAJ) {

                if (i != 0) { estValide = false; }

            }

            else if (numPermis.charAt(i) >= '0' && numPermis.charAt(i) <= '9') {

                if(i == 0 || i == 5 || i == 12 ) { estValide = false; }
            }

            else if (numPermis.charAt(i) == '-') {

                if (i != 5 && i != 12) { estValide = false; }
            }

            else{ estValide = false; }
        }

        if(numPermis.length() != LONG_NUM_PERMIS){ estValide = false;}

        return estValide;
    }



    /**
     * Cette methode saisi, valide et retoune le type de voiture choisi pour la location
     *
     * @return typeVoiture
     */
    public static char saisirTypevoiture() {

        char typeVoiture;

        System.out.println("\nSaisissez le type de voiture choisi (H/h pour Hyibride et E/e pour électrique) :");
        typeVoiture = Clavier.lireCharLn();

        while (typeVoiture != 'h' && typeVoiture != 'H' && typeVoiture != 'e' && typeVoiture != 'E') {
            System.out.println("\nLe type de voiture est invalide !\nVeuillez recommencer :");
            typeVoiture = Clavier.lireCharLn();
        }


        String majusculue = (typeVoiture + "").toUpperCase();
        typeVoiture = majusculue.charAt(0);

            return typeVoiture;
    }


    /**
     * Cette methode saisi, valide et retourne la grandeur de la voiture à louer
     *
     * @return grandeurVoiture
     */
    public static char saisirGrandeurVoiture(){

        char grandeurVoiture;

        System.out.println("\nSaisissez la grandeur de la voiture\nP/p pour petite, I/i pour intermediaire, " +
                "G/g pour grande : ");
        grandeurVoiture = Clavier.lireCharLn();

        while (grandeurVoiture != GDR_G && grandeurVoiture != GDR_G_MIN && grandeurVoiture != GDR_I &&
                grandeurVoiture != GDR_I_MIN && grandeurVoiture != GDR_P &&  grandeurVoiture != GDR_P_MIN){

            System.out.println("\nLa grandeur de la voiture est invalide !\nRecommencez :");
            grandeurVoiture = Clavier.lireCharLn();
        }

        String carMajuscule = (grandeurVoiture + "").toUpperCase();
        grandeurVoiture = carMajuscule.charAt(0);
        return grandeurVoiture;
    }


    /**
     * cette methode saisi, valide et retourne le numéro de plaque d'immatriculation de la voiture a louer
     *
     * @return numPlaqueImm
     */
    public static String saisirNumPlaqueImm(){

        String numSaisi;

        System.out.println("\nSaisissez le numero de la plaque d'immatriculation (format \"000 AAA\") : ");
        numSaisi = Clavier.lireString();

        while (!validerNumPlaque(numSaisi)){

            System.out.println("\nLe numéro de la plaque d'immatriculation est invalide ! \nRecommencez : ");
            numSaisi = Clavier.lireString();
        }

        return numSaisi;
    }


    /**
     * Cette methode permet de valider la saisie de la plaque d'immatriculation
     * @param numPlaque
     * @return boolean estValide
     */
    public static boolean validerNumPlaque(String numPlaque){
        boolean estValide = true;

        for (int i = 0; i < numPlaque.length(); i++){

            if(numPlaque.charAt(i) >= BORNE_INF_LETTRE_MAJ && numPlaque.charAt(i) <= BORNE_SUP_LETTRE_MAJ ){

                if(i != 4 && i != 5 && i != 6){ estValide = false; }
            }

            else if(numPlaque.charAt(i) >= '0' && numPlaque.charAt(i) <= '9'){

                if(i != 0 && i != 1 && i != 2){ estValide = false; }
            }

            else if (numPlaque.charAt(i) == ' '){

                if(i != 3){ estValide = false; }
            }

            else { estValide = false; }
        }

        if(numPlaque.length() != LONG_PLAQUE_IMMA){ estValide = false; }

        return estValide;
    }



    /**
     * Cette methode saisi, valide et retourne le nombre de jours de location
     *
     * @return nbrJoursLocation
     */
    public static int saisirNbrJoursLocation(){
        int nbrJoursLocation;

        System.out.println("\nSaisissez le nombre de jours de location (entre 1 et 31 inclusivement) :");
        nbrJoursLocation = Clavier.lireIntLn();

        while (nbrJoursLocation < JOURS_LOC_MIN || nbrJoursLocation > JOURS_LOC_MAX){
            System.out.println("\nLe nombre de jours saisi est invalide !\nRecommencez : ");
            nbrJoursLocation = Clavier.lireIntLn();
        }
        return nbrJoursLocation;
    }


    /**
     * Cette methode saisi, valide et retourne le type de carte de crédit du locataire
     *
     * @return typeCarteCredit
     */
    public static char saisirTypeCarteCredit(){

        char typeCarteCredit;

        System.out.println("\nSaisissez votre type de carte de crédit,\nV pour visa, M pour Master Card : ");
        typeCarteCredit = Clavier.lireCharLn();

        while(typeCarteCredit != 'v' && typeCarteCredit != 'V' &&
                typeCarteCredit != 'm' && typeCarteCredit != 'M'){

            System.out.println("Le type de carte de crédit est invalide !\nRecommencez :");
            typeCarteCredit = Clavier.lireCharLn();
        }

        return typeCarteCredit;
    }


    /**
     * Cette methode saisi, valide et retourne le numéro de carte de crédit du locataire
     *
     * @return numCarte
     */
    public static String saisirNumCarte(){
        String numCarte;

        System.out.println("\nSaisissez votre numéro de carte de crédit à 16 chiffres," +
                "\n(format 1111 1111 1111 1111) :");
        numCarte = Clavier.lireString();

        while(!validerNumCarteC(numCarte)){

            System.out.println("\nLe numéro de la carte de crédit est invalide !\nRecommencez : ");
            numCarte = Clavier.lireString();
        }
        numCarte = "XXXX XXXX XXXX" + numCarte.substring(14);
        return numCarte;
    }


    /**
     * Cette methode permet de valider la saisie du numero de la carte de crédit
     * @param numCarte
     * @return
     */
    public static boolean validerNumCarteC(String numCarte){
        boolean estValide = true;

        for(int i = 0; i < numCarte.length(); i++){

            if(numCarte.charAt(i) >= '0' && numCarte.charAt(i) <= '9'){

                if(i == 4 || i == 9 || i == 14){ estValide = false; }
            }

            else if(numCarte.charAt(i) == ' '){

                if(i != 4 && i != 9 && i != 14){ estValide = false; }
            }

            else{ estValide = false; }
        }

        if(numCarte.length() != LONG_NUM_CARTE_C){ estValide = false; }

        return estValide;
    }



    /**
     * Cette methode saisi, valide et retourne "O" si le locataire possède une assurance et
     * "N" dans le cas contraire
     *
     * @return possedeAssurance
     */
    public static String saisirQuestionAssurance(){

        String possedeAssurance;

        System.out.println("\nPossdez-vous une assurance auto personnelle? (O/N) :");
        possedeAssurance = Clavier.lireString();

        while(!possedeAssurance.equals(REPONSE_NON) && !possedeAssurance.equals("n") &&
                !possedeAssurance.equals(REPONSE_OUI) && !possedeAssurance.equals("o")){

            System.out.println("\nLa réponse est invalide !\nRecommencez :");
            possedeAssurance = Clavier.lireString();
        }
        possedeAssurance = possedeAssurance.toUpperCase();
        return possedeAssurance;
    }


    /**
     * Cette methode prend en parametre le type de voiture et la grandeur de la voiture
     * et retourne le prix de la
     * location par jour
     * @param typeVoiture
     * @param grandeurVoiture
     *
     * @return prixLocParJour
     */
    public static float determinerPrixLocation(char typeVoiture, char grandeurVoiture){
        float prixLocParJour = 0;

        switch (typeVoiture){

            case TYPE_E :

                switch (grandeurVoiture){

                    case GDR_P :
                        prixLocParJour = PRIX_PETITE_E;
                        break;

                    case GDR_I :
                        prixLocParJour = PRIX_INTER_E;
                        break;

                    case GDR_G :
                        prixLocParJour = PRIX_GRANDE_E;
                        break;
                }

            case TYPE_H :

                switch (grandeurVoiture){

                    case GDR_P :
                        prixLocParJour = PRIX_PETITE_H;
                        break;

                    case GDR_I :
                        prixLocParJour = PRIX_INTER_H;
                        break;

                    case GDR_G :
                        prixLocParJour = PRIX_GRANDE_H;
                        break;
                }
        }
        return prixLocParJour;
    }


    /**
     * Cette methode prend en parametre le type et la grandeur de la voiture et retourne le prix
     * de l'assurance par jour correspondant
     *
     * @param typeVoiture
     * @param grandeurVoiture
     *
     * @return assuranceParJour
     */
    public static float determinerPrixAssurance(char typeVoiture, char grandeurVoiture){

        float assuranceParJour = 0;

       switch (saisirQuestionAssurance()){

           case "N":
               switch (typeVoiture) {

                   case TYPE_E:

                      switch (grandeurVoiture) {

                          case GDR_P:
                              assuranceParJour = ASSUR_PETITE_E;
                              break;

                          case GDR_I:
                              assuranceParJour = ASSUR_INTER_E;
                              break;

                          case GDR_G:
                             assuranceParJour = ASSUR_GRANDE_E;
                             break;
                      }
                      break;

                   case TYPE_H:
                       switch (grandeurVoiture) {

                           case GDR_P:
                               assuranceParJour = ASSUR_PETITE_H;
                               break;

                           case GDR_I:
                               assuranceParJour = ASSUR_INTER_H;
                               break;

                           case GDR_G:
                               assuranceParJour = ASSUR_GRANDE_H;
                               break;
                       }
                       break;
               }
               break;
       }
        return assuranceParJour;
    }


    /**
     * Retourne la date et l'heure du systeme
     * @return
     */
    public static LocalDateTime determinerDateHeureDebut(){

        LocalDateTime dateHeure = LocalDateTime.now();

        return dateHeure;
    }


    /**
     * Retourne la date de début de location additionné du nombre de jours de location
     * ainsi que l'heure du systeme
     * @param nbrJourLocation
     * @return
     */
    public static LocalDateTime determinerDateHeureFin(int nbrJourLocation){

        LocalDateTime dateHeure = LocalDateTime.now();
        dateHeure = dateHeure.plusDays(nbrJourLocation);

        return dateHeure;
    }


    /**
     * Cette methode affiche le nombre total de vehicule louées ainsi que par type de vehicule.
     *
     *
     * */
    public static void afficherVoituresLoue(){

        System.out.println("                " + LocationVoiture.NOM_CIE  + "\n\n" +
                "Date et Heure : " + determinerDateHeureDebut().format(LocationVoiture.formatter)  + "\n" +
                LocationVoiture.ADDRESS_CIE + "                   " + LocationVoiture.TEL_CIE + "\n" +
                "-----------------------------------------------------------------------\n" +
                "Type de voiture louée                       Nombre de voitures louées\n" +
                "   " + VoitureLouee.TYPE_HYBRIDE + "                                             " +
                VoitureLouee.voitureHybrideLouee + "\n" +
                "   " + VoitureLouee.TYPE_ELEC + "                                          " +
                VoitureLouee.voitureElecLouee + "\n\n" +
                "         --------------------------------------------\n" +
                "           Le nombre total de voitures louées est " +
                (VoitureLouee.voitureElecLouee + VoitureLouee.voitureHybrideLouee));
    }




    /**
     * Cette methode affiche un message d'invitation a taper la touche << ENTRER >> pour revenir
     * au menu principal et saisi la touche
     */
    public static void revenirMenu(){

        System.out.print("\nTapez la touche << ENTRER >>  pour revenir au menu principal");
        Clavier.lireFinLigne();
        System.out.println();
    }


    /**
     * Cette methode prend en parametre le chiffre correspondant à l'option du menu choisi et
     * affiche le nom du menu
     * @param optionMenu
     */
    public static void afficherSousMenu(int optionMenu){

        switch (optionMenu){

            case 1 :
                System.out.print(OPTION_MENUE_1);
                break;

            case 2 :
                System.out.print(OPTION_MENU_2);
                break;

            case 3 :
                System.out.print(OPTION_MENU_3);
                break;
        }
    }



    /**
     * @param args
     */
    public static void main(String[] args) {

        // Déclaration des variables locales
        boolean sortie;
        int choixMenu;

        // informations de la voiture louée
        char typeVoiture;
        char grandeur;
        String numeroPermisConduire;

        // informations de la carte de crédit
        char typeCarteCredit;
        String numeroCarteCredit;

        // informations du locataire
        String nomLocataire;
        String prenomLocataire;
        String numeroTelephone;
        String numeroImmatriculation;

        // informations de la facture
        float prixLocation;
        float prixAssurance;

        // informations de la location de voiture
        int nombreJoursLocation;
        LocalDateTime dateHeureDebut;
        LocalDateTime dateHeureFin;

        // Les objets à créer
        VoitureLouee voitureLoue;
        Locataire locataire;
        Facture facture;
        LocationVoiture locationVoiture;
        CarteCredit carteCredit;

        // Initialisation des variables
        sortie = false;
        choixMenu = 0;




        /***************************************************
         *                Début du programme
         **************************************************/


        // Affichage du message de bienvenue
        afficherMessageBienvenue();

        // Affichage résumé du programme
        afficherResumeProgramme();


        do {

            // Affichage du menu d'options et sous-menu
            afficherMenu();
            choixMenu = saisirChoixMenu();
            afficherSousMenu(choixMenu);


            switch (choixMenu) {

            case 1 :
                // Appele des méthode de saisie
                nomLocataire = saisirNomLocataire();
                prenomLocataire = saisirPrenomLocataire();
                numeroTelephone = saisirNumTel();
                numeroPermisConduire = saisirNumPermis();
                typeVoiture = saisirTypevoiture();
                grandeur = saisirGrandeurVoiture();
                numeroImmatriculation = saisirNumPlaqueImm();
                nombreJoursLocation = saisirNbrJoursLocation();
                typeCarteCredit = saisirTypeCarteCredit();
                numeroCarteCredit = saisirNumCarte();


                // Création  des objets VoitureLoue, CarteCredit, et Locataire,
                voitureLoue = new VoitureLouee(typeVoiture, grandeur, numeroImmatriculation);
                carteCredit = new CarteCredit(typeCarteCredit, numeroCarteCredit);
                locataire = new Locataire(prenomLocataire, nomLocataire, numeroTelephone,
                        numeroPermisConduire, carteCredit);


                // Détermination du prix de la location et de l'assurance par jour de la voiture
                prixLocation = determinerPrixLocation(typeVoiture, grandeur);
                prixAssurance = determinerPrixAssurance(typeVoiture, grandeur);


                // Création de l'objet facture
                facture = new Facture(prixLocation, prixAssurance);


                // Appele des méthodes de l'objet facture pour le calcule des montants de la location et
                // de l'assurance, le rabais, le sous-total, les montants de TPS, de TVQ, et le total.
                facture.calculerMontantLocation(nombreJoursLocation);
                facture.calculerMontantAssurance(nombreJoursLocation);
                facture.CalculerRabais(typeVoiture, grandeur, nombreJoursLocation);
                facture.calculerSousTotalFacture();
                facture.calculerMontantTPS();
                facture.calculerMontantTVQ();
                facture.calculerTotalFacture();


                // Déterminer les dates / heures du début et de la fin de la location,
                dateHeureDebut = determinerDateHeureDebut();
                dateHeureFin = determinerDateHeureFin(nombreJoursLocation);


                //créez l'objet LocationVoiture
                locationVoiture = new LocationVoiture(nombreJoursLocation, dateHeureDebut, dateHeureFin,
                        locataire, voitureLoue, facture);


                // Afficher les informations de la location de la voiture incluant la facture
                locationVoiture.afficherFacture(dateHeureDebut, dateHeureFin, locataire, voitureLoue, facture);
                revenirMenu();
                break;


            case 2 :
                // Afficahge du nombre de voitures louées par type de voiture.
                afficherVoituresLoue();
                revenirMenu();
                break;


            case 3 :

              // Appelez votre méthode d'affichage du message
                System.out.print(MESSAGE_FIN);
                sortie = true;
            }
        } while (!sortie);
    }
}
