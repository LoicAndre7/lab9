# lab9# INM5001-COVID19
# Équipe 5


### Membres du projet
+ Yoakim Sébastien (coordinateur), yoakim.sebastien@courrier.uqam.ca
+ André Loïc, andre.loic@courrier.uqam.ca  
+ Faton Mathieu, faton.mathieu@courrier.uqam.ca
+ Lesieur Daniel, lesieur.daniel@courrier.uqam.ca

### Présentation
L'aplication web inm5001-codiv19 permet aux utilisateurs inscrits d'enregistrer leurs déplacements quotidiens(adresses du lieu, dates et heures de la visite) et de déclarer si ils ont été testé positif au covid-19 de manière anonyme.  

Lorsqu'une personne se déclare positive, l'application fait un croisement des données fournis par les usagés sur les 14 derniers jours pour déterminer ceux qui se sont trouvés à proximité de la personne infectée(même lieu, même fenêtre de temps).  

Une fois les personnes à risques identifiés, l'application leurs envois une notification via leur espace client les informant du risque potentiel 
d'infection qu'ils ont et leur adresse les bons comportements à suivre.

### Contenu
+ [Code source](https://gitlab.info.uqam.ca/lesieur.daniel/inm5001-covid19/-/tree/master/codeSource)

### Dépendances
1. Installer le paquet serveur Apache, PHP, MySQL qui correspond votre machine :
  - [MAMP pour Windows et MAC](https://www.mamp.info/en/mamp/windows/)
  - [LAMP pour linux (ubuntu)](https://ubuntu.com/server/docs/lamp-applications)

2. Création de la base de donnée :  
  1. Lancer mysql avec la ligne de commande en mode root  
  2. Exécuter le fichier scriptSQL.sql qui se trouve dans le dossier sql :  
     ```mysql> source cheminDuFichierScript.sql```
  3. Au besoin accorder les privilèges sur la base de donnée créée:  
     ```mysql> GRANT ALL PRIVILEGES ON BD-COVID19.* TO 'votreNomUtilisateur'@'localhost';```


### Configuration

- Renommer au besoin et déplacer le dossier ```codeSource``` dans le répertoir localhost de votre machine.
- Modifier le fichier ```config.php``` qui se trouve dans le dossier ```login```:  
  Renseigner les champs ```'DB_USERNAME'``` et ```'DB_PASSWORD'``` avec ceux de votre compte mysql



### Liens utiles
+ [Calendrier du projet](https://calendar.google.com/calendar/u/0?cid=MW80dm5rYTJ2M2U0amtiMW81aDhsZHNxajhAZ3JvdXAuY2FsZW5kYXIuZ29vZ2xlLmNvbQ)
+ [Documentation mandat](https://drive.google.com/drive/folders/1FrXC_YmL6FNUVEj0qr2Toi7Ssth-p52p?usp=sharing)
+ [Compte rendu des rencontres](https://docs.google.com/document/d/19LNOsKly7Fvz6T6qtlRWqnrli2xr52PBQkL-vL6xTsg/edit?usp=sharing)

### Licence
Copyright &copy; 2020 projet COVID-19 INM5001

