package Class11OfHW;
/*Create a property file to store following configurations:
browser=chrome
url=https://facebook.com/
username
password*/
        import java.io.FileInputStream;
        import java.io.IOException;
        import java.util.Properties;
        public class GotoFacebook {
        public static void main(String[] args) throws IOException {
        String path="C:\\Users\\tamim\\IdeaProjects\\JavaSyntac\\Files\\configu.Property";
                    Properties proper = new Properties();
                    FileInputStream file = new FileInputStream(path);
                    proper.load(file);
                    // Get values from the properties file
                    String browser = proper.getProperty("browser");
                    String url = proper.getProperty("URL");
                    String username = proper.getProperty("userName");
                    String password = proper.getProperty("password");
                    // Print the values
                    System.out.println("browser: " + browser);
                    System.out.println("URL: " + url);
                    System.out.println("userName: " + username);
                    System.out.println("password: " + password);
                }

                }





