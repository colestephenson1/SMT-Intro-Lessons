package com.stephenson.introLesson1;

/****

<b>Title:</b> Example2.java<br>
<b>Project:</b> intro-programming-lib<br>
<b>Description:</b> <br>
<b>Copyright:</b> Copyright (c) 2023<br>
<b>Company:</b> Silicon Mountain Technologies<br>
@author Cole Stephenson
@version 1.0
@since May 22 2023
@updates:

****/

public class Example2 {
	
	/**
	 * 
	 */
	
		public void go() {
			
			int starter1 = 0;
			int starter2 = 0;
			
			while(starter1 < 10) {
				starter1++;
				System.out.println(starter1);
			}
			
			for(int i = starter1; i > 0; i--) {
				System.out.println(i);
			}
			
			while(starter2 <= 20) {
				
				starter2++;
				if(starter2 % 2 == 0) {
					System.out.println(starter2);
				}
				
			}
			
		}
	
}
