import java.io.File;
import java.util.Scanner;

class Sample64_2{
	public static void main(String[] args) throws Exception{
		
		File file = new File("employees.csv");
		Scanner scanner = new Scanner(file);
		
		scanner.useDelimiter(",|\\R");
		while( scanner.hasNext() ){
			String data = scanner.next();
			System.out.println(data);
		}
		
		scanner.close();

	}
}