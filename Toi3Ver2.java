class Toi3{
	public static void main(String[] args){

		int ninzu = 3; // 人数
		
		int day1Fee = 3000; // 1日目の料金
		int day1Shortage = -200; // 1日目の過不足

		int day2Fee = 2000; // 2日目の料金
		int day2Shortage = 149; // 2日目の不足金

		// 1日目の支払いは人数×料金-過不足
		int day1 = ninzu * day1Fee + day1Shortage; // 1日目の支払い
		// 2日目の支払いは人数×料金+不足金
		int day2 = ninzu * day2Fee + day2Shortage; // 2日目の支払い

		// 平均は(1日目の支払い+2日目の支払い)÷人数
		double average = (day1 + day2) / (double) ninzu; // 平均
		System.out.println(average); // 平均を出力

	}
}