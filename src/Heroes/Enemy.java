package Heroes;

public class Enemy  implements Mortal {
    private String name;
    private int healthy;

    public Enemy(String name, int healthy) {
        this.name = name;
        this.healthy = healthy;
    }

    @Override
    public boolean isAlive() {
        if(getHealthy()>0)
            return true;
        else
            return false;
    }
    public void takeDamage(int damage) {
        if (isAlive() && healthy <= damage) {
            healthy = 0;
            System.out.println(getName() + " dead");
        } else {
            this.healthy -= Math.min(healthy, damage);
            System.out.println(name + " get damage " + damage + ". Remained " + healthy);
        }
    }
    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getHealthy() {
        return healthy;
    }

    public String getName() {
        return name;
    }


}
