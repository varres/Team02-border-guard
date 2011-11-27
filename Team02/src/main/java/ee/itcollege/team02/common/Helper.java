package ee.itcollege.team02.common;

import java.util.Date;

public class Helper {
	public static boolean IsSurrogateDate(Date date){
		if(date.getYear() > 9000){
			return true;
		}else{
			return false;
		}
		
	}

	
}
