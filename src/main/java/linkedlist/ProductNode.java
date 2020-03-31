package linkedlist;

public class ProductNode {

    // Product reference stored in this node
    Product node;
    // Reference to the next node
    Product next;

    // Constructor
    public ProductNode(Product Node, Product next){
      this.node = node;
      this.next = next;
    }

    // Recursive add method -- add a new product node to the end of the list
    // Check if this is the last node
    // Last node -- instantiate a new node
    // Recursive call on the next node
    public void add(Product p){
      if (next == null) {
        next == new Product(p);
      } else {
        next.add(p)
      }

      }
    }

    // Recursive size method -- count the number of nodes, starting with this one
    // Check if there is a next node
    // If not, return 1
    // Otherwise, recursively count from this node
    public int size(){
      if (next == null){
        return 1;
      } else {
        return 1 + next.size();
      }
    }

    // Recursive sum method -- sum the unit prices of all products in the list
    // Check if there is a next node
    // If not, return the price of the current product
    // Otherwise, compute the sum starting with this node
    public double sum(){
      if(next == null){
        return Product.UnitPrice;
      } else {
        return Product.UnitPrice += next.Sum;
      }


    }

    @Override
    public String toString() {
        // Check if there is a next node
        // If not, return the values string
        // Otherwise, return the values of this node, a "new line" character, and the string returned by the next node
        if(next == null){
          return Product.getProductName();
        } else {

        }
    }
}
