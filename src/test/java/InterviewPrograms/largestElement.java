package InterviewPrograms;

public class largestElement {

    //WAP to find the largest element in an array

    public static int findLargest(int[] arr) {

        //int max = arr[0];
        int max= Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10, 500, 30, 300, 700, 900};
        System.out.println("The largest element in the array is: " + findLargest(arr));

    }

}


