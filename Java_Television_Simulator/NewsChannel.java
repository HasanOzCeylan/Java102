public class NewsChannel extends Channel {

    private String newsType;


    public NewsChannel(String name, int channelNo, String newsType) {
        super(name, channelNo);
        this.newsType = newsType;
    }
}
