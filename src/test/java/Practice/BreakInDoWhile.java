package Practice;

public class BreakInDoWhile {
    public static void main(String[] args) {
        int i=1;
        do
        {
            {
                if(i==15)
                    i++;
                break;
            }
            //System.out.println(i);
            //i++;
        }while(i<=20);
    }
}
