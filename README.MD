
##**README SERENITY WEB**
```
./gradlew clean test -Pwebdriver.driver=firefox -Denvironmeent=staging
```
##**Run tests with gradle:**

```
./gradlew clean test
```
## or 

To run tests in Firefox:

```
./gradlew clean test -Pwebdriver.driver=firefox -Denvironmeent=staging
```

##**Run tests with Maven:**

```
mvn clean verify -Ddriver=firefox
```
or try this:

```
mvn clean verify -Dwebdriver.driver=firefox
```

## Validado en ambiente de macOs