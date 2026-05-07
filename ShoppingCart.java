public class ShoppingCart {

  public static void main(String[] args) {
    for (Products p : Products.allProducts) {
      System.out.println(p.id + " " + p.title + " " + p.description + " " + p.price);
    }
  }

}