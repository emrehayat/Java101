package boxinggame;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Ring(Fighter f1, Fighter f2,int minWeight , int maxWeight) {
        if (start()) {
            this.f1 = f1;
            this.f2 = f2;
        } else {
            this.f1 = f2;
            this.f2 = f1;
        }
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("--------YENİ ROUND--------");
                f2.health = f1.hit(f2);
                if (isWin()) {
                    break;
                }
                f1.health = f2.hit(f1);
                if (isWin()) {
                    break;
                }
                printScore();
            }
        } else {
            System.out.println("Sporcuların ağırlıkları aynı aralıkta değil!");
        }
    }

    boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı kazanan: " + f2.name);
            return true;
        } else if (f2.health == 0) {
            System.out.println("Maçı kazanan: " + f1.name);
            return true;
        }
        return false;
    }

    boolean start() {
        return Math.random() > 0.5;
    }

    void printScore() {
        System.out.println("-------------------");
        System.out.println(f1.name + " Kalan Can: " + f1.health);
        System.out.println(f2.name + " Kalan Can: " + f2.health);
    }
}