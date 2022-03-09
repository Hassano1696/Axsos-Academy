package zookeeper;

public class Gorilla extends mamal {
    
    public void eatbanana(){
    	energy+=10;
        System.out.println("Gorilla is pleased with the meal");
    }
    public void climb(){
    	energy-=10;
        System.out.println("Gorilla has climbed a rock");
    }
    public void throwSomething(){
    	energy-=5;
        System.out.println("Gorilla has thrown a stone");
    }

}
