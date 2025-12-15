
# 🧮 CRUD avec DAO Générique
## Description
Ce projet illustre la conception d’une application Java orientée objet et fonctionnelle:

- Utilisation des expressions lambda et des interfaces fonctionnelles.

- Manipulation des Streams API pour filtrer, transformer et agréger des données.

- Composition de fonctions et de prédicats.

- Gestion des exceptions dans les lambdas.

- Validation dynamique de formulaires avec règles génériques.

- Optimisation des calculs avec memoization.

- Exemples pratiques : calcul de factorielle, compteur de TODO, comparateurs composés.
## Project Structure
```
projets/
├── Etaps/
│   └── src/
│       └── com/exemple/tp/
│           ├── LambdaIntro.java
│           ├── InterfacesFonctionnelles.java
│           ├── InterfacesPrimitives.java
│           ├── SyntaxeLambda.java
│           ├── CaptureLambda.java
│           ├── ReferencesMethodes.java
│           ├── StreamBasics.java
│           ├── StreamAvance.java
│           ├── CompositionFonctions.java
│           ├── ExceptionsLambda.java
│           ├── ValidationFormulaire.java
│           ├── TriFunctionDemo.java
│           ├── CompteurTODO.java
│           ├── ComparateurCompose.java
│           ├── FactorielleStream.java
│           └── Memoizer.java
└── README.md
```
### 1. Expressions Lambda
LambdaIntro, SyntaxeLambda, CaptureLambda : démonstration de la syntaxe, capture de variables locales et de this.

### 2. Interfaces Fonctionnelles
InterfacesFonctionnelles, InterfacesPrimitives : usage des interfaces Predicate, Consumer, Function, Supplier, et leurs variantes primitives.

TriFunctionDemo : interface personnalisée TriFunction avec composition (andThen).

### 3. Références de Méthodes
ReferencesMethodes : références à méthodes statiques, d’instance, constructeurs et tableaux.

### 4. Stream API
StreamBasics : opérations de base (filter, map, count).

StreamAvance : regroupement (groupingBy), agrégats (average, max), filtrage et transformation.

### 5. Composition
CompositionFonctions : composition de Function (andThen, compose) et de Predicate (and, or, negate).

### 6. Exceptions
ExceptionsLambda : interface fonctionnelle IOFunction pour gérer les exceptions checked dans les lambdas.

### 7. Validation
ValidationFormulaire : validateur générique basé sur des règles (Predicate<T> + message d’erreur).

## 8. Utilitaires
CompteurTODO : parcours des fichiers .java et comptage des occurrences de TODO.

ComparateurCompose : comparateurs composés avec Comparator et tri multi-critères.

FactorielleStream : calcul de la factorielle en version impérative et fonctionnelle (IntStream).

Memoizer : optimisation des calculs avec ConcurrentHashMap et Function<T,R>.
## 🖥️ Example Execution

### TestApp :

## 💡 Concepts Practiced

- Syntaxe et capture des lambdas.

- Utilisation des interfaces fonctionnelles standard et personnalisées.

- Manipulation des Streams API pour le traitement de collections.

- Composition de fonctions et prédicats.

- Gestion des exceptions checked dans les lambdas.

- Validation générique et extensible avec Predicate.

- Optimisation des calculs avec memoization.

- Exemples pratiques pour renforcer la compréhension.
## 🧑‍💻 Author

- 👤 Agouram Hassan
- 🏫 Programmation orientée objet : java
- 🎓 Instructor	Mr.LACHGAR
- 📅 16 décembre 2025
