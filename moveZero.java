class Main {
    public static void main(String[] args) {
        int arr[]={1,0,4,0,5,0};
        movezero(arr);
        System.out.print(" After moving all zero at the end: ");
        for (int i=0; i<arr.length;i++){
        System.out.print(" "+arr[i]);
            
        }
       
    }
    public static void movezero(int []arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        
    }
}
