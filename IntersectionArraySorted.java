//the program simple implementation of intersection of 2 array 
class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int []arr1={1,2,3,4};
        int []arr2={2,3,4,5};
        intersection(arr1,arr2);
        
    }
    public static void intersection(int arr1[],int arr2[]){
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            }else if(arr2[j]<arr1[i]){
                j++;
            }else if(arr1[i]==arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
        }
    }
}
