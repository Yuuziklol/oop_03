package Unit;

import java.util.ArrayList;
import java.util.Random;

public abstract class Default extends Vector2D implements GameInterface{
    protected String name;
    protected int damage, att, def, hp,maxHp,maxDamage,speed;
    protected Vector2D coords;

    public Default(int posX, int posY,String name,int hp, int maxHp, int damage, int maxDamage, int att, int def, int speed) {
        super(posX, posY);
        this.hp = hp;
        this.maxHp = maxHp;
        this.damage = damage;
        this.att = att;
        this.def = def;
        this.name = name;
        this.maxDamage = maxDamage;
        this.speed = speed;
    }

    @Override
    public String toString() {return String.format("%s %d ",name,speed);}

    @Override
    public void step(ArrayList<Default> team1, ArrayList<Default> team2){

    }

    public int findNearest(ArrayList<Default> team){
        double min = 100;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if (min > coords.getDistance(team.get(i).coords) & team.get(i).hp != 0) {
                index = i;
                min = coords.getDistance(team.get(i).coords);
            }
        }
        return index;
    }
    public static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }
    @Override
    public String getInfo(){
        return "";
    }

    public int getSpeed() {
        return speed;
    }

    public int getHp() {
        return hp;
    }

}