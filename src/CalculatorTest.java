
public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculon = new Calculator(42.01, 42.41);
		double a = calculon.getOperandOne();
		double b = calculon.getOperandTwo();
		calculon.performOperation(a, "+", b);
	}

}
