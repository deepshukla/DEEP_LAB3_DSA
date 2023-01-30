package com.gl.bracket.balancer;

public class BalancedBracketsCheckerTest {
	public static void main(String[] args) {
		
		test("{[()]}");
		
		
		
	}
	

	private static void test(String brackets) {
			
		BalancedBracketsChecker checker = new BalancedBracketsChecker(brackets);
		Result result = checker.checkResult();
		if (result.isBalanced())
            System.out.println("The entered String has Balanced Brackets");
        else
            System.out.println("The entered Strings do not contain Balanced Brackets ");
    }
	

}
