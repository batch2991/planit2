package retest;
import org.testng.annotations.Test;

import pages.Google;

public class Google_testing 
{
	
   @Test
	public void smoketest()
	{
		Google google=new Google();		
		google.search();
	}
}
