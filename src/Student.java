

public class Student {

    Integer id;
    String name;
    String surname;
    Enum sex;

    public Student(Integer id) {
        this.id = id;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(Enum sex) {
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Enum getSex() {
        return sex;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSex(Enum sex) {
        this.sex = sex;
    }

    Student student1 = new Student(1, "nameStudent1", "surnameStudent", MALE);

    Student student2 = new Student(2, "nameStudent2", "surnameStudent", FEMALE);

    Student studentId = new Student((3, "nameStudent3", "surnameStudent", FEMALE);

    student1.setName("UpdatedName");


}
