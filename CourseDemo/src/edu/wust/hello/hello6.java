package edu.wust.hello;

class hello6 {

	public static void main(String[] arguments) {
		hi h = new hi(); 				// ʵ������hiΪ����h
		String s = "Hello world."; 		// ����String���ͱ���s������ֵ
		h.setS(s); 						// ���ö���h��setS����
		System.out.println(h.getS()); 	// ���ö���h��getS����
	}
}
