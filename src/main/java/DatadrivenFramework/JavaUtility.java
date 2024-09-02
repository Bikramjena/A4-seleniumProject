package DatadrivenFramework;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {

		public String calenderHandling(String pattern) {
			Calendar cal = Calendar.getInstance();
			Date d = cal.getTime();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
			String date = sdf.format(d);
			return date;
			}
		public int getRandomNumber(int range) {
			Random r = new Random();
			int num = r.nextInt(range);
			return num;
		}
	
	public static void main(String[] args) {
		JavaUtility t = new JavaUtility ();
		System.out.println(t.calenderHandling("dd/MM/YYYY"));
		System.out.println(t.getRandomNumber(10));
		
	}
	public String getDataFromProperties(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
