package javafeat;

import java.util.Calendar;

public enum EnumClass {
	winter(1),
	summer(2),
	spring(3),
	rainy(4);
	
	private Integer num;
	EnumClass(int num){
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}


	public static void main(String a[]) {
		System.out.println(EnumClass.rainy.getNum());
		Calendar.getInstance();
	}
	
}
