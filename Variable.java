import java.util.ArrayList;
import java.util.List;

public class Variable extends Expression{
    private String var;

    public Variable(String var) {
       this.var = var;
    }

    @Override
    public List<String> variablesList() {
        return List.of(var);
    }

    @Override
    public int calculate(Assessment v) {
        return v.getAssessment(var);
    }

    @Override
    public Expression replace(String vr, int n) {
       if (var.equals(vr)) return new Constant(n);
       else return this;
    }

    @Override
    public Expression rename(String v1, String v2) {
        if (v1.equals(var)) var=v2;
        return this;
    }

    @Override
    public Expression copy() {
        return new Variable(var);
    }

    public String toString() {
        return var;
    }
}
