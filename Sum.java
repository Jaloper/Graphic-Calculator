import java.util.List;

public class Sum extends BinExpression{
    public Sum(Expression e1, Expression e2) {
        super(e1, e2);
    }

    @Override
    public int calculate(Assessment v) {
        return e1.calculate(v)+e2.calculate(v);
    }

    @Override
    public Expression replace(String var, int n) {
        return new Sum(e1.replace(var, n), e2.replace(var, n));
    }

    @Override
    public Expression rename(String v1, String v2) {
        return new Sum(e1.rename(v1, v2), e2.rename(v1, v2));
    }

    @Override
    public Expression copy() {
        return  new Sum(e1.copy(), e2.copy());
    }

    @Override
    public String toString() {
        return super.e1.toString()+" + "+e2.toString();
    }
}
