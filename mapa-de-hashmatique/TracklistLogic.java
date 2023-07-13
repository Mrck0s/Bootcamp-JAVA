import java.util.HashMap;
import java.util.Set;

public class TracklistLogic {
  public static void main(String[] args) {
    HashMap<String, String> tracklist = new HashMap<String, String>();
  
    tracklist.put("cancion1", "lorem ipsum dolor sit");
    tracklist.put("cancion2", "ipsum dolor sit");
    tracklist.put("cancion3", "ipsum dolor sit dolor sit");
    tracklist.put("cancion4", "ipsum dolor sit dolor sit dolor");

    for(String cancion : tracklist.keySet()) {
      String lyrics = tracklist.get(cancion);
      System.out.println("Titulo:" + cancion + ", Lyrics: " + lyrics);
    }

    System.out.println(tracklist.get("cancion1"));
  }
}
