package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Integer arr[]= {32,3,45,6,77};
          Stream<Integer> stream1=Arrays.stream(arr);
          //stream1.forEach((element)->{System.out.println(element);});
	      stream1.forEach(System.out::println);//method refernec
	      List<Integer> list=Arrays.asList(arr);
	      Stream <Integer> stream2=list.stream();
	      int s1[]=stream2.filter((element)->{return element>20;})
	      .mapToInt((element)->{return element;})
	      .toArray();
	      
	      
	      
	      
	      
	      }
	}

