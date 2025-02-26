package expression;

public abstract class Operation implements Var {
    Var x, y; 
    char op; 
    public Operation(Var x, Var y, char op) {
        this.x = x; 
        this.y = y;  
        this.op = op; 
    }
    protected abstract int makeOperation(int a, int b); 
    // protected abstract string toMiniString(); 
    
    @Override
    public int evaluate(int a) {
        return makeOperation(x.evaluate(a), y.evaluate(a));
    }

    @Override
    public String toString() {
        return "(" + x.toString() + " " + op + " " + y.toString() + ")"; 
    }
} 