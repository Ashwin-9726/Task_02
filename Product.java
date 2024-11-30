//1.2) Create a class Product

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Product {
    int pid;
    double price;
    int quantity;
   //Default Constructor
    Product(){

    }
    //Parameterized Constructor
    Product(int pid,double price, int quantity){
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
@Override
    public String toString(){
     return "Product [pid= "+pid+", Price= "+price+", quantity= "+quantity+"]";
    }
}

class XYZ {
   static List<Product> list = new ArrayList<Product>();
   double sum = 0;

    public static void main(String[] args)
    {
        Product p1 = new Product(1, 40.0, 4);
        Product p2 = new Product(2, 60.0, 4);
        Product p3 = new Product(3, 30.0, 6);
        Product p4 = new Product(4, 50.0, 10);
        Product p5 = new Product(5, 20.0, 8);
        //System.out.println(pro.getPid()+ " "+pro.getPrice()+" "+pro.getQuantity());
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        //Accept 5 product information and storing it in ArrayList
        for (Product p : list) {
            System.out.println(p);
        }
        System.out.println();
        //Sorting elemnts in ArrayList based on PriceComparator
        Collections.sort(list, new PriceComparator());
        //Printing the Sorted elements based on price
        System.out.println("Products sorted by price:");
        for (Product product : list) {
            System.out.println(product);
        }
        System.out.println();
        //Printing the pid of the highest product price
        System.out.println("The Product id with the highest price is "+list.get(list.size()-1).getPid());

        XYZ obj = new XYZ();
        System.out.println();
        obj.totalAmount();
    }
    //Method to return total amount of all products
    public void totalAmount()
    {
    for(int i =0 ; i< list.size();i++)
    {
       sum += list.get(i).getPrice() * list.get(i).getQuantity();
    }
        System.out.println("The total amount of all product is "+ sum);
    }
}
//Method to compare the price in the list
class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        if (p1.getPrice() < p2.getPrice()) {
            return -1;  // p1 is cheaper than p2
        } else if (p1.getPrice() > p2.getPrice()) {
            return 1;   // p1 is more expensive than p2
        } else {
            return 0;   // p1 and p2 have the same price
        }
    }
}



