import java.io.Console;
import java.util.Scanner;

import static java.lang.Character.isDigit;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name;
        boolean repeatLoop;

        System.out.println("What is your name?");
        do {
            name = scan.nextLine();
            repeatLoop = name.matches("[0-9]*");
            if (repeatLoop) {
                System.out.println("Name must contain letters only.");
            }
        } while (repeatLoop);

        String surname;
        System.out.println("What is your surname?");
        do {
            surname = scan.nextLine();
            repeatLoop = surname.matches("[0-9]*");
            if (repeatLoop) {
                System.out.println("Surname must contain letters only");
            }
        } while (repeatLoop);

        String id;
        System.out.println("What is your index number?");
        do {
            id = scan.nextLine();
            repeatLoop = !id.matches("[0-9]{6}");
            if (repeatLoop) {
                System.out.println("Index number should consist of 6 digits. Try again, what is your index number?");
            }
        } while (repeatLoop);


        Sex sex;
        String sexInput = "";
        System.out.println("What is your sex? Answer M for MALE or F for FEMALE");

        do {
            sexInput = scan.nextLine();
            repeatLoop = (!sexInput.equalsIgnoreCase("M") && !sexInput.equalsIgnoreCase("F"));
            if (repeatLoop) {
                System.out.println("Try again, what is your sex? If MALE answer M, for FEMALE answer F");
            }

        } while (repeatLoop);

        if (sexInput.equalsIgnoreCase("M")) {
            sex = Sex.MALE;
        } else {
            sex = Sex.FEMALE;
        }


        Student newStudent = new Student(Integer.parseInt(id), name, surname, sex);
        System.out.println(newStudent.getId());
        System.out.println(newStudent.getName());
        System.out.println(newStudent.getSurname());
        System.out.println(newStudent.getSex());


        // Obiekty zawsze muszą być w mainie.

        Student student1 = new Student(1, "Student1", "StudentSurname1", Sex.MALE);

        Student student2 = new Student(2, "Student2", "StudentSurname2", Sex.FEMALE);

        Student student3 = new Student(3, "Student3", "StudentSurname3", Sex.FEMALE);


    }
}

