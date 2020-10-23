package ntt.com;

public class Lamda {
	public static void main(String[] args)
	{
		String s="paviii";
		Greeting g=(s1)->{System.out.println(s1 + " Very Gud Morning ");};
		g.greet(s); 
	}

}
