package src.grades;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Creating student objects
        Student student1 = new Student("Cam Smith");
        student1.addGrade(85);
        student1.addGrade(90);
        student1.addGrade(78);
        students.put("rocketman92", student1);

        Student student2 = new Student("Rose Cafe");
        student2.addGrade(92);
        student2.addGrade(88);
        student2.addGrade(95);
        students.put("coffee_rose19", student2);

        Student student3 = new Student("Erlich Bachman");
        student3.addGrade(80);
        student3.addGrade(85);
        student3.addGrade(92);
        students.put("aviato_incubator21", student3);

        Student student4 = new Student("Ken Doll");
        student4.addGrade(42);
        student4.addGrade(44);
        student4.addGrade(21);
        students.put("handsome22", student4);

        String userInput;
        Student student = null;
        do {
            // Print GitHub usernames
            System.out.println("GitHub Usernames:");
            for (String username : students.keySet()) {
                System.out.println(username);
            }

            // Ask for user input
            System.out.print("Enter a GitHub username to see more information: ");
            userInput = scanner.nextLine();

            // Check if the entered username exists in the map
            if (students.containsKey(userInput)) {
                student = students.get(userInput);
                System.out.println("Student: " + student.getName());
                System.out.println("Grades: " + student.getGrades());
                System.out.println("Average Grade: " + student.getGradeAverage());

                HashMap<String, String> attendance = student.getAttendance();
                System.out.println("Attendance:");
                for (Map.Entry<String, String> entry : attendance.entrySet()) {
                    System.out.println("Date: " + entry.getKey() + ", Status: " + entry.getValue());
                }

                System.out.println("Attendance Percentage: " + student.getAttendancePercentage() + "%");
                System.out.println("Absent Dates: " + student.getAbsentDates());
            } else {
                System.out.println("No users with that username were found.");
            }


            // Ask if the user wants to continue
            System.out.print("Do you want to continue? (yes/no): ");
            userInput = scanner.nextLine();
        } while (userInput.equalsIgnoreCase("yes"));

        scanner.close();

        System.out.println("Attendance: " + Objects.requireNonNull(student).getAttendancePercentage() + "%");
        System.out.println("Absent Dates: " + student.getAbsentDates());
        System.out.println();
    }
}


