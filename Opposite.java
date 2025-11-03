import java.util.List;

public class Opposite extends Expression{
    private Expression e;
    public Opposite(Expression e){
        this.e = e;
    }
    @Override
    public List<String> variablesList() {
        return e.variablesList();
    }

    @Override
    public int calculate(Assessment v) {
        return -e.calculate(v);
    }

    @Override
    public Expression replace(String var, int n) {
        return new Opposite(e.replace(var, n));
    }

    @Override
    public Expression rename(String v1, String v2) {
        return new Opposite(e.rename(v1, v2));
    }

    @Override
    public Expression copy() {
        return new Opposite(e.copy());
    }

    @Override
    public String toString() {
        return "-"+ e.toString();
    }
}
