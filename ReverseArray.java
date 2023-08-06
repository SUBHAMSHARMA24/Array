import java.util.Arrays;
public class ReverseArray
{
    static int[] Reverse(int arr[]){
        int n=arr.length;
           int ans[]=new int[n];
           int j=0;
        for(int i=arr.length-1;i>=0;i--){
            ans[j]= arr[i];
            j++;
        }
        return ans;
    }
	public static void main(String[] args) {
	    int arr[]={1,2,3,4,5};
	    int ans[]=Reverse(arr);
        for(int i=0;i<ans.length;i++){	    
		System.out.print(" "+ans[i]);	   
        }
	}
}
