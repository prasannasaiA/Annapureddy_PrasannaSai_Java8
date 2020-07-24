
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringOfLength3AndStartsWithA {
	
	private static Scanner input;
	
	public static ArrayList<String> getSringsLen3AndStartWithA(ArrayList<String> stringArr){
		
		ArrayList<String> result;
		
		result = (ArrayList<String>) stringArr.stream()
                .filter(str -> str.startsWith("a") && str.length()==3)
                .collect(Collectors.toList());
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
		
		ArrayList<String> strLen3StratsWithA = getSringsLen3AndStartWithA(stringArr);
		
		if(strLen3StratsWithA.size()==0) {
			System.out.println("There are no strings with length 3 and starts with 'a'.");
		}
		else {
			System.out.println("The strings of length 3 and starts with 'a' are: ");
			for(String res: strLen3StratsWithA ) {
				System.out.println(res);
			}
		}
	}

}
