# Gestionnaire d'établissement scolaire 
#### Objectif du ce projet
Création d'un logiciel de gestion d'établissement scolaire

#### Application Développé sous 
 Spring Boot+ MYSQL + theymelef + JPA +  Bootstarp

## Mode d'emploi
##### Prérequis : Avoir  git et docker installé sur votre ordinateur
Ouvrez un terminal / CMD

Lancer Docker

Cloner le projet :
- git clone https:https://github.com/yamine99/gestionnaireEtablissement.git

Positioner vous à l'interieur du projet clonner
Ensuite lancer ces commandes suivantes :
- docker-compose build
- docker-compose up

Patientez quelques instants.

Ouvrez un navigateur : http://127.0.0.1/

Et voilà votre application est prête à être utilisée.
## Architecture 
 L'application composer de 5 page :

- Page de connexion
- Page d'inscription d'un utilisateur(Directeur/ Responsable)
- Page de création d'un étudiant
- Page de liste d'étudiants

### Backend 
Spring Boot+ MYSQL + theymelef + JPA +
   
### Front
 Bootstrap 5.3.1

## Deployment

Conteneurisation de l'application avec Docker
à l'aide de ces deux fichers : 

- Dcker-compose : Permet de créer et configurer deux services (bdd, application web)
  - bdd
  - application
  

- Dockerfile: Permet de construire l'image Docker de notre application
  - L'image utilisé comme base est maven:3.8.4-openjdk-11
  - Il éxécute ensuite les commandes suivante :
     - RUN mvn clean package spring-boot:repackage
  - Il génere le fichier jar généré via la commande :
    - CMD [ "java", "-jar", "./target/webapp-0.0.1-SNAPSHOT.jar"] 
      











