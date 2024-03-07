package rprojectassignment;

import java.util.Scanner;

class Person
{
	String name;
	float weight;
	float height;
	float bmi;
	String reMark;
	
	Person(String name,float weight,float height,float bmi,String remark)
	{
		this.name=name;
		this.weight=weight;
		this.height=height;
		this.bmi=bmi;
		this.reMark=remark;
	}
	
	public static void sortPerson(Person[] list)
	{
		for(int i=0;i<list.length-1;i++)
		{
			if(list[i].bmi<list[i+1].bmi)
			{
				Person p=list[i];
				list[i]=list[i+1];
				list[i+1]=p;
			}
		}
	}
	public static void ddd(Person[] list)
	{
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		System.out.println("Name"+"           "+"REMARK"+"           "+"BMI");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ __ _ _ _");
		
		for(int i=0;i<list.length;i++)
		{
		System.out.printf("\n%s        %s         %.1f",list[i].name,list[i].reMark,list[i].bmi);
		}
		
	}
}

public class BMI_Calculation {
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.print("enter the n persons:");
		int n=scan.nextInt();
		
         Person[] list=new Person[n];
         
         for(int i=0;i<n;i++)
         {
        	 System.out.print("enter the person"+i+1+"name:");
        	 String name=scan.next();
        	 
        	 System.out.print("enter the person"+i+1+"Weight:");
        	 float weight=scan.nextFloat();
        	 
        	 System.out.print("enter the person"+i+1+"height:");
             float height=scan.nextFloat();
             
             float convertToMeter=height/100;
             
             float bmi=weight/(convertToMeter*convertToMeter);
             
             String remark="";
             
             if(bmi<18.5)
            	 remark="UnderWeight";
             else if(bmi>=18.5&&bmi<=24.9)
            	 remark="NormalWeight";
             else if(bmi>=25&&bmi<=29.9)
            	 remark="OverWeight";
             else if(bmi>30)
            	 remark="Obesity";
            
             list[i]=new Person(name,weight,height,bmi,remark); 
         }
		Person.sortPerson(list);
		Person.ddd(list);
		
		
		
}
		
	}
