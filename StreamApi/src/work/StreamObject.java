package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
    	
    	// HOW TO CREATE STREAM OBJECT

        //1) Blank Stream--->>>

        Stream<Object> empty = Stream.empty();
        
        //2) Arrays,object,collection---->>>
        
        String name[]= {"Ayush","Arpit","Akash","Aman","Shivam"};
        Stream<String> stream1 = Stream.of(name);
        stream1.forEach(e->System.out.println(e));
        
        //3) Stream builder----->>>>
        Stream<Object> build = Stream.builder().build();
        
        //4) Arreys----->>>
        IntStream stream2 = Arrays.stream( new int[] {1,2,3,55,67});
        stream2.forEach(e->System.out.println(e));
        
        //5)List,set---->>>  IIMPORTANT
       
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(11);
        list1.add(111);
        list1.add(1111);
        list1.add(11111);
        Stream<Integer> stream3 = list1.stream();
        stream3.forEach(e->System.out.println(e));
    }

}
