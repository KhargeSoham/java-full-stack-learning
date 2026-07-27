class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int arr[]={1,2,3,4,6,5,7};
        secondlarge(arr);
    }
    public static void secondlarge(int arr[]) {
        if(arr==null||arr.length<2){
            System.out.println("arr contain more than 2 element");
            return;
        }
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int current=0;current<arr.length;current++){
            if(arr[current]>largest){
                secondlargest=largest;
                largest=arr[current];
            }
            else if(arr[current]>largest&& arr[current]!=largest){
                secondlargest=arr[current];
            }
        }
        System.out.println("largest no is "+largest+ "and secondlargest no is "+secondlargest);
    }
}
