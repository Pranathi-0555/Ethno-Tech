<<<<<<< HEAD
import java.util.Scanner;

// Abstract class
abstract class FoodOrder {

    String customerName;
    int quantity;
    double price;

    // constructor
    FoodOrder(String customerName, int quantity, double price) {
        this.customerName = customerName;
        this.quantity = quantity;
        this.price = price;
    }

    // abstract method
    abstract void orderFood();

    // normal method
    void generateBill() {
        double total = quantity * price;

        System.out.println("\n----- BILL -----");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Price         : " + price);
        System.out.println("Total Bill    : " + total);
    }
}

// Child class
class SwiggyOrder extends FoodOrder {

    String itemName;

    SwiggyOrder(String customerName, int quantity, double price, String itemName) {
        super(customerName, quantity, price);
        this.itemName = itemName;
    }

    // overriding abstract method
    @Override
    void orderFood() {
        System.out.println("\nOrder Placed Successfully!");
        System.out.println(itemName + " is being prepared...");
    }
}

// Main class
public class Swiggy {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== WELCOME TO SWIGGY =====");

        // Menu
        System.out.println("\n1. Pizza        - 299");
        System.out.println("2. Burger       - 149");
        System.out.println("3. Biryani      - 249");
        System.out.println("4. Dosa         - 120");
        System.out.println("5. Ice Cream    - 99");
        System.out.println("6. Sandwich     - 130");
        System.out.println("7. Fried Rice   - 180");
        System.out.println("8. Noodles      - 170");
        System.out.println("9. Cake         - 350");
        System.out.println("10. Cool Drink  - 60");

        System.out.print("\nEnter Customer Name : ");
        String name = sc.nextLine();

        System.out.print("Choose Item Number : ");
        int choice = sc.nextInt();

        System.out.print("Enter Quantity : ");
        int qty = sc.nextInt();

        String item = "";
        double price = 0;

        switch(choice) {

            case 1:
                item = "Pizza";
                price = 299;
                break;

            case 2:
                item = "Burger";
                price = 149;
                break;

            case 3:
                item = "Biryani";
                price = 249;
                break;

            case 4:
                item = "Dosa";
                price = 120;
                break;

            case 5:
                item = "Ice Cream";
                price = 99;
                break;

            case 6:
                item = "Sandwich";
                price = 130;
                break;

            case 7:
                item = "Fried Rice";
                price = 180;
                break;

            case 8:
                item = "Noodles";
                price = 170;
                break;

            case 9:
                item = "Cake";
                price = 350;
                break;

            case 10:
                item = "Cool Drink";
                price = 60;
                break;

            default:
                System.out.println("Invalid Choice");
                System.exit(0);
        }

        // object creation
        SwiggyOrder s = new SwiggyOrder(name, qty, price, item);

        s.orderFood();
        s.generateBill();
    }
=======
import java.util.Scanner;

// Abstract class
abstract class FoodOrder {

    String customerName;
    int quantity;
    double price;

    // constructor
    FoodOrder(String customerName, int quantity, double price) {
        this.customerName = customerName;
        this.quantity = quantity;
        this.price = price;
    }

    // abstract method
    abstract void orderFood();

    // normal method
    void generateBill() {
        double total = quantity * price;

        System.out.println("\n----- BILL -----");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Price         : " + price);
        System.out.println("Total Bill    : " + total);
    }
}

// Child class
class SwiggyOrder extends FoodOrder {

    String itemName;

    SwiggyOrder(String customerName, int quantity, double price, String itemName) {
        super(customerName, quantity, price);
        this.itemName = itemName;
    }

    // overriding abstract method
    @Override
    void orderFood() {
        System.out.println("\nOrder Placed Successfully!");
        System.out.println(itemName + " is being prepared...");
    }
}

// Main class
public class Swiggy {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== WELCOME TO SWIGGY =====");

        // Menu
        System.out.println("\n1. Pizza        - 299");
        System.out.println("2. Burger       - 149");
        System.out.println("3. Biryani      - 249");
        System.out.println("4. Dosa         - 120");
        System.out.println("5. Ice Cream    - 99");
        System.out.println("6. Sandwich     - 130");
        System.out.println("7. Fried Rice   - 180");
        System.out.println("8. Noodles      - 170");
        System.out.println("9. Cake         - 350");
        System.out.println("10. Cool Drink  - 60");

        System.out.print("\nEnter Customer Name : ");
        String name = sc.nextLine();

        System.out.print("Choose Item Number : ");
        int choice = sc.nextInt();

        System.out.print("Enter Quantity : ");
        int qty = sc.nextInt();

        String item = "";
        double price = 0;

        switch(choice) {

            case 1:
                item = "Pizza";
                price = 299;
                break;

            case 2:
                item = "Burger";
                price = 149;
                break;

            case 3:
                item = "Biryani";
                price = 249;
                break;

            case 4:
                item = "Dosa";
                price = 120;
                break;

            case 5:
                item = "Ice Cream";
                price = 99;
                break;

            case 6:
                item = "Sandwich";
                price = 130;
                break;

            case 7:
                item = "Fried Rice";
                price = 180;
                break;

            case 8:
                item = "Noodles";
                price = 170;
                break;

            case 9:
                item = "Cake";
                price = 350;
                break;

            case 10:
                item = "Cool Drink";
                price = 60;
                break;

            default:
                System.out.println("Invalid Choice");
                System.exit(0);
        }

        // object creation
        SwiggyOrder s = new SwiggyOrder(name, qty, price, item);

        s.orderFood();
        s.generateBill();
    }
>>>>>>> c0bfe3e139c274540dbc6a4d8de3dc12b2d504c2
}