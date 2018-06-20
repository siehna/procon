package proCon201806B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader cd =new BufferedReader(new InputStreamReader(System.in));
		String a =cd.readLine();
		//int l= a.length();

		for(int i=0;i<2000;i++) {
			a=a.replace("GC", "");
			a= a.replace("CP", "");
			a= a.replace("PG", "");
		}
		int i=a.length();
		System.out.println(i);
	}

}
