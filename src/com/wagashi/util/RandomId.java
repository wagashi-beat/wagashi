package com.wagashi.util;

import java.util.UUID;

public class RandomId {

	private String tempUserId;

	public String getTempUserId(){

		tempUserId=UUID.randomUUID().toString();

		return tempUserId;
	}

}
