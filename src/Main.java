import java.util.ArrayList;

public class Main {
    public static void studentList(Student[] studentList) {
        for (int i = 0; i < studentList.length; i++) {
            System.out.print(studentList[i].getId() + " ");
        }
    }

    public static void main(String[] args) {
        Student[] studentList = new Student[6];
        Student student1 = new Student(1, "Nguyễn Văn A", "Codegym", "0123456789", 5);
        Student student2 = new Student(11, "Nguyễn Văn B", "Codegym", "0123456789", 6);
        Student student3 = new Student(111, "Nguyễn Văn C", "Codegym", "0123456789", 7);
        Student student4 = new Student(2, "Nguyễn Văn D", "Codegym", "0123456789", 3);
        Student student5 = new Student(22, "Nguyễn Văn E", "Codegym", "0123456789", 6);
        Student student6 = new Student(222, "Nguyễn Văn F", "Codegym", "0123456789", 9);

        Manager manager = new Manager(1, "Kiều Anh", "Codegym", "096300692");

        manager.addStudent(student1, studentList);
        manager.addStudent(student2, studentList);
        manager.addStudent(student3, studentList);
        manager.addStudent(student4, studentList);
        manager.addStudent(student5, studentList);
        manager.addStudent(student6, studentList);

        manager.deleteStudent(11, studentList);
        System.out.println();
        studentList(studentList);

        System.out.println("\n" + manager.getAveMarkStudent(studentList));

    }
}
