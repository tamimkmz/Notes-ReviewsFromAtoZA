package RevisedPackage;
/*Create a class Animal in which define instance variable type, constructor that will initialize instance variables and
 2 methods eat and sleep.
Create a subclass Cat in which override method sleep
Create 3 Kitten subclasses of a Cat class and override method eat
for 1 kitten - eats milk
for 2 kitten - eats snack
for 3 kitten - eats everything
In main method create object of Cat class and all 3 kittens classes and
 store into an array of Animals. Call available methods:
**Expected Output:**
Cat eats
Cat sleeps a lot
kitten1 eats milk
kitten1 sleeps a lot
kitten2 eats snacks
kitten2 sleeps a lot
kitten3 eats everything
kitten3 sleeps a lot
```
*/
class Animal {
        public void eat() {
            System.out.println("Animal eats");
        }

        public void sleep() {
            System.out.println("Animal sleeps a lot");
        }
    }

    class Cat extends Animal {
        @Override
        public void eat() {
            System.out.println("Cat eats");
        }

        @Override
        public void sleep() {
            System.out.println("Cat sleeps a lot");
        }
    }

    class Kitten1 extends Cat {
        @Override
        public void eat() {
            System.out.println("kitten1 eats milk");
        }
        @Override
        public void sleep() {
            System.out.println("kitten1 sleeps a lot");
        }
    }

    class Kitten2 extends Cat {
        @Override
        public void eat() {
            System.out.println("kitten2 eats snacks");
        }

        @Override
        public void sleep() {
            System.out.println("kitten2 sleeps a lot");
        }
    }

    class Kitten3 extends Cat {
        @Override
        public void eat() {
            System.out.println("kitten3 eats everything");
        }

        @Override
        public void sleep() {
            System.out.println("kitten3 sleeps a lot");
        }


        public static void main(String[] args) {
            Animal[] animals = new Animal[4];
            animals[0] = new Cat();
            animals[1] = new Kitten1();
            animals[2] = new Kitten2();
            animals[3] = new Kitten3();

            for (Animal animal : animals) {
                animal.eat();
                animal.sleep();
            }
        }
    }



