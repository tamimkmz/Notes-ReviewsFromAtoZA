package Replit1;
//Declare 3 instance variables to hold:
//- name of the country
//- capital
//- population size
//Create a method to display values of instance variables
//Create 2 Object, assign values to instance variables, execute method display;
//**Expected Output:**
//The capital of USA is Washington DC and population is 330000000
//The capital of Kazakhstan is Astana and population is 18500000
public class Country {
    String nameOfTheCountry;
    String Capital;

    int populationSize;
    public Country(String nameOfTheCountry, String Capital, int populationSize){
      this.nameOfTheCountry=nameOfTheCountry;
      this.Capital=Capital;
      this.populationSize=populationSize;

    }
public void printInfo(){
    System.out.println(nameOfTheCountry);
    System.out.println(Capital);
    System.out.println(populationSize);

        }

    public static void main(String[] args) {
        Country can1=new Country("The capital of USA is ", "Washington DC and population is ", 330000000);
        can1.printInfo();
        System.out.println();

        Country can2=new Country("The capital of Kazakhstan is ", "Astana and population is ", 18500000);
        can2.printInfo();
        System.out.println();
        }
    }


