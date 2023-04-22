
##**README SERENITY WEB TRAINING**
```
./gradlew clean test -Pwebdriver.driver=firefox -Denvironmeent=staging
```
##**Run tests with gradle:**

```
./gradlew clean test
```

To run tests in Firefox:

```
./gradlew clean test -Dwebdriver.driver=firefox
```

In windows:
```
gradlew clean test
```

##**Run tests with Maven:**

```
mvn clean verify -Ddriver=firefox
```
or try this:

```
mvn clean verify -Dwebdriver.driver=firefox
```

