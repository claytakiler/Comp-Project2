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

# Run the project
if [ "$#" -eq 0 ]; then
   java Parse.ParserDriver test.g 
else
   java Parse.ParserDriver $1 
fi 
