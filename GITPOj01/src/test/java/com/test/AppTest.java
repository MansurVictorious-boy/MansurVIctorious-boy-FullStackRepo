package com.test;



import com.nt.main.Arithmetic;

/**
 * Unit test for simple App.
 */
public class AppTest {
 public static void main(String[] args) {
	Arithmetic ar=new Arithmetic();
	int result=ar.sum(50,10);
	System.out.println("result: "+result);
}
}
