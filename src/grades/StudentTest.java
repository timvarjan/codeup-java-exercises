package src.grades;

    public class StudentTest {
        public static void main(String[] args) {
            Student student1 = new Student("John Smith");
            student1.addGrade(85);
            student1.addGrade(90);
            student1.addGrade(78);
            System.out.println("Student: " + student1.getName());
            System.out.println("Average Grade: " + student1.getGradeAverage());

            Student student2 = new Student("Jane Doe");
            student2.addGrade(92);
            student2.addGrade(88);
            student2.addGrade(95);
            System.out.println("Student: " + student2.getName());
            System.out.println("Average Grade: " + student2.getGradeAverage());
        }
    }

