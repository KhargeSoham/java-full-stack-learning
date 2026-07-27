class Main {
    public static void main(String[] args) {
        int arr[]={-1,2,-5,6,-10,6};
        secondsmallest(arr);
        
    }
    public static void secondsmallest(int []arr){
        int smallest=Integer.MAX_VALUE;
        int secondsmallest=Integer.MAX_VALUE;
        if(arr==null||arr.length<2){
            System.out.println("enter atleast 2 or more tahn 2");
            return;
        }
        for(int current =0;current<arr.length;current++){
            if(arr[current]<smallest){
                secondsmallest=smallest;
                smallest=arr[current];
            }
            else if(arr[current] > smallest && arr[current] < secondsmallest){
                secondsmallest=arr[current];
            }
        }
        System.out.println("smallest no is:"+smallest+ "and second smallest is:"+secondsmallest);
    }
}
