package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength; j++) {
                if (j > i)
                    System.out.print(" ");
                else
                    System.out.print("8");
            }

            System.out.println();
        }
    }
}
