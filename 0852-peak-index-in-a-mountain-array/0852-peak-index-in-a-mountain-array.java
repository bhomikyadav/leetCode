class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            // check if arr[mid ] is a peak
            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                return mid;

            } else if (arr[mid] > arr[mid - 1]) {

                // when mid is on the left side of the peak
                start = mid;
            } else {
                // when mid is on the right side of the peak
                end = mid;
            }

            mid = start + (end - start) / 2;
        }

        // this will never excute if there is peak in the array
        return -1;
    }
}