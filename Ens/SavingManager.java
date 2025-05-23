class SavingManager{
	public static void main(String[] args){
		int mokuhyou = 10000;
		int chokin = 5000;
		int month = 0;
	
		while( chokin < mokuhyou ){
			month++;
			chokin += 1000;
			System.out.println( month + "か月目：貯金額は" + chokin + "円です。");
		}
		System.out.println(mokuhyou + "円貯めるのに" + month + "カ月かかります。");
	}
}