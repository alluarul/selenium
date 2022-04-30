package AccessModifiers2;

import AccessModifiers.ProtectedExample;
import AccessModifiers.PublicExample;

public class Protected2 {
    public  void text() {
        ProtectedExample obj=new ProtectedExample();
        PublicExample obj1=new PublicExample();
        int k=obj1.a;
        System.out.println(k);

    }
}
