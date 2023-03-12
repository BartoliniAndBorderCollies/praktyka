import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scan.next();


        System.out.println("What is your surname?");
        String surname = scan.next();

        System.out.println("What is your index number?");
        String id = String.valueOf(scan.nextInt());
        while (!id.matches("[0-9]{6}")) {

            System.out.println("Index number should consist of 6 digits. Try again, what is your index number?");
            id = String.valueOf(scan.nextInt());

        }

        System.out.println("What is your sex? Answer M for MALE or F for FEMALE");
        Sex sex;
        String sexInput = "";

        while (!sexInput.equalsIgnoreCase("M") || !sexInput.equalsIgnoreCase("F")) {
            System.out.println("Try again, what is your sex? If MALE answer M, for FEMALE answer F");

            sexInput = scan.nextLine();
        }



            if (sexInput.equalsIgnoreCase("M")) {
                sex = Sex.MALE;
            } else if (sexInput.equalsIgnoreCase("F")) {
                sex = Sex.FEMALE;
            }




            System.out.println("This is your data and it will be saved: id number " + id + ", " + name + ", " + surname + ", " + sexInput);


            // Obiekty zawsze muszą być w mainie.

            Student student1 = new Student(1, "Student1", "StudentSurname1", Sex.MALE);

            Student student2 = new Student(2, "Student2", "StudentSurname2", Sex.FEMALE);

            Student student3 = new Student(3, "Student3", "StudentSurname3", Sex.FEMALE);


        }
    }
