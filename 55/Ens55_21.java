class Ens55_2{
	public static void main(String[] args){
		for( int i = 1; i <= 30; i++ ){
			if( i % 5 == 0 ){
				System.out.println("スキップします");
				continue;
			}else{
				System.out.println(i);
			}
		}
	}
}
