
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//1から50まで表示
		//3の倍数でFizzを表示
		//5の倍数でBuzzを表示
		//3と5の倍数でFizzBuzzを表示

		for(int i = 1;i <= 50;i++) {
			if((i % 3) != 0 &&(i % 5) != 0) {
				System.out.print(i);	//3と5の倍数でなければ数字を表示
			}if(i % 3 == 0){
				System.out.print("Fizz");//3の倍数でFizz
			}
			if(i % 5 == 0){
				System.out.print("Buzz");//5の倍数でBuzz
			}
			System.out.println("");//改行
		}
	}
}
