package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int halfHeight = height % 2 == 0 ? height / 2 : height / 2 + 1;
        boolean oddHeight = height % 2 != 0;

        //Hourglass upper half
        for (int i = halfHeight; i >= 1; i--) {
            for (int j = 1; j <= halfHeight - i; j++) {
                if (oddHeight && i == 1)
                    break;
                System.out.print(" ");
            }

            for (int j = i; j <= 3 * i - 2; j++) {
                if (oddHeight && i == 1)
                    break;
                System.out.print("8");
            }

            if (!oddHeight)
                System.out.print("8");

            for (int j = 1; j <= halfHeight - i; j++) {
                if (oddHeight && i == 1)
                    break;
                System.out.print(" ");
            }

            if(oddHeight && i == 1)
                break;

            System.out.println();
        }


        //Hourglass lower half
        for (int i = 1; i <= halfHeight; i++) {
            for (int j = 1; j <= halfHeight - i; j++)
                System.out.print(" ");

            for (int j = i; j <= 3 * i - 2; j++)
                System.out.print("8");

            if (!oddHeight)
                System.out.print("8");

            for (int j = 1; j <= halfHeight - i; j++)
                System.out.print(" ");

            System.out.println();
        }
    }
}
