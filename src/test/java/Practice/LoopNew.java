package Practice;

public class LoopNew {

    public static void main(String[] args) {

        //to print data in particular line
        System.out.println("To print data in particular line");
    for(int i=1;i<=15;i++){
        if(i==10){
            System.out.println("10th line");
            continue;
        }
        System.out.println(i);
    }

        //to print data in all lines
        System.out.println("To print data in all lines");
        for(int i=1; i<=5;i++){
            System.out.println("my name");
        }

        //while loop

        System.out.println("while loop- printing 5th line");
        int i = 5;
        while (i <= 10) {
            System.out.println("This is line 5");
            break;
        }

        //infinite loop ex
//        while(true) {
//            System.out.println("abcde");
//
//        }

//        int c=10;
//        while(c<=8) {
//            System.out.println(c);
//            break;
//        }

//do while ex
//        do{
//            System.out.println("hello");
//        }while(false);

        //
//        int a=10;
//        System.out.println(a++*a++);
        //10 * 11 = 110

        //without space it will print 1010
//        int x=10;
//        String b="10";
//        System.out.println(x+b);
        //minus
//        int d=10;
//        String f="10";
//        System.out.println(d-f);

        //concatenation in sout
         int x=10;
         String b="10+10";
         System.out.println(x+b);
         //1010+10


        //
//        int a=5;
//        int c;
//        c=a+a;
//        System.out.println(c);

        //
//        int a=5,c;
//        c=a+a;
//        System.out.println(c);

        //compiler error
//        int a=10;
//        System.out.println(a++++);


        int a=10;
        System.out.println(a++);
        a++;
        System.out.println(a++);


    }
}
