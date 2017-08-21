package com.first.projectTest;

public class FirstTest   {
	
    static {System.out.println("static method is called");}
    
    

	public static void main(String[] args) throws CloneNotSupportedException  {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		int result =Solution.sum();
		System.out.println(result);
		Solution solution = new Solution();
		Solution copySolution= (Solution)solution.clone();
		System.out.println(copySolution);
		System.out.println(solution);
		
System.out.println(copySolution);
		System.out.println(solution);
		
	}
	
	

}
