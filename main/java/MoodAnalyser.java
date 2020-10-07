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
        try {
            if (mood.contains("sad"))
                return "sad";
            else
                return "happy";
        }
        catch (Exception e){
            return "happy";
        }
    }

    public static void main(String[] args) {

    }
}
