package studentinformationsystem;

public class Student {
    String name;
    String studentNo;
    int classes;
    Course math;
    Course physics;
    Course chemistry;
    double average;
    boolean isPass;

    Student(String name, int classes, String studentNo, Course math, Course physics, Course chemistry) {
        this.name = name;
        this.classes = classes;
        this.studentNo = studentNo;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calculateAverage();
        this.isPass = false;
    }

    void addBulkExamNote(int math, int physics, int chemistry) {
        if (math >= 0 && math <= 100) {
            this.math.note = math;
        }
        if (physics >= 0 && physics <= 100) {
            this.physics.note = physics;
        }
        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.note = chemistry;
        }
    }

    void isPass() {
        if (this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama: " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti!");
            } else {
                System.out.println("Sınıfta Kaldı!");
            }
        }
    }

    void calculateAverage() {
        this.average = (this.math.note + this.physics.note + this.chemistry.note) / 3.0;
    }

    boolean isCheckPass() {
        calculateAverage();
        return this.average > 55;
    }

    void printNote() {
        System.out.println("--------------------------");
        System.out.println("Öğrenci: " + this.name);
        System.out.println("Matematik Notu: " + this.math.note);
        System.out.println("Fizik Notu: " + this.physics.note);
        System.out.println("Kimya Notu: " + this.chemistry.note);
    }
}