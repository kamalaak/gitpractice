package org.il;

import java.io.IOException;

public class Launch extends  Ak{
public static void main(String[] args) throws IOException, InterruptedException {
//	brower("https://letcode.in/edit");
//	sendtext("id", "fullName", "kamalesh akshaya natarajan");
//	//sendtextid("fullName", "kamalesh akshaya");
//	sendtextid("join", "what the fuck is the main part of the clobal");
//	gettextbyatt("getMe", "value");
//	gettext("class", "label");
//	gettext("xpath", "//label[.='What is inside the text box']");
//	quit();
//	
//	 
	
	brower("https://www.facebook.com");
	
	String path = "C:\\\\Users\\\\kamalesh\\\\eclipse-workspace\\\\Km\\\\Excell\\\\data.xlsx";
	
	String user = excelread(path, "Sheet0", 1, 1);
	String pass = excelread(path, "Sheet0", 2, 2);
	sendtext("id", "email", user);
	sendtext("name", "pass", pass);
	clickbyname("login");
	Thread.sleep(3000);
	quit();
	
	
	
}
}
