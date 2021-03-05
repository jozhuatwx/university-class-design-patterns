package singleton;

public class AudioClipManager {
  // create an object of AudioClipManager
  private static AudioClipManager instance = new AudioClipManager();
  // previously requested audio clip
  private AudioClip prevClip;

  // make the constructor private so that this class cannot be instantiated
  private AudioClipManager() {}

  // get the only available object
  public static AudioClipManager getInstance() {
    return instance;
  }

  // stop previously requested audio clip and play the given audio clip
  public void play(AudioClip clip) {
    if (prevClip != null) {
      prevClip.stop();
    }
    prevClip = clip;
    clip.play();
  }

  // stop playing the audio clip
  public void stop() {
    if (prevClip != null) {
      prevClip.stop();
    }
  }
}
