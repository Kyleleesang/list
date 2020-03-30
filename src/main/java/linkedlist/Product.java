package linkedlist;


  public abstract class Product {
    String ProductName;
    String Isbn;
    double UnitPrice;

  // A constructor method that initializes the product name, ISBN number, and unit price
  public Product(String name, String IsbnNum, double price){
    ProductName = name;
    Isbn = IsbnNum;
    UnitPrice = price;
  }

  // getProductName() - Returns a String that is the name of the product
  public String getProductName(){
    return ProductName;
  }

  // getIsbn() - Returns a String representing the ISBN (barcode) number
  public String getIsbn(){
    return Isbn;
  }

  // getUnitPrice() - Returns a possible decimal value indicating the unit price for each product
  public double getUnitPrice(){
    return UnitPrice;
  }
  © 2020 GitHub, Inc.
}


}
