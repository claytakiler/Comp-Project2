package Absyn;

public class EmptyExp extends Exp{
    public EmptyExp(int p) {
        pos=p;
    }


   public String print(int depth) {
      return "  ".repeat(depth) + "EmptyExp()";
   }


}
