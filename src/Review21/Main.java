package Review21;

import java.util.ArrayList;

interface Playable{
    void play();
}
class Music implements Playable{
    @Override
    public void play(){
        System.out.println("Playing music");
    }
}
class Video implements Playable{
    @Override
    public void play(){
        System.out.println("Playing video");
    }
}

class Podcast implements  Playable{
    @Override
    public void play(){
        System.out.println("Playing podcast");
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Playable> list = new ArrayList<Playable>();
        list.add(new Music());
        list.add(new Video());
        list.add(new Podcast());
        for(Playable p : list){
            p.play();
        }
    }
}
