package com.gl.bracket.balancer;

public class Result {
	public Result(String expression) {
		super();
		this.expression = expression;
	}
	private String expression;
	private boolean balanced;
	private String errorMessage;
	
	public String getExpression() {
		return expression;
	}
	public void setExpression(String expression) {
		this.expression = expression;
	}
	public boolean isBalanced() {
		return balanced;
	}
	public void setBalanced(boolean balanced) {
		this.balanced = balanced;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	
	public String toString() {
		
		StringBuilder contents = new StringBuilder();
		
		if (balanced) {
			
			contents.append(
				String.format("For the expression %s the bracket(s) are balanced", 
					expression)
				);
		}else {
			
			if (errorMessage.trim().length() > 0) {
				contents.append(errorMessage);				
				contents.append(System.getProperty("line.separator"));
			}
			
			contents.append(
				String.format("For the expression %s the bracket(s)"
					+ " are NOT balanced", expression));
		}		
		
		contents.append(System.getProperty("line.separator"));		
		return contents.toString();
	}


}
