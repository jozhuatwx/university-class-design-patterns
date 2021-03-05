package bridge;

public class Sony implements Television {
  // sony specifc implementations
  @Override
  public void on() {}

  @Override
  public void off() {}

  @Override
  public void tuneChannel(int channel) {}
}
