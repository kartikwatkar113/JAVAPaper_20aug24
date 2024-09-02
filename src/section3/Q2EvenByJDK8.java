package section3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q2EvenByJDK8 {

	public static void main(String x[]) {
		
		List<Integer> nums=Arrays.asList(12,14,15,17,18,19,22,24,25);
		
		Stream<Integer> s=nums.stream();
		
		Predicate<Integer> p=new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				
				return t%2==0;
			}
			
		};
		
		Stream<Integer> s2=s.filter(p);
		
		List<Integer> res=s2.collect(Collectors.toList());
		
		Consumer<Integer> c=new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		
		res.forEach(c);
	}
}


