import java.io.File;
import java.util.Scanner;

class Sample64_1{
	public static void main(String[] args) throws Exception{
		
		File file = new File("employees.csv");
		Scanner scanner = new Scanner(file);
		
		String s = scanner.next();
		System.out.println(s);
		
		s = scanner.nextLine();
		System.out.println(s);
		
		scanner.close();
	}
}