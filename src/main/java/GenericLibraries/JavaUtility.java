package GenericLibraries;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public int generateRandomNum( int limit)
	{
		Random random = new Random();
		return random.nextInt(limit);
	}
	
	public String getCurrentTime()
	{
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy_hh_mm-sss");
		return sdf.format(date);
	}

}
