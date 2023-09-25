package HW25and26;

import java.util.Map;
import java.util.TreeMap;


    class Person {
        private String name;
        private String lastName;
        private int age;
        private double salary;

        public Person(String name, String lastName, int age, double salary) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public double getSalary() {
            return salary;
        }

        public void printDetails() {
            System.out.println("Name: " + name);
            System.out.println("Last Name: " + lastName);
            System.out.println("Age: " + age);
            System.out.println("Salary: $" + salary);
        }

        public static void main(String[] args) {

            Map<Integer, Person> personMap = new TreeMap<>();


            personMap.put(3, new Person("John", "Doe", 30, 50000.0));
            personMap.put(1, new Person("Alice", "Smith", 25, 45000.0));
            personMap.put(2, new Person("Bob", "Johnson", 35, 60000.0));


            System.out.println("Person Details:");
            for (Map.Entry<Integer, Person> entry : personMap.entrySet()) {
                int personId = entry.getKey();
                Person person = entry.getValue();

                System.out.println("Person ID: " + personId);
                person.printDetails();
                System.out.println();
            }
        }
    }
