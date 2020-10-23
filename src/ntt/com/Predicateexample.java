package ntt.com;
import java.util.function.Predicate;

public class Predicateexample {
	public static void main(String[] args)
	{
		Predicate<Integer> p=I->(I>20);
		System.out.println(" Predicate " +p.test(8));
	}
}

