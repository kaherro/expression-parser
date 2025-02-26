package expression;

public class Add extends Operation {
    public Add(Var x, Var y) {
        super(x, y, '+');
    } 
    @Override 
    protected int makeOperation(int a, int b) { 
        return a + b; 
    }
}
