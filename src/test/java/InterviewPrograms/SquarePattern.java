package InterviewPrograms;

public class SquarePattern {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) { //this for loop is for rows
            for (int j = 1; j <= n; j++) { //this for loop is for columns
                System.out.print(" * ");
            }
            System.out.println(" "); //this sout is for coming to next line after printing 5 stars
        }
    }
}

