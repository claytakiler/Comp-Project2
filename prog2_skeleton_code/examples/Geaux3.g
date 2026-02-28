fun int addone(int x) { return x + 1; }

fun int main() {
   var int[] x = {1,2,3};

   // Addone to each element of the list
   for (int i = 0l i < 3; i=i+1) {
      x[i] = addone(x[i]);
   }

}
