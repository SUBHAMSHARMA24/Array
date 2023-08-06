import java.util.Arrays;
public class SumPair
{
    static int pair(int arr[], int x){
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int ans=arr[i]+arr[j];
                if(ans==x){
                    count++;
                }
            }
        }
            return count;
    }
	public static void main(String[] args) {
	    int arr[]={4,6,3,5,8,2};
	    int x=7;
		System.out.println("No of pair: "+pair(arr,x));	    
	}
}
