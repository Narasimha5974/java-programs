import java.util.Scanner;

class switchcase
 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER YOUR CHOICE (1-5): ");
        int x = s.nextInt();

        switch (x) {
            case 1:
                System.out.println("NATURAL NUMBERS:");
                for (int i = 1; i <= 5; i++) {
                    System.out.println(i);
                }
                break;

            case 2:
                System.out.println("EVEN NATURAL NUMBERS:");
                for (int i = 1; i <= 5; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
                break;

            case 3:
                System.out.println("ODD NATURAL NUMBERS:");
                for (int i = 1; i <= 5; i++) {
                    if (i % 2 == 1) {
                        System.out.println(i);
                    }
                }
                break;

            case 4:
                int evenSum = 0;
                for (int i = 1; i <= 5; i++) {
                    if (i % 2 == 0) {
                        evenSum += i;
                    }
                }
                System.out.println("SUM OF EVEN NUMBERS: " + evenSum);
                break;

            case 5:
                int oddSum = 0;
                for (int i = 1; i <= 5; i++) {
                    if (i % 2 == 1) {
                        oddSum += i;
                    }
                }
                System.out.println("SUM OF ODD NUMBERS: " + oddSum);
                break;

            default:
                System.out.println("INVALID CHOICE: PLEASE ENTER A NUMBER BETWEEN 1 AND 5");
        }

        s.close();
    }
}
