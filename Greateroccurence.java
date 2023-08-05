public class Greateroccurence
{
    static int Greaterocc(int arr[], int x){
        int count=0;
        int a=arr.length;
        for(int i=0;i<a;i++){
            if(arr[i]>x){
                count+=1;;
            }
        }
        return count;
    }
	public static void main(String[] args) {
	    int arr[]={1,5,11,12,6};
	    int x=5;
		System.out.println("Strictly Greater occurrence: "+Greaterocc(arr,x));
	}
}
