package Day14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataFormatTest {
	public static void main(String[] args) {
		Date date = new Date();
		
		SimpleDateFormat simple = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");
		System.out.println(simple.format(date.getTime()));
		
		
	}
}
