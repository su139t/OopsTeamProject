public class Order {
    public static void main(String[] args) {
        ShoppingCart s = new ShoppingCart();
        s.addToCart(104);
        s.addToCart(109);
        s.addToCart(110);
        double am = s.subTotal();
        System.out.println(am);
    }
    
}
