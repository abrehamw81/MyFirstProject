package com.first.projectTest;

public class Solution implements Cloneable {
static int a=5;
static int b=3;
public static int sum(){
		
		return a+b;
	}
public int sum(int c, int d){
	
	return c+d;
}
@Override 
public Object clone()throws CloneNotSupportedException{  
	return super.clone();  
	}  

}
