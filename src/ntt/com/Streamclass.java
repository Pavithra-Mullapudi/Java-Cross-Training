package ntt.com;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Streamclass
{
	public static void main(String[] args)
	{
		List<Productclass>list=new ArrayList<>();
		list.add(new Productclass(12,"tv",20000.00));
		list.add(new Productclass(11,"rice",1000.00));
		
		list.add(new Productclass(10,"Cooler",22000.00));
		
		list.add(new Productclass(12,"mobile",18000.00));
		
		list.add(new Productclass(1,"ac",10000.00));
		
		List<Double>d=list.stream().filter(p->p.pcost<20000).map(p->p.pcost)
				.collect(Collectors.toList());
		System.out.println(d);
		
		
		//iterate
		Stream.iterate(1,e->e+1).filter(e->e%2==0).limit(2).forEach(System.out::println);
		//reduce function
		
		Double dd=list.stream().map(p->p.pcost).reduce(0.0,(sum,pcost)->(sum+pcost));
		System.out.println(dd);	
	}
}
