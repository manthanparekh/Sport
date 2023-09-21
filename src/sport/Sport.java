package sport;

// TODO: create a sport super class
public class Sport {
    // TODO: create a method with take in a sprt name and prints its out
    public static void name(String sportName) {
        System.out.println("The name of the sport is: " + sportName);
    }
}

class main {
    public static void main(String[] args) {
        // TODO: Call the method to which takes in the sports name
        Sport.name("baseball");
        // TODO: create a Tennis object
        Tennis favorite = new Tennis();

        // TODO: call the methods in Tennis
        favorite.player(8);
        favorite.item("racket");
    }
}
