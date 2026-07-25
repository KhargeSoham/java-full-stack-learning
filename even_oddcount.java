class Main {
    public static void main(String[] args) {
        int arr[]={2,5,4,9,6,7};
        counteo(arr);
    }

    public static void counteo(int []arr){
        int evencount=0;
        int oddcount=0;
        int evensum=0;
        int oddsum=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evencount++;
                evensum+=arr[i];
            }else{
                oddcount++;
                oddsum+=arr[i];
            }
        }

        System.out.println("even = "+evencount+" odd = "+oddcount);
        System.out.println("even = "+evensum+" odd = "+oddsum);
    }
}
