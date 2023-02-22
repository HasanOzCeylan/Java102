public class Channel {

    private String name;

    public Channel(String name, int channelNo) {
        this.name = name;
        this.channelNo = channelNo;
    }

    private int channelNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(int channelNo) {
        this.channelNo = channelNo;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "name='" + name + '\'' +
                ", channelNo=" + channelNo +
                '}';
    }

}
