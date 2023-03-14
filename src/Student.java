

public class Student {


    // te fieldy powinny mieć status private
    private Integer id;
    private String name;
    private String surname;
    private Sex sex;

    public Student(Integer id, String name, String surname, Sex sex) {
        this.id = id;
        this.name = name;
        this.surname = surname;
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

    public Sex getSex() {
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

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void presentYourself() {
        System.out.println("hello, my name is " + name + " " + surname + ". I am a " + sex + " and my index number is: " + id);
    }







}
