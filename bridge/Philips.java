package bridge;

public class Philips implements Television {
  // philips specifc implementations
  @Override
  public void on() {}

  @Override
  public void off() {}

  @Override
  public void tuneChannel(int channel) {}
}
