package average;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	
	static public void main(String[] args) {
//		try {
//			BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\Location\\text.csv")));
//			String line = read.readLine();
//			String[] part = line.split(",");
//			System.out.println(part[8]);
//			if(part[8].equals("6050")) {
//				System.out.println("right");
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		float f = Float.valueOf("121.463056");
		int d = (int) f;
		System.out.println(d);
		
	}

}
