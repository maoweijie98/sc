package com.jg.utils;

public class UtilsTestMain {
	
	public static void main(String[] args) {
		String p="123";
		byte[] salt = Digests.generateSalt(8);
		String saltStr=Encodes.encodeHex(salt);
		pr(saltStr);
		byte[] s1=Encodes.decodeHex(saltStr);
		pr(Encodes.encodeHex(s1));
		byte[] hashPassword = Digests.sha1(p.getBytes(), salt, 1024);
		String ep=Encodes.encodeHex(hashPassword);
		pr(ep);
	}
	
	public static void pr(String s){
		System.out.println(s);
	}

}
