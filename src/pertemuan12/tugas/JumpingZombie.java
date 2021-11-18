package pertemuan12.tugas;
public class JumpingZombie extends Zombie implements Destroyable{
    
    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }
    
    @Override
    public void heal(){
        switch(level){
            case 1 :
                health += health*0.03;
                break;
            case 2 :
                health += health*0.04;
                break;
            case 3 :
                health += health*0.05;
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= health*0.1;
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data =\nHealth = "+health+"\nLevel = "+level+"\n";
    }
    
}
