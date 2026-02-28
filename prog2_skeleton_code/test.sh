#!/bin/bash

# Set Normal CLASSPATH
export CLASSPATH=$(pwd)/bin/
export CLASSPATH=$CLASSPATH:$(pwd)/lib/*

# Set CLASSPATH for prog1 solution
# This is if you are using my prog1 solution
export CLASSPATH=$CLASSPATH:$(pwd)/.solution/prog1/*

# Clean up previous build
make clean
mkdir -p ./Parse/antlr_build/Parse

# Generate ANTLR files
java -jar ./lib/antlr-4.13.2-complete.jar \
   -visitor Parse/gParser.g4 \
   -o ./Parse/antlr_build \
  -lib ./Parse/antlr_build/Parse/ -lib ./.solution/prog1/

# Compile the project
find . -name "*.java" > sources.txt
javac -d bin @sources.txt
rm sources.txt


# Run your project on 100 test files
testfiles=($(find ./tests/ -type f))
       echo "################################################################################" > report.txt
       for testfile in "${testfiles[@]}"; do
         # Generate report
         echo "################################################################################" >> report.txt
         cat $testfile >> report.txt
         echo "" >> report.txt
         echo "" >> report.txt
         echo $testfile >> report.txt
          # Print all results to report.txt
         java Parse.ParserDriver $testfile >> report.txt 2>&1
       done


# Run solution on 100 test files
testfiles=($(find ./tests/ -type f))
       echo "################################################################################" > solution_report.txt
       for testfile in "${testfiles[@]}"; do
         # Generate report
         echo "################################################################################" >> solution_report.txt
         cat $testfile >> solution_report.txt
         echo "" >> solution_report.txt
         echo "" >> solution_report.txt
         echo $testfile >> solution_report.txt
          # Print all results to solution_report.txt
         java -cp .solution/prog2/prog2.jar:.solution/prog1/*:lib/* \
            Parse.ParserDriver $testfile \
            >> solution_report.txt 2>&1
       done

diff -u report.txt solution_report.txt >> final_report.txt
