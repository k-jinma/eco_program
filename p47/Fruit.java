package p47;

public class Fruit {
    public static void main(String[] args) {

        String name1 = args[0];
        System.out.println(name1);
        String name2 = args[1];
        System.out.println(name2);
        String name3 = args[2];
        System.out.println(name3);

        // あるいはforを使用してすべて出力する方法
        for( int i = 0; i < args.length; i++ ){
            System.out.println( args[i] );
        }
    }
}
