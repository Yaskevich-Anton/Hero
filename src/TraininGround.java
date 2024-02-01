public class TraininGround {
    public static void main(String[] args) {
        Archer Anton = new Archer("Anton",20);
        Enemy Zombie = new Enemy(100,20);
        Anton.attackEnemy(Zombie,Anton);
    }
}
