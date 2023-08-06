import java.util.Arrays;
public class LargestElement
{
    static int LargestValue(int arr[]){
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            largest=arr[i];
        }
    }
    return largest;
}
    
	public static void main(String[] args) {
	    int arr[]={5,4,1,6,90,12};
		System.out.println("Largest Number in the array : "+LargestValue(arr));	    
	}
}
