package expression;

  public class Const implements Var {
    int x; 
    public Const(int x) {
        this.x = x; 
    }
    @Override
    public int evaluate(int x) {
        return this.x; 
    }
    @Override
    public String toString() {
        return Integer.toString(x); 
    }
}