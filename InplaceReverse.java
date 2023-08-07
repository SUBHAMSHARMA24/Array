//Reversing an Array and storing it into same array
import java.util.Arrays;
public class InplaceReverse
{
    static void Swap(int arr[],int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    static void Reverse(int arr[]){
        int i=0;int j=arr.length-1;
        while(i<j){
            Swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){	    
		System.out.print(" "+arr[i]);	   
        }
    }
	public static void main(String[] args) {
	    int arr[]={1,2,3,4,5,6,7,8,9};
	    Reverse(arr);
	    print(arr);

	}
}
