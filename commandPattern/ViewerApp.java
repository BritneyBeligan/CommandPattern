package commandPattern;

public class ViewerApp {

    public static void main(String[] args){

        Tv tv = new Tv();

        RemoteControl rc = new RemoteControl();

        PowerOn powerOn = new PowerOn(tv);
        System.out.println(powerOn.execute());

        PowerOff powerOff = new PowerOff(tv);
        System.out.println(powerOff.execute());


        // Features of Smart Tv : Stream Music
        ListenMusic listenMusic = new ListenMusic(tv);
        System.out.println(listenMusic.execute());

        // Features of Smart Tv : Play Smart Fun Games
        SmartGames smartGames = new SmartGames(tv);
        System.out.println(smartGames.execute());
        
        // Features of Smart Tv : Split Screen
        MultiView multiview = new MultiView(tv);
        System.out.println(multiview.execute());

    }
}
