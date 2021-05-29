package com.moodanalyser.MoodAnalyser;

public class MoodAnalyser {
    public static String messageToBeAnalysed;
    public String analyseMood() {
        if(messageToBeAnalysed.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }

    public MoodAnalyser(String message) {
        this.messageToBeAnalysed = message;
    }

    public MoodAnalyser() {
        this.messageToBeAnalysed = "sad";
    }
}
