package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
  int finalN = numberToPrint;
        for (int r = 1; r < power; r++) {

            finalN *= numberToPrint;
        }
        System.out.println(finalN); }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
