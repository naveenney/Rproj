package rprojectassignment;

import java.util.Scanner;

public class AverageWeightCalculation {
	
	public static void main(String[] args)
	{
		
	Scanner scan=new Scanner(System.in);
	
	int totalWeightOf10Peoples=0;
	
	for (int i=0;i<10;i++)
	{
		System.out.print("enter the person weight:");
		totalWeightOf10Peoples+=scan.nextInt();
	}
	
	int averageWeightOfPersons=totalWeightOf10Peoples/10;
	
	System.out.println("Average Weight Of 10 Peoples:"+averageWeightOfPersons);
	
	
	}

}
