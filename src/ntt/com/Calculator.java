package ntt.com;

public class Calculator {
	public static void main(String[] args)
	{
		Addition a1=(a,b)->{System.out.println("addition"+(a+b));
		return a+b;};
		Subtraction s1=(a,b)->{System.out.println("subtraction"+(a-b));
		return a-b;};

		Multiplication m1=(a,b)->{System.out.println("multiplication"+(a*b));
		return a*b;};

		Division d1=(a,b)->{System.out.println("division"+(a/b));
		return a/b;};
		a1.add(23, 67);
		s1.sub(30, 12);
		m1.mul(10, 5);
		d1.div(100, 10);


	}
	

}
