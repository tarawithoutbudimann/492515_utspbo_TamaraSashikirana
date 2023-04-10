public class Main {
    public static void main(String[] args) {
        Zombie zombie = new Zombie("Zombie", 10, 15);
        Pocong pocong = new Pocong("Pocong", 20, 25);
        Burung burung = new Burung("Burung", 30, 35);
        
        zombie.walk();
        pocong.jump();
        burung.fly();
        burung.walk();
    }
}