package com.moodanalyser.MoodAnalyser;

public class MoodAnalyser {
    public String anayseMood(String message) {
        String analysedMood = message;
        if(analysedMood.contains("sad"))
            return "SAD";
        else if(analysedMood.contains("happy"))
            return "HAPPY";
        else
            return "NO MOOD";
    }
}
