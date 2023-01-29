package work;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methods {

	public static void main(String[] args) {

		//  1)FILTER(PREDICATE)----->>>>
		        //(BOOLEAN VALUE FUNCTION)
		
		// AGAR HUMARE PASS SINGLE LINE HAI TO RETURN TYP NHI LIKHNA HOTA
		       //E->E>10 SOUT(E)
		
		// AGAR HUMARE PASS MULTI-PAL LINE HAI TO RETURN TYP  LIKHNA HOTA
	    // AGAR RETURN TYPE TRUE HOGA TABHI OPRATION PERFROM HOGA WARNA NHI
		

		//2)MAP----->>>
		//EACH ELEMENT OPERATION
		
		                            //FILTER-->>
		List<String> name = List.of("Ayush","Arpit","Akash","Aman","Shivam");
		Stream<String> newname = name.stream().filter(e->e.startsWith("A"));
		System.out.println("name="+newname);

	                                //MAP-->>
		List<Integer> number = List.of(1,2,3,4,5,6,7);
		List<Integer> collect = number.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println("map no="+collect);
		
		                           //shorted---->>
		number.stream().sorted().forEach(e->System.out.println("shorted"+e));
		
		                           //MIN
		Integer integer = number.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("min"+integer);
		
		                           //MAX------->>>
		Integer integer2 = number.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println("max"+integer2);
		
	}

}
