package HW25and26;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
    class Student {
        private String name;
        private int studentId;

        public Student(String name, int studentId) {
            this.name = name;
            this.studentId = studentId;
        }

        public String getName() {
            return name;
        }

        public int getStudentId() {
            return studentId;

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return studentId == student.studentId && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, studentId);
        }

        public static void main(String[] args) {
            // Create a HashSet to hold Student objects
            Set<Student> studentSet = new HashSet<>();

            Student student1 = new Student("Ali", 105);
            Student student2 = new Student("Boby", 100);
            Student student3 = new Student("Cheress", 120);

            studentSet.add(student1);
            studentSet.add(student2);
            studentSet.add(student3);


            System.out.println("Names of students:");
            for (Student student : studentSet) {
                System.out.println(student.getName());
            }
        }
    }


