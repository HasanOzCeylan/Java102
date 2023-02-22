package Java_Television_Simulator;

public class SportsChannel extends Channel {

    private String sportType;

    public SportsChannel(String name, int channelNo, String sportType) {
        super(name, channelNo);
        this.sportType = sportType;
    }
}
