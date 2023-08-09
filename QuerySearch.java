// Given Q queries, checking if the given number is present in array or not.
// Note: value of all the elements in the array is less than 10 to the power 5
import java.util.*;
public class QuerySearch
{
    static int[] makefrequency(int arr[]){
        int freq[]=new int[100005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int arr[]={5,3,4,100,15678};
         int freq[]=makefrequency(arr);
		System.out.print("Enter No. of Queries: ");
		int k=sc.nextInt();
		while(k>0){
		    System.out.print("Enter any value: ");
		    int x=sc.nextInt();
		    if(freq[x]>0)
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		 k--;
		}
	}
}
