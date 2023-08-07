//Rotating an array by k steps
public class RotateArray
{
    static int[] Rotate(int arr[],int k){
        int n =arr.length;
        k=k%n;
        int ans[]=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j]=arr[i];
            j++;
        }
        for(int i=0;i<n-k;i++){
            ans[j]=arr[i];
            j++;
        }
        return ans;

    }
        static void print(int ans[]){
        for(int i=0;i<ans.length;i++){	    
		System.out.print(" "+ans[i]);	   
        }
    }
	public static void main(String[] args) {
	    int arr[]={1,2,3,4,5};
	    int k=3;
	    int ans[]=Rotate(arr,k);
	    print(ans);

	}
}
