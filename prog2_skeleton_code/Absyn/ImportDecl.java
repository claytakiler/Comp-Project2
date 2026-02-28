package Absyn;
import java.util.ArrayList;

public class ImportDecl extends Decl{
    public String import_name;
    public ImportDecl(int p, String s) {
        pos=p;
        import_name=s;
    }

   @Override
   public String toString() {
      return "Import: " + this.import_name;
   }
}
