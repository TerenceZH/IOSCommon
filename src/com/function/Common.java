package com.function;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {
	/**
	 * 获取现在时间的字符串形式
	 * @return
	 */
	public static String time(){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return format.format(new Date());
	}
	
	/**
	 * 获取现在日期的字符串形式
	 * @return
	 */
	public static String time2(){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd ");
		return format.format(new Date());
	}
	
	/**
	 * 时间格式是否合法
	 * @param time
	 * @param format
	 * @return
	 */
	public static boolean isValidTimeFormat(String time,String format){
		DateFormat formatter = new SimpleDateFormat(format);  
        try{  
            Date date = (Date)formatter.parse(time);   
            return time.equals(formatter.format(date));  
        }catch(Exception e){  
            return false;  
        }  
	}
	
	/**
	 * 转化 类型整形和字符串
	 * @param s
	 * @return
	 */
	public static  int getType(String s){
		int t = -1;
		switch (s) {
		case "库存管理员":
			t = 1;
			break;
		case "进销人员":
			t = 2;
			break;
		case "财务人员":
			t = 3;
			break;
		case "总经理":
			t = 4;
			break;
		case "系统管理员":
			t = 0;
			break;
		default:
			break;
		}
		return t;
	}
	
	public static String getType(int t){
		String s = "";
		switch (t) {
		case 0:
			s = "系统管理员";
			break;
		case 1:
			s = "库存管理员";
			break;
		case 2:
			s = "进销人员";
			break;
		case 3:
			s = "财务人员";
			break;
		case 4:
			s = "总经理";
			break;

		default:
			break;
		}
		return s;
	}

}
