package lab2;

public class AudioClipManager {
  private static AudioClipManager instance = new AudioClipManager();
  // previously requested audio clip
  private AudioClip prevClip;

  private AudioClipManager() {}

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
