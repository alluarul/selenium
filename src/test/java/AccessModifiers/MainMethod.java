package AccessModifiers;

public class MainMethod {
    public static void main(String[] args) {
        PublicExample obj=new PublicExample();
        int c=obj.a;
        System.out.println(c);
        //PrivateExample obj1=new PrivateExample();
        //int k=obj1.a;
        //System.out.println(k);
        ProtectedExample obj2=new ProtectedExample();
        int l=obj2.a;
        System.out.println(l);
    }
}
