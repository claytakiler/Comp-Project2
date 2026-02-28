package Absyn;

public class DecLit extends Literal<Integer> {
   public DecLit(int p, int v) {
      super(p,v);
   }
   
   public String print(int depth) {
      return "  ".repeat(depth) + "DecLit(" +
         this.value + ")";
   }



}
