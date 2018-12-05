package com.perennial;

import org.omg.CORBA.BAD_CONTEXT;

import com.perennial.util.Base64;

public class SolutionNumber4 {

	public static void main(String[] args) {
		String toBeEncoded = "Rishi";
		byte[] data = toBeEncoded.getBytes();
		String encodedString = Base64.encode(data);
		System.out.println(encodedString);
		byte[] decodeValue = Base64.decode(encodedString);
		String decodedString = decodeValue.toString();
		System.out.println(decodedString);
		
	}
}
