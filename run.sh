#!/bin/bash
mkdir -p bin
javac -d bin @sources.txt
cp -r src/main/resources/* bin/
java -cp bin com.legends.Main
