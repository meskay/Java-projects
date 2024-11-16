import javax.swing.JOptionPane;
import java.util.Scanner;
public class EcommerceSystem {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        ElectronicProduct p1 = new ElectronicProduct(1,"smartphone",599.9f,"Samsung",1);
        ClothingProduct p2 = new ClothingProduct(2,"T-Shirt",19.99f,"Medium","Cotton");
        BookProduct p3 = new BookProduct(3,"OOP",39.99f,"O'Reilly","X publications");

        Customer c1 = new Customer();
        Cart cart = new Cart();

        JOptionPane.showMessageDialog(null,"Welcome to the E-Commerce System!","Ecommerce System",JOptionPane.PLAIN_MESSAGE);
        c1.setCustomerId(Integer.parseInt(JOptionPane.showInputDialog("Please enter your Id:")));
        c1.setName(JOptionPane.showInputDialog("Please enter your name:"));
        c1.setAddress(JOptionPane.showInputDialog("Please enter your address:"));

        cart.setnProducts(Integer.parseInt(JOptionPane.showInputDialog("How many items do you want to add?")));
        cart.setProducts(cart.nProducts);
        int product;
        String[] options = {"smartphone", "T-Shirt", "OOP"};

        for(int i=0;i<cart.nProducts;i++){
            product = JOptionPane.showOptionDialog(null,"which product would you like to add:","Ecommerce System",0,3,null,options,options[0]);
            switch (product){
                case 0:
                    cart.addProduct(i,p1);
                    break;
                case 1:
                    cart.addProduct(i,p2);
                    break;
                case 2:
                    cart.addProduct(i,p3);
                    break;
            }}
        Order order = new Order(c1.customerId,1, cart.calculatePrice());

        JOptionPane.showMessageDialog(null,"Your total will be $" +cart.calculatePrice() +".","Ecommerce System",JOptionPane.INFORMATION_MESSAGE);
        int x = JOptionPane.showOptionDialog(null,"Would you like to place the order?","Ecommerce System",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,0);
            switch (x){
                case 0:
                    JOptionPane.showMessageDialog(null,"Here's your order's summary:\n" +order.printOrderInfo() +cart.placeOrder(),"Ecommerce System",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null,"your order has been canceled","Ecommerce System",JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
    }
}
