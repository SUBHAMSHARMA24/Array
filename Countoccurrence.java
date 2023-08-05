public class Countoccurrence

{
    static int count(int[] arr, int x){
        int count=0;
     
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==x){
                count +=1;
            }
        }
        return count;
    }
	public static void main(String[] args) {
	    int arr[]={5};
	    int x=5;
		System.out.println("No of occurrence"+count(arr,x));
	}
}
