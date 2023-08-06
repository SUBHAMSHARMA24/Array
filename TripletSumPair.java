import java.util.Arrays;
public class TripletSumPair
{
    static int pair(int arr[], int x){
    int count=0;
    for(int i=0;i<arr.length;i++){
        for(int k=i+1;k<arr.length;k++){
            for(int j=k+1;j<arr.length;j++){
                int ans=arr[i]+arr[k]+arr[j];
                if(ans==x){
                    count++;
                }
            }
        }
    }
    return count;
}
    
	public static void main(String[] args) {
	    int arr[]={1,4,5,6,3};
	    int x=12;
		System.out.println("No of pair: "+pair(arr,x));	    
	}
}
