package DragAndDrop;

public class Book {
    String name;
    String phoneNumber;

    public Book(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

}

class UserInfo extends Book {
    String address;
    public UserInfo(String name, String phoneNumber,String address) {
        super(name,phoneNumber);
        this.address=address;
    }
    void userDetails(){
        System.out.println("name:"+name+" phone number: "+ phoneNumber +" adress:"+address);
    }

}
class UserTester {
    public static void main(String[] args) {
        UserInfo us1=new UserInfo("Tamim","+9054214526","San Diego");
        us1.userDetails();
    }
}





