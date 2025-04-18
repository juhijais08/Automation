package defaultpackage;

public class CountNoofVowels 

{

	public static void main(String[] args) 
	
	
	{
		int Count = 0;
        String str = "juhijaiswal";
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                Count++;
            }
        }

        System.out.println("Number of Vowels: " + Count);
    }

	}


	/*int Count=0;
	String str="juhijaiswal";
	str=str.toLowerCase();
	for(int i=0;i<str.length();i++);
	{
	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
	{
    	 Count++;
	}
	}
	
	 System.out.println("Number of Vowels:"+Count);
 
}
}*/
