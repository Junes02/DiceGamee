public class RaflebægerTest {

    public static void main(String[] args) {
        Terninger terninger = new Terninger();
        int[] terning1Resultater = new int[6];
        int[] terning2Resultater = new int[6];

        int antalKast = 1000;


        for (int i = 0; i < antalKast; i++) {
            terninger.kast();
            int terning1 = terninger.getTerning1();
            int terning2 = terninger.getTerning2();


            terning1Resultater[terning1 - 1]++;
            terning2Resultater[terning2 - 1]++;
        }

        System.out.println("Fordeling for terning 1:");
        for (int i = 0; i < 6; i++) {
            System.out.println((i + 1) + ": " + terning1Resultater[i] + " gange");
        }

        System.out.println("\nFordeling for terning 2:");
        for (int i = 0; i < 6; i++) {
            System.out.println((i + 1) + ": " + terning2Resultater[i] + " gange");
        }
    }
}

class Terninger {
    private int terning1, terning2;
    private java.util.Random rand = new java.util.Random();

    public int kast() {
        terning1 = rand.nextInt(6) + 1;
        terning2 = rand.nextInt(6) + 1;
        return getSum();
    }

    public int getSum() {
        return terning1 + terning2;
    }

    public int getTerning1() {
        return terning1;
    }

    public int getTerning2() {
        return terning2;
    }

    public String toString() {
        return "Terningerne viser " + terning1 + " og " + terning2;
    }
}
