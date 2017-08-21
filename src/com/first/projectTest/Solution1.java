package com.first.projectTest;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Solution1 {
	int a;
	int b;
	public int add(){
		
		int c= a+b;
		return c;
		
	}
 	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		//get list of unique squares
		
		Function<Integer, Integer> x=  i->i*i;
		List<Integer> squaresList = numbers.stream().map(x).distinct().collect(Collectors.toList());
		squaresList.forEach(System.out::println);
		
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		Predicate<String> y= z->z.isEmpty();
		//get count of empty string
		int count = (int) strings.stream().filter(y).count();
		System.out.println(count);
//		//int d=a+b;
//		List<Integer> list = new ArrayList<Integer>();
//		int [] array =  {1,2,3,4,5,6}; 
//		list = Arrays.asList(1,2,3,4,5,7,8,9,10,-5,-8);
//		List<Integer>list2= list.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
//		System.out.println(list2.get(3));
//		
////		for(Integer num : list2){
////			System.out.println(num);
//			
//		}
//		
		
	}

}
