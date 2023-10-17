package dz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nam = scanner.nextInt();
        int nam2 = scanner.nextInt();
        int d = scanner.nextInt();

        switch (d){
            case 1:
                System.out.printf("+ %d", nam+nam2 );
                break;
            case 2:
                System.out.printf("- %d", nam-nam2);
                break;
            case 3:
                System.out.printf("* %d", nam*nam2);
                break;
            case 4:
                System.out.printf("/ %.2f", (double)nam/nam2);
                break;
            default:
                System.out.println("Error");
        }
        System.out.println();

        if (d == 1){
            System.out.printf("+ %d", nam+nam2);
        }else if (d == 2) {
            System.out.printf("- %d", nam + nam2);
        }else{
            System.out.println("Error");
        }  scanner.close();
    }
}
