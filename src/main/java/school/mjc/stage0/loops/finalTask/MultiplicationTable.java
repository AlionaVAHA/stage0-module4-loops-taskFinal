package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
   int t = 1;
        for (int r = 1; r <= 10; r++) {
            System.out.println( t+ " x " + numberTableToPrint + " = " +numberTableToPrint * r);
       t++; }
    }
}
