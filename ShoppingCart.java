import java.util.ArrayList;

public class ShoppingCart {
    String title;
    String description;
    double price;
    int id;
    int stock_qty;
    
    ArrayList<Products> CartProduct = new ArrayList<>();

    void addToCart(int id) {
        for (int i = 0; i < Products.allProducts.length; i++) {
            if (Products.allProducts[i].id == id) {
                CartProduct.add(Products.allProducts[i]);
            }
        }
        System.out.println("inserted successfully...");
    }

    void display() {
        for (int i = 0; i < CartProduct.size(); i++) {
            System.out.println("id : " + CartProduct.get(i).id);
            System.out.println("title : " + CartProduct.get(i).title);
            System.out.println("description : " + CartProduct.get(i).description);
            System.out.println("price : " + CartProduct.get(i).price);
            System.out.println("stock_qty : " + CartProduct.get(i).stock_qty);
            System.out.println();
        }
    }

    void remove(int i) {
        CartProduct.remove(i);
        System.out.println("remove successfully...");
    }

    double subTotal() {
        double amount = 0;
        for (int i = 0; i < CartProduct.size(); i++) {
            amount += (CartProduct.get(i).price * CartProduct.get(i).stock_qty);
        }
        return amount;
    }

    public static void main(String[] args) {
        for (Products p : Products.allProducts) {
            System.out.println(p.id + " " + p.title + " " + p.description + " " + p.price + " " + p.stock_qty);
        }
        ShoppingCart s = new ShoppingCart();
        s.addToCart(104);
        s.addToCart(109);
        s.addToCart(110);
        s.display();
        s.remove(1);
        s.display();
        s.subTotal();
    }

}