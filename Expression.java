import java.util.List;

public abstract class Expression {
    public abstract List<String> variablesList();
    //Pre:
    //Post: It returns the list of variables which are in the Expression.
    public abstract int calculate(Assessment v);
    //Pre: Assessment contains the necessary transformations to evaluate each variable in the expression.
    //Post: It returns the numeric result of the calculated expression.
    public abstract Expression replace(String var, int n);
    //Pre: var is not null.
    //Post: It returns the expression after make the conversion from the variable to their numeric value.
    public abstract Expression rename(String v1, String v2);
    //Pre:
    //Post: Rename v1->v2
    public abstract Expression copy();
    //Pre:
    //Post: Returns a copy from the target expression.
    public int numVariables() {
        return variablesList().size();
    }
    public boolean containsVariable(String var) {
        //Pre: var != null.
        //Post: Returns true if the variable is in the list; false in contrary case.
        return variablesList().contains(var);
    }
    public boolean calculable (Assessment v) {
        //Pre: Assessment != null.
        //Post: Returns true if all variables in variableList are in the list; false in contrary case.
        for (String var : variablesList()) {
            if(!v.hasValue(var)) return false;
        }
        return true;
    }
}
