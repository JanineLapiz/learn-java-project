public class LearnJavaProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = new String();
		message = "Hello, Java!";
		System.out.println(getSum(2, 1, message));
	}

	
	private static Integer getSum(Integer num1, Integer num2, String message) {
		Integer sum = num1 + num2;
		if(message != "") {
			return 0;
		}
		return sum;
	}
}
