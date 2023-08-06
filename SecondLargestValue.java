//Without doing Array sorting
import java.util.Arrays;
public class Main
{
    static int FindLargestValue(int arr[]){
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            largest=arr[i];
        }
    }
    return largest;
}
    static int FindSecondLargest(int arr[]){
    int max=FindLargestValue(arr);
    for(int i=0;i<arr.length;i++){
        if(arr[i]==max){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    int secondLargest=FindLargestValue(arr);
    return secondLargest;
}
	public static void main(String[] args) {
	    int arr[]={5,4,2};
		System.out.println("Second Largest Value in the array : "+FindSecondLargest(arr));	    
	}
}
