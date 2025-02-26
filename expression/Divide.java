package expression;

public class Divide extends Operation {
    public Divide(Var x, Var y) {
        super(x, y, '/');
    } 
    @Override 
    protected int makeOperation(int a, int b) { 
        return a / b; 
    }
}
