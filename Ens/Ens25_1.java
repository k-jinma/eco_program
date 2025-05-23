class Ens25_1{
	public static void main(String[] args){
			int math = 80;
			int english = 80;
			int info = 80;
			
			if( math >= 80 ){　　// 80未満は不合格
				if( english >= 80 ){ // 80未満は不合格
					if( info >= 80 ){
						//特待生
					}else if( info >= 60 ){
						//準特待生
					}else{
						// 不合格
					}
				}else{
					//不合格
				}
			}else{
				//不合格
			}				
	}
}