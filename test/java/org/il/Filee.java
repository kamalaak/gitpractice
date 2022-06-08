package org.il;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Filee {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\kamalesh\\Desktop\\New folder (3)\\kamalesh.txt");
	FileUtils.write(f, "what the fudk is the\n main\n part of the \nbofdy ");
	
	System.out.println("maariyamma and mariyatha");
	
}
}
