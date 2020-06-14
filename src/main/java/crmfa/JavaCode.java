package crmfa;

import java.util.HashMap;
import java.util.Map;

public class JavaCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("hello");
				/*String str, A = "";
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a string to reverse:");
				str = sc.nextLine();
					 
					      int length = str.length();
					 
					      for ( int i = length - 1; i >= 0; i-- ) {
					    	  A = A + str.charAt(i);}
					 
					      if (str.equalsIgnoreCase(A)) {
					         System.out.println(str+" is a palindrome");
					         System.out.println(A);
					      }
					      else
					      {
					         System.out.println(str+" is not a palindrome");
					         System.out.println("Reverse string is "+A);
					      }
					      		sc.close();
					   }
			}*/
					JavaCode countWordTest = new JavaCode();
				   countWordTest.countWords("find spring tutorial, java tutorial how to java articles spring articles and may more");
				    }
				   public void countWords(String input) {
				     Map <String, String> map = new HashMap <String, String> ();
				    if (input != null) {
				        String[] separatedWords = input.split(" ");
				        for (String str: separatedWords) {
				            if (map.containsKey(str)) {
				             int count = Integer.parseInt(map.get(str));
				              map.put(str, String.valueOf(count + 1));
				              } else {
				              map.put(str, "1");
				                }
				            }
				        }
				 
				        System.out.println("Count :- " + map);

	}

}
