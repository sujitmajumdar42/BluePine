package com.cipheric.bluepine.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ApplicationUtil {
	
	public static String getCurrentTime() {
		return new SimpleDateFormat("yyyy-MM-dd HH.mm.ss.SS").format(new Date());
	}
}
