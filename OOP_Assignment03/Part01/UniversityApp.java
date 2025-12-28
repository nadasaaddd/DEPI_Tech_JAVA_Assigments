package OOP_Assignment03.Part01;

public class UniversityApp {

    public void main(String[] args) {
        Student student1 = new Student("Nada", 2558, "Arts");
        student1.displayStudentInfo();
        student1.updateGPA(3.8);
        Student student2= new Student("Omar",2559,"Law");
        student2.displayStudentInfo();
        student2.updateGPA(3.98);
    }

    public static class Student {
        String name;
        int studentId;
        String major;
        double gpa;

        public Student(String name, int studentId, String major) {
            this.name = name;
            this.studentId = studentId;
            this.major = major;
        }

        public void displayStudentInfo() {
            System.out.println("Student Name : " + name);
            System.out.println("Student ID : " + studentId);
            System.out.println("Student Major : " + major);
            System.out.println("Student GPA : " + gpa);
            System.out.println("------------------------");
        }

        public void updateGPA(double newGpa) {
            System.out.println("Your Current GPA : " + gpa);
            gpa = newGpa;
            System.out.println("Your New GPA : " + gpa);
            System.out.println("------------------------");
        }
    }
}
