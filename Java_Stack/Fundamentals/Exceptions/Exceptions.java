import java.util.ArrayList;
public class Exceptions{
    public static void main(String[] args) {
        try{
            ArrayList<Object> myList = new ArrayList<Object>();
                myList.add("13");
                myList.add("hello world");
                myList.add(48);
                myList.add("Goodbye World");
                for(int i = 0; i < myList.size(); i++) {
                Integer castedValue = (Integer) myList.get(i);
                }
        }catch(ClassCastException e){
            System.out.println("you have an error with previous code ");
        }catch (Exception e){
            System.out.println("check your inputs");
        }
    }
}
