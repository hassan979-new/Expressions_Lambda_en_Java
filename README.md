
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

### Première expression lambda simple :
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/d5dab4fd-6621-4604-9ca3-43fcfae4958c" />
### Utiliser les interfaces du package java.util.function
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/a180a8db-93cc-4366-9aa0-6c6e099bf478" />
### Interfaces fonctionnelles pour types primitifs
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/0fcfb3de-4513-40cd-b89f-3fab5c9dc78b" />
### Différentes syntaxes de lambda
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/2f35e735-0706-4dcd-ad9e-b0bd55105b9c" />
### Capture de variables
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/03c994ca-68c6-4fb0-847f-ed31529d701e" />
### Utiliser les références de méthodes
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/48bec033-99d2-4f10-952c-542fcd35afae" />
### Utiliser l'API Stream avec des lambdas
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/e925e7e7-39f9-401f-bb18-db434f14b0e8" />
### Opérations avancées avec Stream
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/af6a4551-c087-4e6a-af7d-ab05bbd2056b" />
### Composer des fonctions
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/7daa952a-0266-4375-8061-d48de7dcce85" />
### Gérer les exceptions dans les lambdas
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/c15d8a74-289d-470b-8eff-69855099b858" />
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/668def8f-784f-47cf-812d-2fcfcbdd8fcc" />
### Validation de formulaire
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/45e982ff-1c63-4e84-9cd8-1f5e81d6d247" />
### Implémentation de TriFunction
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/9004a4df-6d01-4a7a-b790-a2f47c9f0912" />
### Comptage de TODO dans des fichiers Java
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/8f3455ca-05ad-4826-8241-d9afca027273" />
### Comparateur composé
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/3abb3cce-f9d9-4602-9e63-03149f4899c1" />
### Factorielle avec IntStream
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/4951fa06-8823-4fa9-b258-19b719ff265d" />
### Memoizer générique
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/377b547f-2c14-4868-b92e-df5ff03ba666" />
- <img width="437" height="504" alt="image" src="https://github.com/user-attachments/assets/22635dae-fb3f-41c3-9885-31f56ebdeac0" />
- <img width="437" height="504" alt="image" src="https://github.com/user-attachments/assets/b5e5934a-36a8-4290-8b11-0ed4b210e13d" />

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
