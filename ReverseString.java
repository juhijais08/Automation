



package defaultpackage;

public class ReverseString
{

	public static void main(String[] args)
	
	{
		String str="ABCD";
		String rev="";
		//1.Reverse a string with help of concatination
		
		/*int len= str.length();
		
		
		for (int i=len-1;i>=0;i--)
		{
		rev=rev+str.charAt(i);
		}
       System.out.println("Reversed string is:"+rev);
	}

}*/
	//2.Reverse a string with character array	
		
		/*char a[]=str.toCharArray();
		int len=a.length;
		for(int i=len-1;i>=0;i--)
			
		{
			rev=rev+a[i];
		}
		 System.out.println("Reversed string is:"+rev);*/
		
		//3.String buffer class
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}
}



		