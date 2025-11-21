#!/bin/bash
mkdir -p bin
find src -name "*.java" | xargs javac -d bin
cp -r src/main/resources/* bin/
java -cp bin com.legends.Main
