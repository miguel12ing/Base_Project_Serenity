<em># bbog-pb-automation-testing </em>

Repositorio para la automatización de FrontEnd para el producto de Banca virtual del Banco de Bogotá.

## Prerequisitos :pencil:

Es necesario para la ejecucion del proyecto contar con las siguientes herramientas instaladas.

* [Gradle](https://gradle.org/)
* [Java](https://www.oracle.com/co/java/technologies/javase/jdk11-archive-downloads.html)
* [Git](http://git-scm.com/)

Teniendo en cuenta que en el IDE de preferencias se debe tener instalado los siguientes plugins:

1. [x] **JUnit**
2. [x] **Cucumber for Java**
3. [x] **Gherkin**
4. [x] **Lombok**

## Construido con 🛠️

Las tecnologías utilizadas en el proyecto son:

* [Serenity BDD](https://serenity-bdd.github.io/theserenitybook/latest/index.html)
* [Cucumber](https://cucumber.io/)
* [JUnit](https://junit.org/junit4/)
* [Screen Play](https://serenity-js.org/handbook/thinking-in-serenity-js/screenplay-pattern.html)
* [Java](https://www.oracle.com/co/java/technologies/javase/jdk11-archive-downloads.html)
* [Gradle](https://gradle.org/)


## La estructura de los directorios del proyecto
El proyecto tiene scripts de compilación para Gradle y sigue la estructura de directorios estándar utilizada en la mayoría de los proyectos de Serenity:

```Gherkin
src             
  + main                                  | Source main
    + java                                | Test runners and supporting code
    + co.com.bdb.automation               | Package base     
      + model                             | DTOs, Pojos, VOs, etc ...
      + utils                             | General utility class  
      + task                              | High level actions
      + questions                         | Asserts
      + exceptions                        | Error handling                                     
      + test                              |
    + java                                | Test runners and supporting code
    + co.com.bdb.automation               | Package base
      + Steps                             | Steps set
        + {feature_name}                  | Feature name
          + common                        | Definition of Hooks
          + steps                         | Utility class for definition steps
        + {feature_name}Definition.java   | Definition class 
      + Runners                           | Main class
    + resources                           |
      + features                          | Feature files
          + {feature_name}                 | Feature file  specific
             {feature_name}.feature        |
      + serenity.conf                     | Config file for Serenity
serenity.properties                       | General properties Serenity
sonar-project-custom.properties           | General properties Sonar
```


```bash
./gradlew clean test aggregate
```
Los resultados de las pruebas se registrarán en el directorio `target/site/serenity`.
