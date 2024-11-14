package studentinformationsystem;

public class Student {
    String name;
    String studentNo;
    int classes;
    Course math;
    Course physics;
    Course chemistry;
    int oralNoteMath;
    int oralNotePhysics;
    int oralNoteChemistry;
    int oralPercent;
    int examPercent;
    int averagePercent = 100;
    double average;
    boolean isPass;

    Student(String name, int classes, String studentNo, Course math, Course physics, Course chemistry,
            int oralPercent, int examPercent) {
        this.name = name;
        this.classes = classes;
        this.studentNo = studentNo;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;

        if (oralPercent + examPercent == averagePercent) {
            this.oralPercent = oralPercent;
            this.examPercent = examPercent;
        }

        calculateAverage();
        this.isPass = false;
    }

    void addOralNote(int oralNoteMath, int oralNotePhysics, int oralNoteChemistry) {
        if (oralNoteMath >= 0 && oralNoteMath <= 100) {
            this.oralNoteMath = oralNoteMath;
        }
        if (oralNotePhysics >= 0 && oralNotePhysics <= 100) {
            this.oralNotePhysics = oralNotePhysics;
        }
        if (oralNoteChemistry >= 0 && oralNoteChemistry <= 100) {
            this.oralNoteChemistry = oralNoteChemistry;
        }
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
        if (this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0 ||
                this.oralNoteMath == 0 || this.oralNotePhysics == 0 || this.oralNoteChemistry == 0) {
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
        this.average = ((this.math.note * examPercent + oralNoteMath * oralPercent) +
                (this.physics.note * examPercent + oralNotePhysics * oralPercent) +
                (this.chemistry.note * examPercent + oralNoteChemistry * oralPercent)) / 300.0;
    }

    boolean isCheckPass() {
        calculateAverage();
        return this.average > 55;
    }

    void printNote() {
        System.out.println("--------------------------");
        System.out.println("Öğrenci: " + this.name);
        System.out.println("Sınav Ortalama Yüzdesi: " + examPercent);
        System.out.println("Sözlü Ortalama Yüzdesi: " + oralPercent);
        System.out.println("Matematik Notu: " + this.math.note);
        System.out.println("Fizik Notu: " + this.physics.note);
        System.out.println("Kimya Notu: " + this.chemistry.note);
        System.out.println("Matematik Sözlü Notu: " + this.oralNoteMath);
        System.out.println("Fizik Sözlü Notu: " + this.oralNotePhysics);
        System.out.println("Kimya Sözlü Notu: " + this.oralNoteChemistry);
    }
}