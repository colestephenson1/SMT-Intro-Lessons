package com.stephenson.introLesson1;

/****

<b>Title:</b> TestDriver.java<br>
<b>Project:</b> intro-programming-lib<br>
<b>Description:</b> <br>
<b>Copyright:</b> Copyright (c) 2023<br>
<b>Company:</b> Silicon Mountain Technologies<br>
@author Cole Stephenson
@version 1.0
@since May 22 2023
@updates:

****/

public class TestDriver {
	
	static Example1 firstExample = new Example1();
	static Example2 secondExample = new Example2();
	
	public static void main(String[] args) {		
		firstExample.go();
		secondExample.go();
	}
}
