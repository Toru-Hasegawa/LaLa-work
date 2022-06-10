package ex15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main15_4 {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now);
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		c.setTime(now);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		day += 100;
		System.out.println(day);
		
		c.set(Calendar.DAY_OF_MONTH, day);
		Date future = c.getTime();
		System.out.println(future);
		
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(f.format(future));

	}

}
