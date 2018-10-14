package obiektowe;

import java.util.Date; 

import java.text.SimpleDateFormat;
public class Calendar {
public static void main(String[] args){ 
	Date z = new Date(); 
	
SimpleDateFormat sdf = new SimpleDateFormat("dd.MMM.YYYY."); 
System.out.println(sdf.format(z.getTime()));
		
} }




