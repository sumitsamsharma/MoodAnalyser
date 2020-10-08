import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testMoodAnalyser
{
    @Test
    public void testInputs () throws MoodAnalysisException
   {
        String mood1=null;
        MoodAnalyser moodAnalyser = new MoodAnalyser(mood1);
        String mood2= moodAnalyser.analyseMood();
        assertEquals("happy",mood2);
    }
}
