package PackageCalculator;

public class Main {

    public static void main(String[] args) throws Exception {
	DataLine dL = new DataLine();
    Operand oP1 = new Operand(dL.expression[0]);
    Operation operation = new Operation(dL.expression[1]);
    Operand oP2 = new Operand(dL.expression[2]);
    Calculation calc = new Calculation(oP1, oP2, operation.sOperator );
    System.out.println("Результат: " + calc.sResult);
    }
}
