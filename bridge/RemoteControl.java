package bridge;

public abstract class RemoteControl {
  private Television television;

  RemoteControl(Television television) {
    this.television = television;
  }

  public void on() {
    television.on();
  }

  public void off() {
    television.off();
  }

  public void setChannel(int channel) {
    television.tuneChannel(channel);
  }

  public abstract void channelUp();
  public abstract void channelDown();
}
