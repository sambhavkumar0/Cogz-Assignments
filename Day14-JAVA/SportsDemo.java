// Playable interface
interface Playable {
    void play();
}

// Football class
class Football implements Playable {
    public void play() {
        System.out.println("Playing Football");
    }
}

// Cricket class
class Cricket implements Playable {
    public void play() {
        System.out.println("Playing Cricket");
    }
}

// Tennis class
class Tennis implements Playable {
    public void play() {
        System.out.println("Playing Tennis");
    }
}

// Main class
public class SportsDemo {
    public static void main(String[] args) {
        Playable f = new Football();
        Playable c = new Cricket();
        Playable t = new Tennis();

        f.play();
        c.play();
        t.play();
    }
}
