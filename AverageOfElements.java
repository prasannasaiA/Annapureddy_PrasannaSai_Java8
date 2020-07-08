import java.util.Scanner;

public class AverageOfElements 
{
	private static Scanner input;

	interface FuncInterface{
		int add(int a, int b);
	}
	
	public static double avgOfElements(int no_ele, int[] list) {
		int sum_ele=0;
		FuncInterface obj = (int a, int b) -> (a+b);
		for(int i=0;i<no_ele;i++) {
			sum_ele = obj.add(sum_ele, list[i]);
		}
		return (double)sum_ele/no_ele;
	}
	
    public static void main( String[] args )
    {
        input = new Scanner(System.in);
        
        System.out.println("Enter the number of integers: ");
        int no_ele = input.nextInt();
        
        int[] list = new int[no_ele];
        
        System.out.println("Enter "+no_ele+" integers to the array:");
        
        for(int i=0;i<no_ele;i++) {
        	list[i]=input.nextInt();
        }
        
        double avg_of_elements = avgOfElements(no_ele, list);
        
        System.out.println("The average of integers entered is: "+avg_of_elements);
        
    }
}
