import com.moodanalyser.MoodAnalyser.MoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class MoodAnalyserTest {
    @Test
    void givenSadMessage_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String sadMessage = moodAnalyser.analyseMood("I am in sad mood");
        Assertions.assertEquals("SAD",sadMessage);
    }

    @Test
    void givenHappyMessage_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String happyMessage = moodAnalyser.analyseMood("I am in Any mood");
        Assertions.assertEquals("HAPPY",happyMessage);
    }
}
