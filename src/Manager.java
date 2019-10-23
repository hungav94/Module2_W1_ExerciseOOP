public class Manager {
    private int id;
    private String fullName;
    private String address;
    private String phoneNumber;
    int index = 0;

    public Manager() {
    }

    public Manager(int id, String fullName, String address, String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setMarkStudent(Student student, double newMark) {
        student.setMark(newMark);
    }

    public void addStudent(Student student, Student[] studentsList) {
        studentsList[index] = student;
        index++;
    }

    public void deleteStudent(int id, Student[] studentsList) {
        Student temp;
        Student student = new Student();
        for (int i = 0; i < studentsList.length - 1; i++) {
            if (studentsList[i].getId() == id) {
                temp = studentsList[i];
                studentsList[i] = studentsList[i + 1];
                studentsList[i + 1] = temp;
            }
        }
        studentsList[studentsList.length - 1] = student;
    }

    public double getAveMarkStudent(Student[] studentsList) {
        double sum = 0;
        for (int i = 0; i < studentsList.length; i++) {
            sum += studentsList[i].getMark();
        }
        return sum / studentsList.length;
    }
}
