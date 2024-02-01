public class Enemy  implements Mortal {
    private int healthy;
    private int damage;

    public Enemy(int healthy, int damage) {
        this.healthy = healthy;
        this.damage = damage;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getHealthy() {
        return healthy;
    }
    int takeDamage(int damage){
        return getHealthy()-damage;
    }

    @Override
    public boolean isAlive() {
        if(getHealthy()>0)
        return true;
        else
            return false;
    }
}
