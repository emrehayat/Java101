package studentinformationsystem;

public class Main {
    public static void main(String[] args) {
        Course math = new Course("Matematik", "MAT101", "MAT");
        Course physics = new Course("Fizik", "FZK101", "FZK");
        Course chemistry = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Kerem Hoca", "09555500550", "MAT");
        Teacher t2 = new Teacher("Fatma Hoca", "09525530554", "FZK");
        Teacher t3 = new Teacher("Ali Hoca", "09557506555", "KMY");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("Kerem Ali", 4, "117406289", math, physics, chemistry, 25, 75);
        s1.addBulkExamNote(50,35,62);
        s1.addOralNote(70,60,80);
        s1.isPass();

        Student s2 = new Student("Zeynep", 2, "218908734", math, physics, chemistry, 40, 60);
        s2.addBulkExamNote(40,86,74);
        s2.addOralNote(90, 85, 75);
        s2.isPass();

        Student s3 = new Student("Efe", 3, "240500732", math, physics, chemistry, 30, 70);
        s3.addBulkExamNote(88,75,94);
        s3.addOralNote(100, 90, 95);
        s3.isPass();
    }
}