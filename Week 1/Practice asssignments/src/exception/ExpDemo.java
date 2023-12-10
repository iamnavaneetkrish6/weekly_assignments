package exception;

public class ExpDemo {

	public static void main(String[] args) {

		System.out.println("Open file");

		System.out.println("Read data from file");

		try {
			int result = ExpDemo.div(4, 0);
			System.out.println("Result " + result);

			String name = new String("javeed");

			System.out.println(name.length());

			System.out.println("Update Data to file");

		}

		catch (ArithmeticException e) {

			// e.printStackTrace();

			System.err.println("You can't divide number by zero");

		} catch (NullPointerException e) {

			e.printStackTrace();
		}

		catch (Exception e) {

			e.printStackTrace();

		} finally {
			System.out.println("close file");

		}

	}

	public static int div(int a, int b)  {

		return a / b;

	}

}
