

import java.util.*;
import java.lang.*;
import java.io.*;

class Factorial
{
	public static int fact(int n){
		if (n > 1){
			return n * fact(n-1);
		}
		else return 1;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("Factorial: " + factorial(6));
	}
}
