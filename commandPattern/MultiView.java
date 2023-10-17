package commandPattern;

public class MultiView {

    private Tv tv;

    public MultiView (Tv tv){
        this.tv = tv;
    }
    //e<3
    public String execute() {
        return tv.switchView();
    }
}
