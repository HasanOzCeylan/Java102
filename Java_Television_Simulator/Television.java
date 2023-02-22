import java.util.ArrayList;

public class Television {

    private String brand;
    private String size;
    private ArrayList<Object> channels;
    private boolean open;
    private int volume;
    private int currentChannel;

    public Television(String brand, String size) {
        this.brand = brand;
        this.size = size;
        channels = new ArrayList<>();
        createChannels();
        volume = 10;
        currentChannel=1;
        this.open = false;
    }

    public void volumeUp(){
        if(volume <20 && open){
            volume++;
            System.out.println("Sound level " + volume);
        }else{
            System.err.println("\n" +
                    "The volume is at max, you can't turn it up any more");
        }
    }

    public void volumeDown(){
        if(volume > 0 && open ){
            volume--;
            System.out.println("Sound level " + volume);
        }else{
            System.err.println("The sound is at my minimum, you can't turn it down any more");
        }
    }

    public void openTv() {
        if (open == false) {
            open = true;
            System.out.println("Tv Has been Open");
        } else {
            System.out.println("TV is already on");
        }
    }

    public void closeTv() {
        if (open == true) {
            open = false;
            System.out.println("TV Has been off");
        } else {
            System.out.println("TV is already on");
        }
    }

    private void createChannels() {
        NewsChannel fox = new NewsChannel("Fox", 1, "General News");
        channels.add(fox);
        NewsChannel bloom = new NewsChannel("BloomBerg", 2, "Economy News");
        channels.add(bloom);
        SportsChannel nba = new SportsChannel("NbaTV", 3, "Basketball");
        channels.add(nba);
        SportsChannel nfl = new SportsChannel("NflTV", 4, "NFL");
        channels.add(nfl);
        SportsChannel liga = new SportsChannel("LaLiga", 5, "Football");
        channels.add(liga);
    }

    public void showCurrentChannel(){
        if (open)
        System.out.println("Current Chanel : "+channels.get(currentChannel).toString());
        else System.out.println("Turn on the TV first");
    }

    public void changeChannel(int channelWantoOpen){
        if(open){
            if(channelWantoOpen != currentChannel){

                if(channelWantoOpen <= channels.size() && channelWantoOpen >= 0){
                    currentChannel = channelWantoOpen;
                    System.out.println("Channel : "+channelWantoOpen+ " Info : "+channels.get(currentChannel-1).toString());
                }else{
                    System.err.println("Please enter a valid channel number");
                }

            }else{
                System.out.println("You are already on this channel " + currentChannel+ ". No replacement made");
            }

        }else{
            System.err.println("Turn on the TV first");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Television{" + "brand='" + brand + '\'' + ", size='" + size + '\'' + "Tv Created" + '}';
    }
}
