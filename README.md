# QUEENDOM - Application d'Apprentissage des Échecs

## Présentation du Projet

QUEENDOM est une application Android éducative sur les échecs, conçue pour introduire les joueurs aux fondamentaux du jeu d'échecs. L'application présente les règles de base, les mouvements des pièces et les stratégies d'ouverture dans une interface simple et intuitive.

## Structure de l'Application

L'application est organisée en plusieurs activités :

- **MainActivity** : Écran d'accueil principal de l'application
- **ReglementActivity** : Présentation des règles fondamentales du jeu d'échecs
- **PionActivity** : Détails sur les mouvements des pièces
- **OuvertureActivity** : Informations sur les stratégies d'ouverture communes

## Caractéristiques Techniques

- **Langage de programmation** : Kotlin
- **Environnement de développement** : Android Studio
- **SDK minimum** : API 34 (Android 14)
- **SDK cible** : API 34
- **Architecture** : Organisation classique avec activités multiples
- **Gestion des images** : Utilisation de Coil pour le chargement des GIFs et Accompanist pour la manipulation des drawables

## Fonctionnalités Actuelles

1. **Présentation du jeu d'échecs** :
   - Introduction au jeu et à son histoire
   - Aperçu des règles de base
   - Information sur l'influence de l'IA dans l'évolution du jeu d'échecs

2. **Section sur les pièces et mouvements** :
   - Explications des mouvements pour chaque pièce
   - Règles spécifiques (comme la promotion des pions, le roque, etc.)

3. **Guide des ouvertures** :
   - Présentation de différentes stratégies d'ouverture :
     - Le Mat du Berger
     - L'ouverture Ruy Lopez (espagnole)
     - La défense française
   - Explications des avantages et inconvénients de chaque approche

## Ressources et Design

- **Palette de couleurs** : 
  - Noir (#FF000000)
  - Blanc (#FFFFFFFF)
  - Marron (#231B20)
  - Crème (#F9E1B7)

- **Thème** : Basé sur Material Design 3 sans barre d'action (NoActionBar)
- **Contenu textuel** : Stocké dans les ressources strings.xml pour faciliter la maintenance et les futures traductions


## État Actuel du Développement

L'application présente une version fonctionnelle qui inclut :
- La navigation entre les différentes sections
- Le contenu informatif sur les échecs
- Un design de base utilisant Material Design


## Installation et Exécution

1. Cloner le dépôt
2. Ouvrir le projet dans Android Studio
3. Synchroniser avec les fichiers Gradle
4. Exécuter l'application sur un émulateur ou un appareil Android (API 34 minimum)

## Fonctionnalités Futures
Voici les améliorations envisagées pour les prochaines versions de l'application :

#### Interface interactive d'échiquier :

Ajout d'un échiquier virtuel où les utilisateurs peuvent déplacer les pièces
Simulation de parties célèbres pour l'apprentissage
Mode pratique pour tester les mouvements légaux des pièces


#### Contenu éducatif avancé :

Section sur les tactiques intermédiaires et avancées
Bibliothèque de problèmes d'échecs à résoudre (puzzles)
Analyses de parties célèbres de l'histoire des échecs


#### Améliorations UI/UX :

Refactorisation avec Jetpack Compose pour une interface plus moderne
Animations plus fluides pour illustrer les mouvements des pièces
Mode sombre/clair et thèmes personnalisables
Support pour différentes tailles d'écran (tablettes, pliables)

## Crédits

Développé par [Dounia Hullot] et [Néha Sougoumar]

Deisgn créé par [Dounia Hullot]
