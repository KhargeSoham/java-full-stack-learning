class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        rotateArrLast(arr);

        System.out.println("After rotating the last element to index 0:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotateArrLast(int arr[]) {
        int temp = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = temp;
    }
}
