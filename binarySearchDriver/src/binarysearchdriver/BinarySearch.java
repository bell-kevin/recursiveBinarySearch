package binarysearchdriver;

public class BinarySearch {
    
    public static int binarySearch(int[] arr, int first, int last, int target) {
        int mid;
        int index;
        System.out.printf("first=%d, last=%d\n", first, last);
        if (first == last) {
            if (arr[first] == target) {
                index = first;
                System.out.println("found");
            } else {
                index = -1;
                System.out.println("not found");
            }
        } else {
            mid = (last + first) / 2;
            if (target > arr[mid]) {
                first = mid + 1;
            } else {
                last = mid;
            }
            index = binarySearch(arr, first, last, target);
            System.out.println("returnedValue=" + index);
        }
        return index;
    } // end binarySearch
} // end BinarySearch class
