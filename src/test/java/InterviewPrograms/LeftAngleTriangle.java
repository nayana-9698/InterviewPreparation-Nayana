package InterviewPrograms;

public class LeftAngleTriangle {

    public static void main(String[] args) {
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        int n=5;

        for(int i=1;i<=n;i++){ //to print rows

            for(int j=i; j<=n;j++){ //to print columns with empty spaces
                System.out.print("  "); //give two space to get left angle triangle
            }
            for(int j=1;j<=i;j++){ //to print * for columns
                System.out.print("* "); //give one space after the star
            }
            System.out.println(); //to go to next line after each row
        }


    }
}
