package Practice;

public class StudentObj {

    String studentName = "Nayana G R";
    String courseOpted = "CS";
    int passedOutYear = 2019;
    int CGPA = 70;

    public StudentObj ( String name, String course, int passedOut, int cgpa) {
        studentName = name;
        courseOpted = course;
        passedOutYear = passedOut;
        CGPA = cgpa;
    }
    StudentObj(){

    }

    public static void main(String[] args) {
        System.out.println("Student 1 details are: ");
        StudentObj student1 = new StudentObj();
        System.out.println("Name of the student is " + student1.studentName);
        System.out.println(student1.studentName + " Opted for " + student1.courseOpted);
        System.out.println(student1.studentName + " was passed out in the year " + student1.passedOutYear );
        System.out.println(student1.studentName + " CGPA is " + student1.CGPA);
        System.out.println(" ");


        StudentObj student2 = new StudentObj("Anusha", "BSc", 2020, 75);
        System.out.println("Student 2 details are: ");
        System.out.println("Name of the student is " + student2.studentName);
        System.out.println(student2.studentName + " Opted for " + student2.courseOpted);
        System.out.println(student2.studentName + " was passed out in the year " + student2.passedOutYear );
        System.out.println(student2.studentName + " CGPA is " + student2.CGPA);


    }
}
