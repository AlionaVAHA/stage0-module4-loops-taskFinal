package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
         int numFinal = (cathetusLength * 2) - 1;
        int num = 1;
        for (int r = cathetusLength - 1; r >= 0; r--) {
            for (int c = 0; c < r; c++) {
                System.out.print(" ");
            }
            for (int t = r; t < cathetusLength; t++) {
                System.out.print(num--);
            }
            num = cathetusLength;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
