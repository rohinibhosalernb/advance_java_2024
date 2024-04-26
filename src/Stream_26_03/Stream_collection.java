package Stream_26_03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_collection {

	public static void main(String[] args) {
		
	//stream helps to manipulate data which store in collection
		//consumer
		List<String> week = Arrays.asList("monaday","tuesday","kk","kk");
		System.out.println("count" + " "+ week.stream().count());
		//below line is write by using lambda expresn inside consumer 
		week.stream().forEach(days -> System.out.println("days="+ days));
		
		//remove duplicate from list we perform using stream
		
		week.stream().distinct().forEach(di -> System.out.println("distinct" + di));
		
		//filter(predicate) 
		
		//stream never modify original string if u want then coolect it store
		//in another list 
		
		
		List<String> filter = 
		week.stream().filter(a -> a.startsWith("t")).collect(Collectors.toList());
		
		filter.stream().forEach(x -> System.out.println("start with t="+x));
		
		
		
		
	}

}
