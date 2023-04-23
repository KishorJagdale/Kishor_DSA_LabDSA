package com.java.fsd.dsa.balancingbracket;

import java.util.*;
import java.util.Stack;

public class BalanceBracket {
	
		
	
		private static boolean Checkbracket(String expression) {
			
			Stack<Character> stack = new Stack<>();			
			
			for(char k: expression.toCharArray())
			{	
				if(k == '{' || k == '[' || k == '(')
				{
					stack.push(k);
					continue;
				}
				if(stack.isEmpty())
					return false; 
			
				char z;
				switch(k)
				{
				case '}' :
						z = stack.pop();
						if(z == '[' || z == '(')
							return false;
						break;
						
				case ']' :
					z = stack.pop();
					if(z == '{' || z == '(')
						return false;
					break;
					
				case ')' :
					z = stack.pop();
					if(z == '[' || z == '{')
						return false;
					break;		
				} 
			}  
			return(stack.isEmpty());
		}
		
		
		public static void main(String[] args) {
			String expression = "";
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Bracket string");
			expression = sc.next();
			
			 
			if(expression.length() % 2 !=0)
			{
				System.out.println("Invaid lenght of inputstring");
			}
			else
			{
				if(Checkbracket(expression))
				{
					System.out.println("The entered string has Balanced Brackets");
				}
				else
				{
					System.out.println("The entered string do not contain Balanced Brackets");
				}
			}
			sc.close();
		}
		
}
	
	