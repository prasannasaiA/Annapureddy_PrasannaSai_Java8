import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class StringPalindrome {
	
	private static Scanner input;
	
	public static ArrayList<String> getPalindromes(ArrayList<String> stringArr){
		ArrayList<String> result = new ArrayList<String>();
		
		Predicate<String> p = (str)-> str.equals(new StringBuilder().append(str).reverse().toString());
		
		for(String str : stringArr) {
			if(p.test(str)) {
				result.add(str);
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		System.out.println("Enter no of Strings: ");
		
		int no_ele = input.nextInt();
		
		ArrayList<String> stringArr = new ArrayList<String>();
		
		System.out.println("Enter "+no_ele+" strings to the list:");
		
		for(int i=0;i<no_ele;i++) {
			stringArr.add(input.next());
		}
		
		ArrayList<String> palindromeArr = getPalindromes(stringArr);
		
		if(palindromeArr.size()==0) {
			System.out.println("There are no palindromes in given array of Strings.");
		}
		else {
			System.out.println("The palindromes in given array of Strings are: ");
			for(String res: palindromeArr ) {
				System.out.println(res);
			}
		}
		
	}

}