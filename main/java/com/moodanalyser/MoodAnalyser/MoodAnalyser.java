package com.moodanalyser.MoodAnalyser;

public class MoodAnalyser {
    public String analyseMood(String message) {
        String messageToBeAnalysed = message;
        if(messageToBeAnalysed.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
