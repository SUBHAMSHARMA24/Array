//Using Array Sorting Technique
import java.util.Arrays;
public class SecndLargest
{
    static int Secondlargest(int arr[]){
       Arrays.sort(arr);
       int ans=arr[arr.length-2];
        return ans;
    }

    
	public static void main(String[] args) {
	    int arr[]={1,4,8,6,7};
		System.out.println("Largest  "+Secondlargest(arr));
	}
}
