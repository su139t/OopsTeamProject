public class Products {
  String title;
  String description;
  double price;
  int id;

  // Hardcoded product data
  public static Products[] allProducts = {
      new Products(101, "Laptop", "High performance laptop", 50000),
      new Products(102, "Mouse", "Wireless optical mouse", 500),
      new Products(103, "Keyboard", "Mechanical keyboard", 1500),
      new Products(104, "Monitor", "24 inch Full HD display", 12000),
      new Products(105, "Headphones", "Noise cancelling headphones", 2000),
      new Products(106, "Webcam", "HD 1080p webcam", 2500),
      new Products(107, "Speaker", "Bluetooth speaker with bass", 1800),
      new Products(108, "Tablet", "10 inch Android tablet", 15000),
      new Products(109, "Smartwatch", "Fitness tracker smartwatch", 4000),
      new Products(110, "Printer", "Wireless color printer", 8000)
  };

  Products(int id, String title, String description, double price) {
    this.title = title;
    this.description = description;
    this.price = price;
    this.id = id;
  }

  public static void main(String[] args) {

    for (Products p : allProducts) {
      System.out.println(p.id + " " + p.title + " " + p.description + " " + p.price);
    }
  }
}
