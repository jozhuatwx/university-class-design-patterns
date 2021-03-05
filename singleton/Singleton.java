package singleton;

public class Singleton {
  public static void main(String[] args) {
    // get the only object available
    AudioClipManager audioClipManager = AudioClipManager.getInstance();
    // create an AudioClip
    AudioClip audioClip = new AudioClip();
    // play the AudioClip
    audioClipManager.play(audioClip);
    // stop the AudioClip
    audioClipManager.stop();
  }
}
