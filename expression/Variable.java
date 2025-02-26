package expression;

public class Variable implements Var {
    private final String s; 
    public Variable(String s) {
        this.s = s; 
    }
    @Override
    public int evaluate(int x) {
        return x; 
    }
    @Override 
    public String toString() {
        return s; 
    }
}