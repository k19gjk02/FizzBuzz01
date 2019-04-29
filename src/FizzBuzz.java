
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//1から50まで表示
		//3の倍数でFizzを表示
		for(int i = 1;i <= 50;i++) {
			if((i % 3) != 0) {
				System.out.println(i);
			}else{
				System.out.println("Fizz");//3の倍数でFizz
			}
		}
	}
}
