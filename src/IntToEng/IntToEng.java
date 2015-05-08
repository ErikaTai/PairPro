package IntToEng;
import java.util.Scanner;

public class IntToEng {
	
	static String[] number = {
			"zero", "one", "two", "three", "four", "five"
	};
	
	// メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	if(n>=0 && n<6) return number[n];
    	return "";
    }
    
    
}
