class FruitCounter{
	public static void main(String[] args){
		String[] fruits = {"Apple", "Banana", "Orange", "Apple", "Grape", "Apple", "Banana"};
		
		int appleCount = 0;
		String word = "Apple";
		
		for(int i = 0; i < fruits.length; i++ ){
			
			if( fruits[i].equals(word) ){
				appleCount++;
			}
		}
		
		System.out.println(word + "の数：" + count );
		
	}
}