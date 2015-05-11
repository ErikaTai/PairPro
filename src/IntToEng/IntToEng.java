package IntToEng;
import java.util.Scanner;

public class IntToEng {
	
	static String[] numberZeroToNineteen = {
			"zero", "one", "two", "three", "four", "five",
			"six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen",
			"sixteen", "sevelnteen", "eighteen", "nineteen"
	};
	
	static String[] number10times = {
		"twenty", "thirty", "forty", "fifty",
		"sixty", "seventy", "eighty", "ninety"
	};
	
	
	// メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    public static String translateEng(int n) {
    	if(n<100) {
    		return translate10times(n);
    	}
    	if(n<1000) {
    		if(n%100==0) return hundredtimes(n);
    		if(n%10==0) return hundredtimes(n) + " " + translate10times(n%100);
    		return hundredtimes(n) + " " + translate10times(n%100);
    	} if(n==1000) return "thousand";
    	return "";
    }

	public static String hundredtimes(int n) {
		return numberZeroToNineteen[n/100] + " " + "hundred";
	}

	public static String translate10times(int n) {
		if(n<numberZeroToNineteen.length) return numberZeroToNineteen[n];
		if(n%10==0) return number10times[n/10-2];
		return	number10times[n/10-2] + " " + numberZeroToNineteen[n%10];
	}
    
    
}
