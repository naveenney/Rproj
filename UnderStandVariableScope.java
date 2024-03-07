package rprojectassignment;

public class UnderStandVariableScope {
	
	public static void main(String[] args)
	{
		int count=0;
		
		if(count==0)
		{
			 int count1 = 0;
		}
		System.out.println(count);
		System.out.println(count1);
		
		//count1 cannot be resolved to a variable
	}

}
