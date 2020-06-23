import model.Student;
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("karol");
        student.setAge(23);
        student.setGender("girl");
        student.setID(001);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
        System.out.println(student.getID());
    }
}
