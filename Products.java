public class Products {
  String title;
  String description;
  double price;
  int id;
  int stock_qty;

  // Hardcoded product data
  public static Products[] allProducts = {
      new Products(101, "Laptop", "High performance laptop", 50000, 1),
      new Products(102, "Mouse", "Wireless optical mouse", 500, 2),
      new Products(103, "Keyboard", "Mechanical keyboard", 1500, 2),
      new Products(104, "Monitor", "24 inch Full HD display", 12000, 3),
      new Products(105, "Headphones", "Noise cancelling headphones", 2000, 1),
      new Products(106, "Webcam", "HD 1080p webcam", 2500, 3),
      new Products(107, "Speaker", "Bluetooth speaker with bass", 1800, 2),
      new Products(108, "Tablet", "10 inch Android tablet", 15000, 5),
      new Products(109, "Smartwatch", "Fitness tracker smartwatch", 4000, 6),
      new Products(110, "Printer", "Wireless color printer", 8000, 7)
  };

  Products(int id, String title, String description, double price, int stock_qty) {
    this.title = title;
    this.description = description;
    this.price = price;
    this.id = id;
  }

  public static void main(String[] args) {
    for (Products p : allProducts) {
      System.out.println(p.id + " " + p.title + " " + p.description + " " + p.price + " " + p.stock_qty);
    }
  }
}
