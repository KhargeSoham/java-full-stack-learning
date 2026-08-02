class Main {
    public static void main(String[] args) {
        System.out.println("Start small. ");
        int arr1[] = {1,2,2,3,4};
        int arr2[] = {2,2,4,5};
        System.out.print("after union of two sorted array:");
        union(arr1,arr2);
    }
    public static void union(int arr1[],int arr2[]){
        int i=0;
        int j=0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<arr2[j]){
                if(i == 0 || arr1[i] != arr1[i-1]){
                    System.out.print(arr1[i] + " ");
                }
                i++;
            }
            else if(arr2[j]<arr1[i]){
                if(j == 0 || arr2[j] != arr2[j-1]){
                    System.out.print(arr2[j]+" ");
                }
                j++;  
            }
            else{
                if(i == 0 || arr1[i] != arr1[i-1]){
                    System.out.print(arr1[i]+" ");
                }
                i++;
                j++;
            }
        }
        while ( i < arr1.length ) {
            if(i == 0 || arr1[i] != arr1[i-1]){
                System.out.print( arr1[i] + " " );
            }
            i++;
        }
        while ( j < arr2.length ) {
            if(j == 0 || arr2[j] != arr2[j-1]){
                System.out.print( arr2[j] + " " );
            }
            j++;
        }
    }
}
