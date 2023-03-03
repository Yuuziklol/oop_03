import Unit.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import Unit.CrossbowMan;
import Unit.Default;
import Unit.Farmer;
import Unit.Mage;
import Unit.Monk;
import Unit.Rogue;
import Unit.Sniper;
import Unit.SpearMan;
public class Main {

    public static void main(String[] args) {
        ArrayList<Default> firstTeam = new ArrayList<>();
        ArrayList<Default> secondTeam = new ArrayList<>();
        ArrayList<Default> allTeam = new ArrayList<>();
        System.out.println("Комманда 1:");
        for (int i = 0; i < 10; i++) {
            int rand = new Random().nextInt(4);
            
            switch(rand){
                case (0):
                    firstTeam.add(new Farmer(getName()){});
                    allTeam.add(firstTeam.get(i));
                    System.out.print(firstTeam.get(i).getInfo() + ", ");
                    break;
                case (1):
                    firstTeam.add(new Rogue(getName()){});
                    allTeam.add(firstTeam.get(i));
                    System.out.print(firstTeam.get(i).getInfo() + ", ");
                    break;
                case (2):
                    firstTeam.add(new Sniper(getName()){});
                    allTeam.add(firstTeam.get(i));
                    System.out.print(firstTeam.get(i).getInfo() + ", ");
                    break;
                case (3):
                    firstTeam.add(new Mage(getName()){});
                    allTeam.add(firstTeam.get(i));
                    System.out.print(firstTeam.get(i).getInfo() + ", ");
                    break;
            }
        }
        System.out.println();
        System.out.println("Комманда 2:");
        for (int i = 0; i < 10; i++) {
            int rand = new Random().nextInt(4);
            switch(rand){
                case (0):
                    secondTeam.add(new Farmer(getName()){});
                    allTeam.add(secondTeam.get(i));
                    System.out.print(secondTeam.get(i).getInfo() + ", ");
                    break;
                case (1):
                    secondTeam.add(new SpearMan(getName()){});
                    allTeam.add(secondTeam.get(i));
                    System.out.print(secondTeam.get(i).getInfo() + ", ");
                    break;
                case (2):
                    secondTeam.add(new CrossbowMan(getName()){});
                    allTeam.add(secondTeam.get(i));
                    System.out.print(secondTeam.get(i).getInfo() + ", ");
                    break;
                case (3):
                    secondTeam.add(new Monk(getName()){});
                    allTeam.add(secondTeam.get(i));
                    System.out.print(secondTeam.get(i).getInfo() + ", ");
                    break;
            }
            allTeam.sort(new Comparator<Default>() {
                @Override
                public int compare(Default o1, Default o2){
                    if (o2.getSpeed() == o1.getSpeed()) {
                        return o1.getHp() - o2.getHp();
                    }
                    return o2.getSpeed()-o1.getSpeed();
                }
            });
        }
        System.out.println();
        System.out.println(allTeam.toString());
    }
    private static String getName(){
        String name= String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }
}