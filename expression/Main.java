package expression; 

public class Main {
    public static void main(String[] args) {
        String result = new Subtract(
            new Multiply(
                new Const(2),
                new Variable("x")
            ),
            new Const(3)
        ).toString(); 
        System.err.println(result);
    }
}
