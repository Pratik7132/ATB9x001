package Oct.ex_15102024_Ternary_Operator;

public class Lab051 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);
        // A -> a++ -> 10 , a-> 11
        //  + ->
        // B  -> ++a -> 12 , a -> 12

        // A+B -> 10+12
    }
}