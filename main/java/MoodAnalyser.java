public class MoodAnalyser
{
    public String analyseMood(String mood) {
        if (mood.contains("sad"))
            return "sad";
        else
            return "happy";
    }

    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        System.out.println(moodAnalyser.analyseMood("I am sad"));
    }
}
