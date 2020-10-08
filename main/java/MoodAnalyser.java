
public class MoodAnalyser
{
    public String mood;
    public enum blank{Empty, notEmpty}
    MoodAnalyser()
    {
    }

    MoodAnalyser(String mood) {
        this.mood=mood;
    }
    public String analyseMood () throws MoodAnalysisException
    {
        blank m = blank.notEmpty;
        try {
            if (mood.contains("sad"))
                return "sad";
            else
                return "happy";
        }
        catch (Exception e){
            System.out.println("User entered null");
            m = blank.Empty;
            throw new MoodAnalysisException("Null entered");
        }
        finally {
            System.out.println("Mood is: "+m);
        }
    }

    public static void main(String[] args) {

    }
}
