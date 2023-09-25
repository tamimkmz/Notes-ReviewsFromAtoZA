package GroupExercise2;
/*Provide Implementation for the diagram below. Then create a test class
in which you need to create Objects of ChromeDriver, FirefoxDrive and
SafariDriver classes and see which methods available to them.*/
class WebDriver {
    public void get(String url) {
        System.out.println("Navigating to: " + url);
    }
    public void click(String element) {
        System.out.println("Clicking on element: " + element);
    }
    public void close() {
        System.out.println("Closing the browser");
    }
}
class ChromeDriver extends WebDriver {
    public void maximize() {
        System.out.println("Maximizing Chrome window");
    }
}
class EdgeDriver extends WebDriver {
    public void setEdgeOptions(String options) {
        System.out.println("Setting Edge options: " + options);
    }
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        EdgeDriver edgeDriver = new EdgeDriver();

        System.out.println("ChromeDriver methods:");
        chromeDriver.get("https://www.google.com");
        chromeDriver.click("Button");
        chromeDriver.maximize();
        chromeDriver.close();

        System.out.println("\nEdgeDriver methods:");
        edgeDriver.get("https://www.bing.com");
        edgeDriver.click("Link");
        edgeDriver.setEdgeOptions("Option1");
        edgeDriver.close();
    }
}


