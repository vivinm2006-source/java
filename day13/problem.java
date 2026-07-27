package day13;

class Student {
    int studentId;
    String studentName;

    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    void displayStudent() {
        System.out.println("Student ID : " + studentId);
        System.out.println("Student Name : " + studentName);
    }
}

class Mentor extends Student {
    int mentorId;
    String mentorName;

    Mentor(int studentId, String studentName, int mentorId, String mentorName) {
        super(studentId, studentName);
        this.mentorId = mentorId;
        this.mentorName = mentorName;
    }

    void displayMentor() {
        displayStudent();
        System.out.println("Mentor ID : " + mentorId);
        System.out.println("Mentor Name : " + mentorName);
    }
}

class HOD extends Mentor {
    int hodId;
    String hodName;

    HOD(int studentId, String studentName,
        int mentorId, String mentorName,
        int hodId, String hodName) {

        super(studentId, studentName, mentorId, mentorName);
        this.hodId = hodId;
        this.hodName = hodName;
    }

    void displayHOD() {
        displayMentor();
        System.out.println("HOD ID : " + hodId);
        System.out.println("HOD Name : " + hodName);
    }
}

public class problem {
    public static void main(String[] args) {

        Student s = new Student(101, "Saravanan");

        Mentor m = new Mentor(101, "Saravanan", 201, "Ramesh");

        HOD h = new HOD(101, "Saravanan", 201, "Ramesh", 301, "Kumar");

        System.out.println("----- Student Details -----");
        s.displayStudent();

        System.out.println("\n----- Mentor View -----");
        m.displayMentor();

        System.out.println("\n----- HOD View -----");
        h.displayHOD();
    }
}