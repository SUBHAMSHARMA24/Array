public class Lastoccurance
{
    static int Lastocc(int arr[], int x){
        int lastindex=-1;;
        int a=arr.length;
        for(int i=0;i<a;i++){
            if(arr[i]==x){
                lastindex=i;;
            }
        }
        return lastindex;
    }
	public static void main(String[] args) {
	    int arr[]={1,2,5,3,4,5};
	    int x=5;
		System.out.println("last occurrence: "+Lastocc(arr,x));
	}
}
