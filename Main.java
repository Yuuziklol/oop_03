import Unit.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Vector;
public class Main {
    static final int UNITS = 10;
    public static ArrayList<Default> firstTeam = new ArrayList<>();
    public static ArrayList<Default> secondTeam = new ArrayList<>();
    public static ArrayList<Default> allTeam = new ArrayList<>();
    public static void main(String[] args) {
        createTeam(firstTeam, 0, 1);
        createTeam(secondTeam, 3, 10);
    }
    static void createTeam (ArrayList team, int offset, int posY){
        for (int i = 1; i <= UNITS; i++) {
            int rnd = new Random().nextInt(4) + offset;
            switch (rnd){
                case (0):
                    team.add(new Sniper(Default.getName(),i, posY));
                    break;
                case (1):
                    team.add(new Rogue(Default.getName(),i, posY));
                    break;
                case (2):
                    team.add(new Mage(Default.getName(),i, posY));
                    break;
                case (3):
                    team.add(new Farmer(Default.getName(),i, posY));
                    break;
                case (4):
                    team.add(new CrossbowMan(Default.getName(),i, posY));
                    break;
                case (5):
                    team.add(new Monk(Default.getName(),i, posY));
                    break;
                case (6):
                    team.add(new Spearman(Default.getName(),i, posY));
                    break;
            }
        }
    }
    static void sortTeam(ArrayList<Default> team){
        team.sort(new Comparator<Default>() {
            @Override
            public int compare(Default t0, Default t1){
                if (t0.getSpeed() == t1.getSpeed()) return (int) (t0.getHp() - t1.getHp());
                else return (int) (t0.getSpeed() - t1.getSpeed());
            }
        });
    }
}