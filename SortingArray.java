import java.util.Arrays;
public class SortingArray
{
    static int[] smallestandlargest(int arr[]){
       Arrays.sort(arr);
       int ans[]={arr[0],arr[arr.length-1]};
        return ans;
    }

    
	public static void main(String[] args) {
	    int arr[]={1,4,8,6,7};
		int ans[]= smallestandlargest(arr);
		System.out.println("Smallest "+ans[0]);
		System.out.println("Largest  "+ans[1]);
	}
}
