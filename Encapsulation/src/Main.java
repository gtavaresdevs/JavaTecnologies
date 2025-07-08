public class Main {
    public static void main(String[] args) {
    Player player = new Player();
    player.name = "Tim";
    player.health = 20;
    player.weapon =  "Sword";

    int damage = 10;
    player.loseHealth(damage);
    System.out.println("Remaining health: " + player.healthRemaining());
    //Problem is here that health is being set outside of Player scope because of lack of encapsulation
    player.health = 200;

    player.loseHealth(11);
    System.out.println("Remaining health: " + player.healthRemaining());


    PlayerEncap playerEncap = new PlayerEncap("Tim",200,"Bangbang");
    System.out.println("Initial health is " + playerEncap.healthRemaining());


    }


}
