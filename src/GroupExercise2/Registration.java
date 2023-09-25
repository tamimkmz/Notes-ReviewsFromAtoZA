package GroupExercise2;
/*Create Registration Class in which you would have variables as
email, userName and password that have an access scope only
within its own class. After creating an object of the class user should
be able to call methods and in each method separately pass values
to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid password cannot contain
userName*/
public class Registration {
    private String email;
    private String userName;
    private String password;
    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
        } else {
            System.out.println("Invalid email. Only Yahoo are allowed.");
        }
    }
    public void setUserName(String userName) {
        if (userName.length() > 7) {
            this.userName = userName;
        } else {
            System.out.println("Username should be at least 8 characters.");
        }
    }
    public void setPassword(String password) {
        if (password.length() > 7 && !password.contains(userName)) {
            this.password = password;
        } else {
            System.out.println("Password should be at least 8 characters long and cannot contain @ # !.");
        }
    }
    public void displayUserInfo() {
        System.out.println("Email: " + email);
        System.out.println("Username: " + userName);
        System.out.println("Password: " + password);
    }
    public static void main(String[] args) {
        Registration reg = new Registration();
        reg.setEmail("johny@yahoo.com");
        reg.setUserName("johnyjohny");
        reg.setPassword("johny123");
        reg.displayUserInfo();
    }
}
