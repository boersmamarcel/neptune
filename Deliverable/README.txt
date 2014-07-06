Voor het valideren, compileren en uitvoeren van een Neptune programma dient de Neptune compiler gebruikt te worden. Deze is meegeleverd als Neptune.jar, hieronder staan een aantal voorbeelden van hoe de Neptune compiler gebruikt kan worden. Let op: u dient zich in dezelfde folder te bevinden als deze README.txt tijdens het uitvoeren van deze instructies.

============================================================

java -jar Neptune.jar validate samples/helloworld.npt
Voorbeeld commando voor het valideren van een Neptune programma uit samples/helloworld.npt

java -jar Neptune.jar compile samples/helloworld.npt
Voorbeeld commando voor het valideren en compileren van een Neptune programma uit samples/helloworld.npt

java -jar Neptune.jar run samples/helloworld.npt
Voorbeeld commando voor het valideren, compileren en uitvoeren van een Neptune programma uit samples/helloworld.npt

============================================================

Uitvoeren van de testsuite:

java -jar TestSuite.jar

============================================================

Compileren van de Neptune compiler vanuit de source:

javac -d bin -sourcepath src -classpath bin/antlr.jar src/neptune/Neptune.java

============================================================

Uitvoeren van de Neptune compiler na compilatie zoals hierboven:

java -classpath "bin/:bin/antlr.jar" neptune.Neptune run samples/helloworld.npt

============================================================

Compileren van de Neptune test suite vanuit de source:

javac -d bin -sourcepath src -classpath "bin/junit.jar:bin/antlr.jar:bin/hamcrest.jar" src/test/FullTest.java

============================================================

Uitvoeren van de Neptune test suite na compilatie zoals hierboven:

java -classpath "bin/:bin/junit.jar:bin/antlr.jar:bin/hamcrest.jar" test.FullTest