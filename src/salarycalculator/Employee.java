package salarycalculator;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax = 0;
    double bonus = 0;
    double raiseSalary = 0;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax() {
        if (salary < 1000) {
            System.out.println("Vergi: " + tax);
        } else {
            tax = salary * 0.03;
            System.out.println("Vergi: " + tax);
        }
    }

    void bonus() {
        if (workHours > 40) {
            bonus = 30 * (workHours - 40);
            System.out.println("Bonus: " + bonus);
        } else {
            System.out.println("Bonus: " + bonus);
        }
    }

    void raiseSalary() {
        //Projede şu anki yılın 2021 olarak kabul edilmesi istenmiştir.
        if (2021 - hireYear < 10) {
            raiseSalary += salary * 0.05;
            System.out.println("Maaş Artışı: " + raiseSalary);
        } else if ((2021 - hireYear > 9) && (2021 - hireYear < 20)) {
            raiseSalary += salary * 0.1;
            System.out.println("Maaş Artışı: " + raiseSalary);
        } else {
            raiseSalary = salary * 0.15;
            System.out.println("Maaş Artışı: " + raiseSalary);
        }
    }

    void output() {
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        tax();
        bonus();
        raiseSalary();
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş: " + ((this.salary - tax) + bonus));
        System.out.println("Toplam Maaş: " + ((this.salary - tax) + bonus + raiseSalary));
    }
}