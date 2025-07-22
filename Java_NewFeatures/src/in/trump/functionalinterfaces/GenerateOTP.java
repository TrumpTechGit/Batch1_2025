package in.trump.functionalinterfaces;

import java.util.function.Supplier;

public class GenerateOTP {

	public static void main(String[] args) {
		Supplier<String> supplier = () -> {
			StringBuilder otp = new StringBuilder("");
				for(int i = 1; i <= 3; i++) {
					otp.append((int) (Math.random() * 10)); //0 - 10 -- 5, 2, 7
				}
				return otp.toString();
		};
		System.out.println(supplier.get());

	}

}
