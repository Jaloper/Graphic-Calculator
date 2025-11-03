import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class BinExpression extends Expression {
    protected Expression e1,e2;

    public BinExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public List<String> variablesList() {
        List<String> l = new ArrayList<>(e1.variablesList());
        for(String var : e2.variablesList()) {
            if(!l.contains(var)) l.add(var);
        }
        return l;
    }

}
