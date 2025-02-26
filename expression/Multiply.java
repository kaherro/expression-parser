package expression;

public class Multiply extends Operation {
    public Multiply(Var x, Var y) {
        super(x, y, '*');
    } 
    @Override 
    protected int makeOperation(int a, int b) { 
        return a * b; 
    }
}
