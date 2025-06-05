import java.util.Scanner;
class BookSearch{
	public static void main(String[] args){
		
		String[] bookTitles = {"Java入門","Python基礎","C#プログラミング"};
		int[] bookPrices = {2500, 2200, 2800};
		boolean isFind = false;
		
		Scanner scanner = new Scanner(System.in, "Shift-JIS");
		System.out.print("検索したい本のタイトルを入力してください：");
		String searchTitle = scanner.nextLine();
		
		System.out.println( searchTitle );
		
		
	}
}