class Main {
    public static void main(String[] args) {
       
        int arr[]={1,1,2,2,3,3,4};
        int result=removeduplicate(arr);
        System.out.println("no of unique element are :"+result);
        System.out.println("after removing duplicate :");
        for(int i =0;i<result;i++){
            System.out.println(arr[i]+ "  ");
        }
        
    }
    public static int removeduplicate(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
            i++;
            arr[i]=arr[j];
                
            }
            
        }return i+1;
    }
}
