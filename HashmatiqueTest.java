/**
 * HashmatiqueTest
 */
import java.util.HashMap;
import java.util.Set;
public class HashmatiqueTest {

    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String , String>();

        trackList.put("Viva La Vida", "I hear Jerusalem bells are ringing Roman Cavalry choirs are singing  Be my mirror, my sword and shield  My missionaries in a foreign field");
        trackList.put("fix you", "When you try your best but you don't succeed When you get what you want but not what you need When you feel so tired but you can't sleep Stuck in reverse");
        trackList.put("Clocks","The lights go out and I can't be saved Tides that I tried to swim against Have brought me down upon my knees Oh I beg, I beg and plead, singing");
        trackList.put("paradise", "When she was just a girl she expected the world But it flew away from her reach So she ran away in her sleep and dreamed of Para-para-paradise, para-para-paradise, para-para-paradise");
        
        // pull out a song by it's title
        String clocks = "Song Title: CLocks \n" + trackList.get("Clocks");
        System.out.println(clocks);

        // iterate through the whole hashMap

        System.out.println("THE COMPLETE HASHMAP WITH ALL THE SONGS");
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key + ": " + trackList.get(key));
        }  
    }
}