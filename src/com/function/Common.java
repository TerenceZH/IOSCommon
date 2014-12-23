package com.function;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {
	/**
	 * ��ȡ����ʱ����ַ�����ʽ
	 * @return
	 */
	public static String time(){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return format.format(new Date());
	}
	
	/**
	 * ��ȡ�������ڵ��ַ�����ʽ
	 * @return
	 */
	public static String time2(){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd ");
		return format.format(new Date());
	}
	
	/**
	 * ʱ���ʽ�Ƿ�Ϸ�
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
	 * ת�� �������κ��ַ���
	 * @param s
	 * @return
	 */
	public static  int getType(String s){
		int t = -1;
		switch (s) {
		case "������Ա":
			t = 1;
			break;
		case "������Ա":
			t = 2;
			break;
		case "������Ա":
			t = 3;
			break;
		case "�ܾ���":
			t = 4;
			break;
		case "ϵͳ����Ա":
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
			s = "ϵͳ����Ա";
			break;
		case 1:
			s = "������Ա";
			break;
		case 2:
			s = "������Ա";
			break;
		case 3:
			s = "������Ա";
			break;
		case 4:
			s = "�ܾ���";
			break;

		default:
			break;
		}
		return s;
	}

}
