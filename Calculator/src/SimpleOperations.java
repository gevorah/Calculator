
public class SimpleOperations{
	public static double sum(double numberA, double numberB){
		double result;
		if(numberB>0? numberA>Integer.MAX_VALUE-numberB : numberB<Integer.MIN_VALUE-numberA){
		//revisar ¿integer o double?
		throw new ArithmeticException("Desbordamiento de entero");
		}
		result = (numberA+numberB);
		return result;
	}
	public static double subtraction(double numberA, double numberB){
		double result;
		if(numberB>0? numberA>Integer.MAX_VALUE/numberB || numberB<Integer.MIN_VALUE/numberA 
		: numberB==-1 && numberA==Integer.MIN_VALUE){
		//revisar ¿integer o double?
		throw new ArithmeticException("Desbordamiento de entero");
		}
		result = (numberA-numberB);
		return result;
	}
	public static double product(double numberA, double numberB){
		double result;
		if(numberB>0? numberA>Integer.MAX_VALUE/numberB || numberB<Integer.MIN_VALUE/numberA 
		: numberB==-1 && numberA==Integer.MIN_VALUE){
		//revisar ¿integer o double?
		throw new ArithmeticException("Desbordamiento de entero");
		}
		result = (numberA*numberB);
		return result;
	}
	public static double division(double numberA, double numberB){
		double result;
		try {
			result = numberA/numberB
		} catch (ArithmeticException e) {
		e.printStackTrace();
		}
		/*if(numberB==0){
			revisar
		} else {
		result = (numberA/numberB);
		return result;
		}*/
	}
	public static double module(double numberA, double numberB){
		double result;
		result = (numberA%numberB);
		return result;
	}