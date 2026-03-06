
if [ "$#" -eq 0 ]; then
   java \
      -cp .solution/prog2/prog2.jar:.solution/prog1/*:lib/* \
      Parse.ParserDriver test.g
else
   java \
      -cp ./.solution/prog2/prog2.jar:./.solution/prog1/*:lib/* \
      Parse.ParserDriver $1
fi
