package bridge;

public class Bridge {
  public static void main(String[] args) {
    Television myTV = new Sony();
    RemoteControl rc = new ConcreteRemote(myTV);
    rc.on();
    rc.off();
    rc.setChannel(5);
    rc.channelDown();
  }
}
