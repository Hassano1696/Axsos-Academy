import java.util.Set;
import java.util.HashMap;

public class HashMapp {
    public  static  void main( String [] args) {
        HashMap<String,String> trackList =  new  HashMap <String,String>();
        trackList .put( "Astronut In The Ocean" , "Masked Wolf " );
        trackList .put( "My Immortal" , "Evancensce" );
        trackList .put( "Sorry" , "Halsey" );
        trackList .put( "Unstoppable" , "Sia" );
        System .out.println(trackList.get("Unstoppable"));  
        for( String key : trackList.keySet()) {
            System .out.println(key);
            System .out.println(trackList.get(key));
        }
    }
}
