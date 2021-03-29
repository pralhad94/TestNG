package sample;

public class ReverseString {

	public static void main(String[] args) {
		
		
		//String str = "BHUPS";
		//String rev = "";
		
		//int len = str.length();
		/*
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
			System.out.println("reverse string is: " +rev);
		} */
		
        StringBuffer sb = new StringBuffer("reverse");
        sb.reverse();
        System.out.println(sb);
		
		
	}

}
