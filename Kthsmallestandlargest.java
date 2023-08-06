import java.util.Arrays;
public class Kthsmallestandlargest
{
    static int[] smallandlarge(int arr[], int x){
        Arrays.sort(arr);
        int ans[]={arr[x],arr[arr.length-x]};
        return ans;
    }
	public static void main(String[] args) {
	    int arr[]={1,2,5,7,9,3};
	    int x=3;
	    int ans[]=smallandlarge(arr,x);
		System.out.println("small: "+ans[0]);	    
		System.out.println("large: "+ans[1]);
	}
}
