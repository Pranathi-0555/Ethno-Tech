<<<<<<< HEAD
import java.util.Scanner;

public class currentbill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units: ");
        int units = sc.nextInt();

        int bill;

        if (units <= 250) {
            bill = 0;
        } else {
            bill = (units - 250) * 2;
        }

        System.out.println("Electricity Bill = ₹" + bill);
    }
=======
import java.util.Scanner;

public class currentbill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units: ");
        int units = sc.nextInt();

        int bill;

        if (units <= 250) {
            bill = 0;
        } else {
            bill = (units - 250) * 2;
        }

        System.out.println("Electricity Bill = ₹" + bill);
    }
>>>>>>> ac2215960279cf1adadd0825b1c0c6d5c547b765
}