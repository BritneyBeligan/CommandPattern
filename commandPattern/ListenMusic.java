package commandPattern;

public class ListenMusic {
    private Tv tv;

    public ListenMusic (Tv tv){
        this.tv = tv;
    }
    //e<3
    public String execute() {
        return tv.switchMusic();
    }


}
