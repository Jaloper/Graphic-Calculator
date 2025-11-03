import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Expression exp1= new Variable("x");
        Expression exp2= new Variable("y");
        Expression exp4= new Constant(3);
        Expression exp3= new Opposite(new Sum(exp4,exp2));
        Assessment a= new Assessment();
        a.addAssessment("y",5);
        Calculator c=new Calculator(exp3,a);
        System.out.println(c);
        c.replaceAll();
        System.out.println(c);
        System.out.println(c.calculate());
        // .
        // .
        // .
        //Expression e= new Multiplication(new Sum(new Variable("x")),exp4);

    }
}
