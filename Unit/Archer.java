package Unit;

import java.util.ArrayList;

import javax.xml.transform.Templates;

public abstract class Archer extends Default{   
    protected int ammo;
    protected float dist;

    protected Archer(int posX, int posY,String name, int hp, int maxHp, int damage, int maxDamage, int att,  int def, int ammo, float dist, int speed) {
        super(posX, posY, name, hp, maxHp, damage, maxDamage, att, def, speed);
        this.dist = dist;
        this.ammo = ammo;
    }

    public float getDist() {return dist;}
    @Override
    public void step(ArrayList<Default> team1, ArrayList<Default> team2){
        if (state.equals("Die") || ammo == 0) return;
        int target = findNearest(team2);
        float dmg = (team2.get(target).def - att > 0) ? 
                damage: (team2.get(target).def - att < 0) ? 
                maxDamage: (maxDamage+damage)/2;
        team2.get(target).getDamage(dmg);

        for (int i = 0; i < team1.size(); i++) {
            if (team1.get(i).getInfo().toString().split(":")[0].equals("Фермер") && team1.get(i).state.equals("Stand")){
                team1.get(i).state = "Busy";
                return;
            }    
        }
        ammo--;
    }

}