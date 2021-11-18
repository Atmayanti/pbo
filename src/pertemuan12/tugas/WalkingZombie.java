package pertemuan12.tugas;
public class WalkingZombie extends Zombie implements Destroyable{
    
    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }
    
    @Override
    public void heal(){
        switch(level){
            case 1 :
                health += health*0.02;
                break;
            case 2 :
                health += health*0.03;
                break;
            case 3 :
                health += health*0.04;
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= health*0.2;
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data =\nHealth = "+health+"\nLevel = "+level+"\n";
    }
    
}
