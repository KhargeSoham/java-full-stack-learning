import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Program started");
		int arr[]={5,1,4,19,2,81,8,5};
		leader(arr);
	}
	public static void leader(int arr[]){
	    ArrayList<Integer> list=new ArrayList<Integer>();
	    int max=arr[arr.length-1];
	    list.add(max);
	    
	    for(int i=arr.length-2;i>=0;i--){
	        if(arr[i]>max){
                max=arr[i];
	            list.add(max);
	        }
	    }
	    for(int i=list.size();i<=0;i--){
	        System.out.print(list.get(i)+"  ");
	    }
	    System.out.println("");
	}
}
