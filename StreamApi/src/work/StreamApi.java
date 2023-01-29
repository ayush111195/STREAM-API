package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {

		// Q)ceate a list and filter the even number from liat-->>
		
		
		//this  are the 3 method to creat a list--->>
		
		List<Integer> list1=List.of(2,3,15,21,22,67);   // !ye unmodifed hoti h 
		
		List<Integer> list2=new ArrayList<>();
		list2.add(2);
		list2.add(3);
		list2.add(15);
		list2.add(21);
		list2.add(22);
		list2.add(67);
		
		
		List<Integer>list3 = Arrays.asList(2,3,15,21,22,67);
		
		//list1
//with out stream-->>	
		
		List<Integer>listeven= new ArrayList<>();
		for(Integer i:list1) {
			if(i%2==0) {
				listeven.add(i);
			}
		}
		System.out.println(list1);
		System.out.println(listeven);
		
//using stream api--->>
		
//		Stream<Integer> stream = list1.stream();
//		List<Integer> collect = stream.filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(collect);
		
		List<Integer> collect = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(collect);
		
//find the number is <50--->>>
		List<Integer> collect2 = list1.stream().filter(i->i<=50).collect(Collectors.toList());
		System.out.println(collect2);
	}

}
