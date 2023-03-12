import java.io.Console;
import java.util.Scanner;

import static java.lang.Character.isDigit;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scan.nextLine();

        while (name.matches("[0-9]*")) {
            System.out.println("Name must contains letters only.");
            name = scan.nextLine();
        }


        System.out.println("What is your surname?");
        String surname = scan.nextLine();

        while (surname.matches("[0-9]*")) {
            System.out.println("Surname must contains letters only");
            surname = scan.nextLine();
        }

        System.out.println("What is your index number?");
        String id = scan.nextLine();

        while (!id.matches("[0-9]{6}")) {

            System.out.println("Index number should consist of 6 digits. Try again, what is your index number?");
            id = scan.nextLine();
        }


        System.out.println("What is your sex? Answer M for MALE or F for FEMALE");
        Sex sex;
        String sexInput = "";
        sexInput = scan.nextLine();


        while (!sexInput.equalsIgnoreCase("M") && !sexInput.equalsIgnoreCase("F")) {
            System.out.println("Try again, what is your sex? If MALE answer M, for FEMALE answer F");
            sexInput = scan.nextLine();
        }

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

