package com.moodanalyser.MoodAnalyser;

public class MoodAnalyser {
    public static String messageToBeAnalysed;
    public String analyseMood() {
        try {
            if(messageToBeAnalysed == null || messageToBeAnalysed.isEmpty())
                throw new MoodAnalysisException();
            if(messageToBeAnalysed.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        }catch(MoodAnalysisException e){
            return "HAPPY";
        }
    }

    public MoodAnalyser(String message) {
        this.messageToBeAnalysed = message;
    }

    public MoodAnalyser() {
        this.messageToBeAnalysed = "sad";
    }
}
