class Ens45_2{
	public static void main(String[] args){
		int[] calories = {500, 620, 700};
		String result = "";
		for( int i = 0; i < calories.length; i++ ){
			result = switch (i){
				case 0 -> {
					String tmp = "朝:";
					tmp += calories[i] < 600 ? "適切なカロリーです" : "カロリー高めです";
					yield tmp;
				}
				case 1 -> {
					String tmp = "昼:";
					tmp += calories[i] < 600 ? "適切なカロリーです" : "カロリー高めです";
					yield tmp;
				}
				case 2 -> {
					String tmp = "夜:";
					tmp += calories[i] < 600 ? "適切なカロリーです" : "カロリー高めです";
					yield tmp;
				}
				default -> "";
			};
			System.out.println(result);
		}
		
	}
}