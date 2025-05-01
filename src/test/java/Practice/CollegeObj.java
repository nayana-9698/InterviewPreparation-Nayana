package Practice;

public class CollegeObj {
    String colName ="SABS";
    String colAddress = "Bangalore";
    int colBranches = 5;
    String courseOffered = "Bcom,BCA,BBA";

    public CollegeObj ( String name, String address, int branches, String course) {

        colName =name;
        colAddress = address;
        colBranches = branches;
        courseOffered = course;
    }
    CollegeObj(){

    }
    public static void main(String[] args) {
        CollegeObj col = new CollegeObj();
        System.out.println("Name of the first college is " + col.colName);
        System.out.println("College is located at " + col.colAddress );
        System.out.println("Total number of branches are " + col.colBranches);
        System.out.println("Course offered are " + col.courseOffered);
        System.out.println(" ");

        CollegeObj col2 = new CollegeObj("KLE", "BDA Complex", 2 , "Computer Science");
        System.out.println("Name of the second college is " + col2.colName);
        System.out.println("College is located at " + col2.colAddress );
        System.out.println("Total number of branches are " + col2.colBranches);
        System.out.println("Course offered are " + col2.courseOffered);
        System.out.println(" ");

        CollegeObj col3 = new CollegeObj("Surana", "Kengeri", 1, "Bcom");
        System.out.println("Name of the third college is " + col3.colName);
        System.out.println("College is located at " + col3.colAddress );
        System.out.println("Total number of branches are " + col3.colBranches);
        System.out.println("Course offered are " + col3.courseOffered);

    }



}
