package expression;

public class Subtract extends Operation {
    public Subtract(Var x, Var y) {
        super(x, y, '-');
    } 
    @Override 
    protected int makeOperation(int a, int b) { 
        return a - b; 
    }
}
