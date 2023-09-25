package Class11OfHW;

class DOG{
        private  String dogName;// Instance variables
        private  int dogWeight;
      private static String dogBreed="Mutt";
    // Constructor to initialize instance variables
       public DOG(String dogName, int dogWeight){
           this.dogName=dogName;
           this.dogWeight=dogWeight;
          this.dogBreed=dogBreed;

       }

    public String getDogName() {
        return dogName;
    }

    public int getDogWeight() {
        return dogWeight;
    }

    public static String getDogBreed() {
        return dogBreed;
    }

 static class Dog {
    public static void main(String[] args) {
        // Create two Dog objects
            DOG d1=new DOG("Tarzn", (int) 50.0);
        DOG d2=new DOG("Lucy", (int) 10.0);
// Use reference variables to print details of each dog
        // Print details of the first dog
        System.out.println(d1.getDogName() + " " + DOG.getDogBreed() + " " + d1.getDogWeight());

        // Print details of the second dog
        System.out.println(d2.getDogName() + " " + DOG.getDogBreed() + " " + d2.getDogWeight());
    }
}}


