
public class Main {
    public static void main(String[] args) {

        // Obiekty zawsze muszą być w mainie.

        Student student1 = new Student(1, "Student1", "StudentSurname1", Sex.MALE);

        Student student2 = new Student(2, "Student2", "StudentSurname2", Sex.FEMALE);

        Student student3 = new Student(3, "Student3", "StudentSurname3", Sex.FEMALE);

        student1.setName("UpdatedName");


    }
}