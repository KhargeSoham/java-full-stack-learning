class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int arr[]={1,2,5,4,3};
        arraysort(arr);
       }
        
    
    public static void arraysort(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.print("not sorted");
                return;
            }
            
        }System.out.print("sorted");
    }
}
