import org.junit.Test;
import static org.junit.Assert.*;
public class testMoodAnalyser
{
    @Test
    public void testInputs()
    {
        MoodAnalyser moodAnalyse1 = new MoodAnalyser("I am in sad mood");
        String msg1 = moodAnalyse1.analyseMood();
        assertEquals("sad",msg1);
        MoodAnalyser moodAnalyse2 = new MoodAnalyser("I am in happy mood");
        String msg2 = moodAnalyse2.analyseMood();
        assertEquals("happy",msg2);
        MoodAnalyser moodAnalyse3 = new MoodAnalyser("I am in  mood");
        String msg3 = moodAnalyse3.analyseMood();
        assertEquals("happy",msg3);
    }
}
