public class Calculator {
    private Expression e;
    private Assessment a;
    public Calculator(Expression e, Assessment a) {
        this.e = e;
        this.a = a;
    }

    public Expression getE() {
        return e;
    }

    public void setExpression(Expression e) {
        this.e = e;
    }
    public void setAssessment (Assessment a) {
        this.a = a;
    }
    public boolean isCalculable(){
        //Pre:
        //Post: Returns true if the expression e is calculable with the assessment a; false in contrary case.
        return e.calculable(a);
    }
    public void replaceAll(){
        //Pre:
        //Post: It replaces all variables which exists in the assessment.
        if(!isCalculable()){
            System.out.println("Not calculable");
            return;
        }
        for (String var:a.getPairs().keySet()){
            this.e=e.replace(var, a.getPairs().get(var));
        }
    }
    public int calculate(){
        //Pre:
        //Post: It calculates the numeric value of the expression.
        return e.calculate(a);
    }

    @Override
    public String toString() {
        return e.toString();
    }
}
