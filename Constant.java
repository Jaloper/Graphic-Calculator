import java.util.ArrayList;
import java.util.List;

public class Constant extends Expression{
    private int value;
    public Constant(int value) {
        this.value = value;
    }
    @Override
    public List<String> variablesList() {
        return new ArrayList<>();
    }

    @Override
    public int calculate(Assessment v) {
        return this.value;
    }

    @Override
    public Expression replace(String var, int n) {
        return this;
    }

    @Override
    public Expression rename(String v1, String v2) {
        return this;
    }

    @Override
    public Expression copy() {
        return new Constant(value);
    }

    public String toString() {
        return String.valueOf(value);
    }
}
