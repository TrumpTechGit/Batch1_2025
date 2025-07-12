package in.trump.utilpackage;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Trump technologies institute"," ");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
