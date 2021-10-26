import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfElements = scanner.nextInt(), maximum = 0;
        for (int i = 0; i < numberOfElements; i++) {
            int element = scanner.nextInt();
            if(element % 4 == 0 && element >= maximum){
                maximum = element;
            }
        }

        System.out.println(maximum);
    }
}