package boxinggame;

public class Main {
    public static void main(String[] args) {
        Fighter burak = new Fighter("Burak", 10, 120, 95, 25);
        Fighter murat = new Fighter("Murat", 15, 110, 100, 35);
        Ring r = new Ring(burak, murat, 90, 100);
        r.run();
    }
}