public class orderstest {
    public static void main(String[] args) {
        // Menu items
        items item1 = new items();
        item1.name ="Latte";
        item1.price =3.2;
        items item2 = new items();
        item2.name ="mocha";
        item2.price =4.5;
        items item3 = new items();
        item3.name ="drip coffee";
        item3.price =6.5;
        items item4 = new items();
        item4.name ="capuccino";
        item4.price =5.0;
        // Order variables -- order1, order2 etc.
        orders order1 = new orders();
        order1.name= "Cindhuri";
        order1.ready = true;
        orders order2 = new orders();
        order2.name= "Jimmy";
        order2.items.add(item1);
        order2.total += item1.price;
        orders order3 = new orders();
        order3.name= "Noah";
        order3.items.add(item4);
        order3.total += item4.price;
        orders order4 = new orders();
        order4.name= "Sam";
        order4.items.add(item1);
        order4.total += item1.price;
        order4.items.add(item1);
        order4.total += item1.price;
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
        System.out.printf("items: %s\n", order2.items.get(0).name);
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
        System.out.printf("items: %s\n", order3.items.get(0).name);
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
        System.out.printf("items: %s\n", order4.items.get(0).name);
        }
}

