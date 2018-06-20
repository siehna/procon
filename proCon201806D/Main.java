package proCon201806D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader cd = new BufferedReader(new InputStreamReader(System.in));

		String n = cd.readLine();
		long a = Long.parseLong(n.split(" ")[0]);
		long b = Long.parseLong(n.split(" ")[1]);
		long k = Long.parseLong(n.split(" ")[2]);
		long ans =0;
		b=b-1;
		a=a+1;
		long d = b/k - a/k +1;


		if(a>=0&&b>=0) {
			ans= (b/k+a/k)*d;
		}else if(a<=0&&b>=0) {
			ans= (b/k-a/k)*d;
		}else if(a<0&&b<0) {
			ans= (b/k+a/k)*d;
		}


		System.out.println(ans);
	}

}