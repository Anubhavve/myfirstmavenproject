package mavenpracticeproject;

public class Calculator {
public static int add(int a,int b) {
	return a+b;
}
public static int substract(int a,int b) {
	return a-b;
}
public static int multiply(int a,int b) {
	return a*b;
}
public static int divide(int a,int b) {
	return a/b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("addition of given number is "+add(5,10));
System.out.println("Substraction of given number is "+substract(5,10));
System.out.println("multiplication of given number is "+multiply(5,10));
System.out.println("division of given number is "+divide(50,10));
	}

}
