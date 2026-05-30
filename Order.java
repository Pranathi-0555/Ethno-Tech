abstract class FoodOrder {
    String customerName;
    int quantity;
    double price;
    FoodOrder() {
        System.out.println("Welcome to our food ordering system!");
    }
    FoodOrder(String name, int quantity, double price) {
        this.customerName = name;
        this.quantity = quantity;
        this.price = price;
    }
    abstract void orderFood();
    void generateBill() {
        double total = quantity * price;
		double discount=total*0.05;
		total =total-discount;
        System.out.println("Customer Name: " + customerName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: " + price);
		System.out.println("Discount amount:"+discount);
        System.out.println("Total Bill: " + total);
    }
}
class PizzaOrder extends FoodOrder {
    PizzaOrder(String name, int quantity, double price) {
        super(name, quantity, price);
    }
    @Override
    void orderFood() {
        System.out.println("Pizza order placed successfully!");
    }
	
}

public class Order {
    public static void main(String[] args) {
        PizzaOrder p = new PizzaOrder("Pranathi", 2, 250.0);
		PizzaOrder a = new PizzaOrder("Shreya", 3, 50.0);
        p.orderFood();
        p.generateBill();
		a.orderFood();
        a.generateBill();
    }
}