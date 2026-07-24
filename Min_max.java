//this is java code for finding Minimum & Maximum 
//make changes where i write min instead of max and < & > this operator also 
//most imp check correct value

public class findmin{
    public static int findmin(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String args[]){
        int arr[]={20,41,05,0,60,-50,-4};
        System.out.println(findmin(arr));
    }
}
