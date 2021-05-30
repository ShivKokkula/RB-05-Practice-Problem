import com.moodanalyser.MoodAnalyser.MoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class MoodAnalyserTest {
    @Test
    void givenSadMessage_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        Assertions.assertEquals("SAD",moodAnalyser.analyseMood());
    }
    @Test
    void givenHappyMessage_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any mood");
        Assertions.assertEquals("HAPPY",moodAnalyser.analyseMood());
    }
    @Test
    void givenSadMessage_WithParameter_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        Assertions.assertEquals("SAD",moodAnalyser.analyseMood());
    }
    @Test
    void givenSadMessage_WithoutParameter_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        Assertions.assertEquals("SAD",moodAnalyser.analyseMood());
    }
    @Test
    void givenHappyMessage_WithParameter_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
        Assertions.assertEquals("HAPPY",moodAnalyser.analyseMood());
    }
    @Test
    void givenHappyMessage_WithoutParameter_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        Assertions.assertEquals("HAPPY",moodAnalyser.analyseMood());
    }
    @Test
    void givenNull_ShouldHandle_Exception() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        Assertions.assertEquals("HAPPY",moodAnalyser.analyseMood());
    }
    @Test
    void givenNull_ShouldThrowCustom_Exception() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        Assertions.assertEquals("HAPPY",moodAnalyser.analyseMood());
    }
    @Test
    void givenEmptyString_ShouldThrowCustom_Exception() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        Assertions.assertEquals("HAPPY",moodAnalyser.analyseMood());
    }
}
