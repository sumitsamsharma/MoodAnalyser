public class MoodAnalyser
{
    public String mood;
    MoodAnalyser()
    {
    }

    MoodAnalyser(String mood) {
        this.mood=mood;
    }
    public String analyseMood()
    {
        if (mood.contains("sad"))
            return "sad";
        else
            return "happy";
    }

    public static void main(String[] args) {

    }
}
