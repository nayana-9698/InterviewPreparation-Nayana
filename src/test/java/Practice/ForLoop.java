package Practice;

public class ForLoop {
    public static void main(String[] args) {
        int n, i;
        n=2;
        for(i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+n*i);
        }
        //for each loop
        System.out.println("For each loop:");
        int a[]={20,21,22,23,24};
        for(int ii:a){
            System.out.println(ii);
    }
    }
}
