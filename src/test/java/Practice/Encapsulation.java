package Practice;

class bankAcc{

        private int accNum;
        private float balance;
        private String name;

        public int getAccNum(){
            return accNum;
        }
        public float getBalance(){
            return balance;
        }
        public String getName(){
            return name;
        }

        public void setAccNum(int a){
            accNum=a;
        }
        public void setBalance(float b){
           balance=b;
        }
        public void setName(String n){
            name=n;
        }
    }

    public class Encapsulation {
    public static void main(String[] args) {
        bankAcc obj = new bankAcc();
        //obj.getAccNum();
        obj.setAccNum(123456789);
        //obj.getBalance();
        obj.setBalance(76843683.86f);
        //obj.getName();
        obj.setName("Nayana");

        System.out.println(obj.getAccNum());
        System.out.println(obj.getBalance());
        System.out.println(obj.getName());

    }
}
