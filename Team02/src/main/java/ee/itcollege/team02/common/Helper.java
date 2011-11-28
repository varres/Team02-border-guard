package ee.itcollege.team02.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {
	public static boolean IsSurrogateDate(Date date){
		SimpleDateFormat simpleDateformat=new SimpleDateFormat("yyyy");
		String i = simpleDateformat.format(date);
		int year = Integer.valueOf(i);
		if(year > 9000){
			return true;
		}else{
			return false;
		}
		
	}

	
}
