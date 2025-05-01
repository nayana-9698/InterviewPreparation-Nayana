package InterviewPrograms;

public class secLargestNum {

    public static void main(String[] args) {
        int[] arr = {10,50,20,100,300,40};
        int max1 = Integer.MIN_VALUE; //10
        int max2 = Integer.MIN_VALUE; //10

        for(int i=0;i<arr.length;i++ ){
            if(arr[i]>max1){ //20>50
                max2 =max1; //max2 = 10
                max1 = arr[i]; //max1=50
            }else if(arr[i]>max2 && arr[i]!= max1 ){
                max2 = arr[i]; //max2= 20
            }
        }
        System.out.println("Second largest element is :" + max2);
    }

}
