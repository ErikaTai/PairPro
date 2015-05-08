package IntToEng;
import java.util.Scanner;

public class IntToEng {
	
	static String[] numberZeroToNineteen = {
			"zero", "one", "two", "three", "four", "five",
			"six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen",
			"sixteen", "sevelnteen", "eighteen", "nineteen"
	};
	
	static String[] numberTwenty = {
		"twenty", "thirty", "forty", "fifty",
		"sixty", "seventy", "eighty", "ninety", "hundred"
	};
	
	// メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	if(n>=0 && n<numberZeroToNineteen.length)
    		return numberZeroToNineteen[n];
    	else if(n<100) {
    		if(n%10==0) return numberTwenty[n/10-2];
    		else return
    				numberTwenty[n/10-2] + " " + numberZeroToNineteen[n%10];
    	}
    	else if(n==100) return numberTwenty[n/10-2];
    	return "";
    }
    
    
}
