package bridge;

public class ConcreteRemote extends RemoteControl {
  private int currentChannel;

  ConcreteRemote(Television television) {
    super(television);
  }

  @Override
  public void channelUp() {
    currentChannel++;
    setChannel(currentChannel);
  }

  @Override
  public void channelDown() {
    currentChannel--;
    setChannel(currentChannel);
  }
}
