package Practice;

public class QaSession {
static int a;
    public static void main(String[] args) {

        //to print default value of int
        QaSession obj = new QaSession();
        System.out.println(QaSession.a);

        //
        int a=10;
        System.out.println(a*a--);


        //preceding
        int b=5+5*2+2*2+(2*3);
        System.out.println(b);

    //
        if(0==0){
            System.out.println("sun");
        }else{
            System.out.println("moon");
        }

        //compilation error bcz 0 is int and not taken in if condition
//        if(0){
//            System.out.println("sun");
//        }else{
//            System.out.println("moon");
//        }


    }
}
