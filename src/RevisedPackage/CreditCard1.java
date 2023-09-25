package RevisedPackage;

public class CreditCard1 {
    public void CalInterest(double balance){

        System.out.println(balance*0.10);
    }
}
class visa extends CreditCard1{

    public void calInterest(double balance) {

    }
}
class AX extends CreditCard1{
    public void calInterest(double balance){
        System.out.println(balance*15.29);

        }
    }
