import java.util.ArrayList;

public class Order {
    int orderCount = 1;
    int orderId;
    ArrayList<Products> oderedProducts;
    int totalAmount;
    String status;

    Order(ArrayList<Products> cart) {
        this.orderId = orderCount++;
        this.oderedProducts = cart;
        this.totalAmount = calculateAmount();
        this.status = "Completed";

    }

    int calculateAmount() {
        int total = 0;
        for (Products p : oderedProducts) {
            total += p.price;
        }
        return total;
    }

    void showOrder() {
        System.out.println("Orders");
        System.out.println("OrderId : " + orderId);
        System.out.println("status : " + status);

        for (Products p : oderedProducts) {
            System.out.println("----" + p.title + "," + p.title);
        }

        System.out.println("Total Amount : " + totalAmount);
    }
}
