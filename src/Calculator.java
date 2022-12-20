
public class Calculator implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Member variables
	private double operandOne;
	private double operandTwo;
	private String operation;
	
	// Methods
	public double performOperation(double operandOne, String operation, double operandTwo) {
		double result = 0.0;
		if (operation.equals("+")) {
			result = operandOne + operandTwo;
			System.out.println(operandOne + " " + operation + " " + operandTwo + " = " + result);
			return result;
		} else if (operation.equals("-")) {
			result = operandOne - operandTwo;
			System.out.println(operandOne + " " + operation + " " + operandTwo + " = " + result);
			return result;
		}
		return result;
	}
	
	// Constructors
	public Calculator() {
		
	}
	
	public Calculator(double operandOne, double operandTwo) {
		this.operandOne = operandOne;
		this.operandTwo = operandTwo;
	}
	
	public Calculator(double operandOne, String operation, double operandTwo) {
		this.operandOne = operandOne;
		this.operation = operation;
		this.operandTwo = operandTwo;
	}
	
	// Getters and Setters
	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
}
