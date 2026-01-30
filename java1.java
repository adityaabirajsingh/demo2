public class java1 {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 7, 10, 15, 20};
        System.out.println(binarySearch(nums, 10)); // Output: 3
    }
}

