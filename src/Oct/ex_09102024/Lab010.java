package Oct.ex_09102024;

public class Lab010 {
    public static void main(String[] args) {
        int A=10; //local variable
        System.out.println(A);

        {
            int a=10;
            System.out.println(a);
        }
//        System.out.println(a); does not access out side in local variable
    }
}
