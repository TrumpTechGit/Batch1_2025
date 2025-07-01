package in.trump.exceptionhandling;

public class UncheckedOrRuntimeException {

	public static void main(String[] args) {
		try {
		int a = 10;
		int b = 0;
		int c = a/b;
		System.out.println("Result :"+c);
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("Exception occured : no clarity about exception");
		} catch (ArithmeticException ae) {
			System.out.println("Exception occured : / by zero ");
		} catch (Exception e) {
			System.out.println("unkown exception :"+e);
		}
		System.out.println("-------------------------------");
		System.out.println("after exception");
	}

}
