package AccessModifiers2;

public class MethodsExample {
    public void addition(){
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);

    }
    public int subtraction(){
        int a=10;
        int b=30;
        int c=a-b;
        System.out.println(c);
        return c;
    }
    public void multiplication(int a,int b){
        int c=a*b;
        System.out.println(c);

    }
    public int multi(int a,int b){
        int c=a*b;
        return c;
    }
    public Protected2 games(){
        return new Protected2();
    }



    public static void main(String[] args) {
        MethodsExample obj=new MethodsExample();
        int g=obj.subtraction();
        System.out.println(g);
        obj.multiplication(10,30);
        int m=obj.multi(20,40);
        System.out.println(m);
        Protected2 pubg=obj.games();
        pubg.text();

    }

}
