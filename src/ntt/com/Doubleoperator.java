package ntt.com;

import java.util.function.BiFunction;

public class Doubleoperator {
	static int add(int a, int b)
	{
		return a+b;
	}
	static float add1(int a,float b)
	{
		return a+b;
	}
   public static void main(String[] args)
   {
	   BiFunction<Integer,Integer,Integer> add=Doubleoperator::add;
	   int res=add.apply(30, 60);
	   System.out.println(res);
	   
	   
	   BiFunction<Integer,Float,Float> add1=Doubleoperator::add1;
	   float res1=add1.apply(60, 30.8f);
	   System.out.println(res1);
	   
	   
   }


}
