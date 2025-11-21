#!/bin/bash
rm -r bin && mkdir -p bin
javac -d bin -sourcepath src/main/java src/main/java/com/legends/Main.java
cp -r src/main/resources/* bin/
java -cp bin com.legends.Main
