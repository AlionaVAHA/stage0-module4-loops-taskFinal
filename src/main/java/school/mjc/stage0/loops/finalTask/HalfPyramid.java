package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
for (int r = cathetusLength; r > 0; r--) {

            for (int c = 1; c < r; c++) {
                System.out.print(" ");
            }
            for (int v = cathetusLength; v >= r; v--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
