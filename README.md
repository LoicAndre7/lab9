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
Installer le paquet serveur Apache, PHP, MySQL qui correspond votre machine :
- [MAMP pour Windows et MAC](https://www.mamp.info/en/mamp/windows/)
- [LAMP pour linux (ubuntu)](https://ubuntu.com/server/docs/lamp-applications)

Création de la base de donnée :  
1. Se connecter à mysql depuis votre terminal avec les droits root  
2. Lancer le fichier scriptSQL.sql : ``` mysql> source chemin_du_fichier_Script.sql```

### Liens utiles
+ [Calendrier du projet](https://calendar.google.com/calendar/u/0?cid=MW80dm5rYTJ2M2U0amtiMW81aDhsZHNxajhAZ3JvdXAuY2FsZW5kYXIuZ29vZ2xlLmNvbQ)
+ [Documentation mandat](https://drive.google.com/drive/folders/1FrXC_YmL6FNUVEj0qr2Toi7Ssth-p52p?usp=sharing)
+ [Compte rendu des rencontres](https://docs.google.com/document/d/19LNOsKly7Fvz6T6qtlRWqnrli2xr52PBQkL-vL6xTsg/edit?usp=sharing)

### Licence
<a rel="license" href="http://creativecommons.org/licenses/by-nc/4.0/"><img alt="Creative Commons Licence" style="border-width:0" src="https://i.creativecommons.org/l/by-nc/4.0/88x31.png" /></a><br />Cette œuvre est mise à disposition selon les termes de la <a rel="license" href="http://creativecommons.org/licenses/by-nc/4.0/">Creative Commons Attribution-NonCommercial 4.0 International License</a>.

