package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class stream {

	//@Test
	public void regular() {
		
		ArrayList<String> names=new ArrayList<String>();
		
		names.add("Abhi");
		names.add("Vishwa");
		names.add("Ram");
		names.add("Kaivaly");
		names.add("Avinash");
		names.add("Krushna");
		
		int count=0;
				
		for(int i=0;i<names.size();i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("A")) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	//@Test
	public void streamFilter() throws Exception {
		
        ArrayList<String> names=new ArrayList<String>();
		
		names.add("Abhi");
		names.add("Vishwa");
		names.add("Ram");
		names.add("Kaivaly");
		names.add("Avinash");
		names.add("Krushna");
		
		long aa=names.stream().filter(a->a.startsWith("K")).count();
		
		System.out.println(aa);
		
		
		long dd=Stream.of("ASatish","Suresh","ASachin","Ramesh").filter(s->
		
			s.startsWith("A")).count();
		
		System.out.println(dd);
		
		//print all the name in the arraylist
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		//print only first result from arraylist
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		
	}
	
	//@Test
	public void streamMap() {
		
		ArrayList<String> names1=new ArrayList<String>();
		
		names1.add("Sachin");
		names1.add("Suresh");
		names1.add("Ramesh");
		
		//print names which have last letter have "t" with uppercase
		
		Stream.of("Abhijit","Vishwajeet","Ram","Kaivaly").filter(s->s.endsWith("t")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		System.out.println("************************");
		//print names which have first letter as a with uppercase and sorted
		
		List<String> names2=Arrays.asList("Adesh","Abhijit","Ram","Arohi");
		names2.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		System.out.println("************************");
		//Merging 2 different list
		Stream<String> newStream=Stream.concat(names1.stream(), names2.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		
		//check if element is present in the stream
		Boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Arohi"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
		
	}

	@Test
	public void streamCollect() {
		
		List<String> ls=Stream.of("Abhijit","Vishwajeet","Ram","Kaivaly").filter(s->s.endsWith("t")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		
		System.out.println(ls);
		
		//when we want print 2 element from list
		System.out.println(ls.get(1));
		
		//print the unique number from the list
		List<Integer> values=Arrays.asList(4,3,5,2,3,4,6,7,8,1,5);
		
		//values.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(li.get(4));
		
	}
	
	
}
