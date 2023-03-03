package Unit;

public abstract class Default implements GameInterface{
    protected String name;
    protected int damage, att, def, hp,maxHp,maxDamage,speed,x,y;

    public Default(String name,int hp, int maxHp, int damage, int maxDamage, int att, int def, int speed,int x, int y) {
        this.hp = hp;
        this.maxHp = maxHp;
        this.damage = damage;
        this.att = att;
        this.def = def;
        this.name = name;
        this.maxDamage = maxDamage;
        this.speed = speed;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {return String.format("%s %d ",name,speed);}

    @Override
    public void step(){

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