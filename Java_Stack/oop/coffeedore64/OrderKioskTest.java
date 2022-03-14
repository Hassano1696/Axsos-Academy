public class OrderKioskTest {
    public static void main(String[] args) {


        OrderKiosk newOrderKiosk = new OrderKiosk();
        newOrderKiosk.addMenuItem("Mohito" , 4.3 );
        newOrderKiosk.addMenuItem("Latte" , 3.3 );
        newOrderKiosk.addMenuItem("CaCao" , 2.3 );
        newOrderKiosk.addCustomer();
        newOrderKiosk.displayMenu();
        
        
        
        
        }
        
}