package Unit;

import java.util.ArrayList;

public interface GameInterface {
    void step(ArrayList<Default> team1, ArrayList<Default> team2);
    
    String getInfo();
}