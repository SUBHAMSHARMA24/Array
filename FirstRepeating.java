import java.util.Arrays;
public class FirstRepeating
{
    static int Repeating(int arr[]){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[j];
                }
            }
        }
        return -1;// if no repeating return -1
    }
	public static void main(String[] args) {
	    int arr[]={1,2,3,2,3};
		System.out.println("First Repeating Number is: "+Repeating(arr));	    
	}
}
