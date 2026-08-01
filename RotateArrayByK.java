class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        rotateArrk(arr,k);
        System.out.print("after rotate by k:");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    public static void reverse(int arr[],int start,int end){
       while(start<end){
           int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
       }
        
    }
    public static void rotateArrk(int arr[],int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
}
