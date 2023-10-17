package commandPattern;

public class SmartGames {
    private Tv tv;

    public SmartGames (Tv tv){
        this.tv = tv;
    }

    public String execute() {
        return tv.switchGames();
    }

}
