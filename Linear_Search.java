
//Data structure - Linear Search
class Main {
    public static void main(String[] args) {
        System.out.println("Start small.");
        int arr[]={10,20,30,40,50};
        int target=30;
        boolean found=false;
        for(int i= 0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("element found at position"+i+"the no is "+target);
                found=true;
                break;
            }
        }
        if(!found){
                System.out.println("element not found at position");
            }
    }
}
