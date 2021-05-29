import com.moodanalyser.MoodAnalyser.MoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    void analyseMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String sadMessage = moodAnalyser.anayseMood("SAD");
        Assertions.assertEquals("SAD",sadMessage);
    }
}
