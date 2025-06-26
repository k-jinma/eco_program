class Ens62_1{
	public static void main(String[] args){
		
		int[][] scores = {
			{90, 85, 88},
			{70, 60, 65},
			{50, 45, 55}
		};
		
		for( int i = 0; i < 3; i++ ){
			for( int j = 0; j < 3; j++ ){
				System.out.println(scores[i][j]);
			}
		}
		
		int average = 
		(scores[0][0] + scores[0][1] + scores[0][2]) / 3;
		System.out.println(average);
		
		int average = 
		(scores[1][0] + scores[1][1] + scores[1][2]) / 3;
		System.out.println(average);
		
		int average = 
		(scores[2][0] + scores[2][1] + scores[2][2]) / 3;
		System.out.println(average);
		
	}
}