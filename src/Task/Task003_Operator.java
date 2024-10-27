package Task;

public class Task003_Operator {
    public static void main(String[] args) {

        //Arithmetic Operator
        int a=8,b=4, c=13;
        System.out.println(a+b);
        System.out.println(a-c);
        System.out.println(b*20/c);
        System.out.println(a/c);
        System.out.println(c %a);
        System.out.println();

        //+operator with Concatenation
        String First="Pratik";
        String Last="Gawali";
        int d=10;
        int e=20;
        System.out.println(d+e+First+Last);//first addition then Concatenation
        System.out.println(First+Last+d+e);// concatenation
        System.out.println();

        //Logical Operator
        boolean m=true;
        boolean n=false;

        System.out.println(m || n);
        System.out.println(m && n);
        System.out.println(!(60>50));

        int p=10;
        boolean z=(p>10 || p<39);
        System.out.println(z);
        System.out.println();

        //Compound Assign Operator
        int v1=20;
        v1 /=10;
        int v2=4;
        v2 +=39;
        int v3=14;
        v3 -=50;
        int v4=20;
        v4 *=2;
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
    }
}
