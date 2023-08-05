public class SortedArray
{
    static boolean issorted(int arr[]){
        boolean check=true;
        for(int i=1;i<arr.length;i++){// i=1 to traverse from 2nd
            if(arr[i]<arr[i-1]){
                check=false;
                break;
            }
        }
        return check;
    }
	public static void main(String[] args) {
	    int arr[]={1,2,3,4,5,6};
		System.out.println("Is Array Sorted or Not : "+issorted(arr));
	}
}
