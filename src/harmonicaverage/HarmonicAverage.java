package harmonicaverage;

public class HarmonicAverage {
    public static void main(String[] args) {
        int[] harmonic = {1, 2, 3, 4, 5};
        double sumHarmonic = 0;
        for (int i = 0; i < harmonic.length; i++) {
            sumHarmonic += (1.0 / harmonic[i]);
        }
        double harmonicAverage = harmonic.length / sumHarmonic;
        System.out.println("Harmonik Ortalama: " + harmonicAverage);
    }
}