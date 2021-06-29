class Main {
 public int binarySearch(int[] arr, int n) {
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;
        int index = -1;
        while (low <= high) {
            if (arr[mid] > n) {
                high = mid - 1;
            } else if (arr[mid] < n) {
                low = mid + 1;
            } else {
                index = mid;
                return index;
            }

            mid = (low + high) / 2;
        }
        return -1;

    }

    public static void main(String[] args) {
        Main binary = new Main();
        int[] arr = {0,1, 5, 6, 8, 14};
        int x = binary.binarySearch(arr, 5);
        int y = binary.binarySearch(arr, 14);
        int z = binary.binarySearch(arr, 20);
       
        System.out.println(x + " " + y +" "+ z +" ");
    }

}