/**
 * Created by christophernobles on 10/15/16.
 */
public class Door {
    int hinges;
    int knobs;
    boolean lock;

    Door(int numberOfHinges, int numberOfKnobs, boolean hasLock){
        this.hinges = numberOfHinges;
        this.knobs = numberOfKnobs;
        this.lock = hasLock;
    }

    Door(){
        this.hinges = 2;
        this.knobs = 1;
        this.lock = false;
    }

    public int getHinges() {
        return hinges;
    }

    public void setHinges(int hinges) {
        this.hinges = hinges;
    }

    public int getKnobs() {
        return knobs;
    }

    public void setKnobs(int knobs) {
        this.knobs = knobs;
    }

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }
}
