import java.util.ArrayList;
class Orders {
    private String name;
    private boolean isReady ;
    private ArrayList<Items> items = new ArrayList<Items>();

    public Orders (){
        
    }
    public Orders (String name){
        this.name = name;
    }
    public void addItem(Items item) {
        items.add(item); 
        }
    public void getStatusMessage() {
        if (this.isReady) {
            System.out.println("Your order is ready"); 
        }
        else{
            System.out.println("Thank you for waiting. Your order will be ready soon."); 
        }
        }
    public void display() {
        System.out.println("Customer name: "+this.name);
        double total = 0;
        for (int i=0 ;i < this.items.size(); i++){
            Items order1 = this.items.get(i); 
            total+=order1.getPrice();
            System.out.println(order1.getName() + " - $" + order1.getPrice());
        }
        System.out.println("Total: $"+total);
        }
        public void getOrderTotal() {
            double total = 0;
            for (int i=0 ;i < this.items.size(); i++){
                Items order1 = this.items.get(i); 
                total+=order1.getPrice();
            }
            System.out.println("Total: $"+total);
            }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return boolean return the isReady
     */
    public boolean isIsReady() {
        return isReady;
    }

    /**
     * @param isReady the isReady to set
     */
    public void setIsReady(boolean isReady) {
        this.isReady = isReady;
    }

    /**
     * @return ArrayList<Items> return the items
     */
    public ArrayList<Items> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }

}
