package ntt.com;

public abstract class Greeter implements Greeting {
	String u1;
	public void greet(Greeter greeter)
	{
		System.out.println(greeter.u1 +"ver good morning");
	}

}
