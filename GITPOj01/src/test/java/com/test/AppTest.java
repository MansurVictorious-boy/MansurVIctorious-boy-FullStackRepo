package com.test;



import com.nt.main.Arithmetic;

/**
 * Unit test for simple App.
 */
public class AppTest {
 public static void main(String[] args) {
	Arithmetic ar=new Arithmetic();
	long result=ar.sum(50,10);
	long result1=ar.sub(50,10);
	System.out.println(" Addtion result: "+result);
	System.out.println("Subtraction result: "+result1);
}
}
