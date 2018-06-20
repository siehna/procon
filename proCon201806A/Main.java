package proCon201806A;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner cd = new Scanner(System.in);
		String c = cd.next();
		String g = c.split("")[0];

		int n =Integer.parseInt(c.substring(1));

		int ans =0;
		if(g.matches("M")) {
			ans=1868-1+n;
		}else if(g.matches("T")) {
			ans=  1912-1+n;
		}else if(g.matches("S")) {
			ans= 1926-1+n;
		}else if(g.matches("H")) {
			ans= 1989-1+n;
		}else if(g.matches("X")) {
			ans= 2019-1+n;
		}

		System.out.println(ans);

	}

}
