package com.tcs.exceptions;

/**
 *Some of RuntimeException examples:- 
 *	1)ArithmeticException
 *	2)NullPointerException
 *	3)ArrayIndexOutOfBoundsException
 *
 *RuntimeException will throws an exception at run time.
 *RuntimeException handled with TRY and CATCH blocks.
 *finally block will execute even if it throws an exception.
 *combinations of blocks: -
 *	1)try with catch 
 *	2)try with multiple catch blocks
 *	3)try-catch with finally
 *	4)try with finally block.
 *
 *Note: -we can't write any statement or line of code in between this blocks.
 *
 */
public class RunTimeExceptionExample {
	public static void main(String[] args) {
//		small Example for RuTimeException
//		we can't divisible any number with zero but if you seen below line of code syntactically correct it doesn't give any exception at compile time but it throws an exception at runtime.
		System.out.println(10/0);
	}
}
