public class orderstest {
    public static void main(String[] args) {
        // Menu items
        items item1 = new items();
        items item2 = new items();
        items item3 = new items();
        items item4 = new items();
        item1.name ="Latte";
        item1.price =2.2;
        item2.name ="mocha";
        item2.price =4;
        item3.name ="drip coffee";
        item3.price =3.8;
        item4.name ="capuccino";
        item4.price =3.5;
        // Order variables -- order1, order2 etc.
        orders order1 = new orders();
        orders order2 = new orders();
        orders order3 = new orders();
        orders order4 = new orders();


        order1.name= "Cindhuri";
        order2.name= "Jimmy";
        order3.name= "Noah";
        order4.name= "Sam";
        System.out.printf("Name: %s\n", order1.name);

        order2.items.add(item1);
        order2.total += item1.price;
        order3.items.add(item4);
        order3.total += item4.price;
        order4.items.add(item1);
        order4.total += item1.price;
        order1.ready = true;
        order4.items.add(item1);
        order4.total += item1.price;
        
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

