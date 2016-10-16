/**
 * Created by christophernobles on 10/15/16.
 */
public class Window {
    boolean openable;
    int shutters;
    int panes;
    String shape;

    Window(boolean isItOpenable, int numberOfShutters, int numberOfPanes, String windowShape){
        this.openable = isItOpenable;
        this.shutters = numberOfShutters;
        this.panes = numberOfPanes;
        this.shape = windowShape;
    }

    Window(){
        this.openable = true;
        this.shutters = 2;
        this.panes = 2;
        this.shape = "rectangle";
    }

    public boolean isOpenable() {
        return openable;
    }

    public void setOpenable(boolean openable) {
        this.openable = openable;
    }

    public int getShutters() {
        return shutters;
    }

    public void setShutters(int shutters) {
        this.shutters = shutters;
    }

    public int getPanes() {
        return panes;
    }

    public void setPanes(int panes) {
        this.panes = panes;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
}
