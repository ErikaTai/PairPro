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
		"sixty", "seventy", "eighty", "ninety", "hundred", "thousand"
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
    		if(n%10==0) return number10times[n/10-2];
    		else return
    				number10times[n/10-2] + " " + numberZeroToNineteen[n%10];
    	}
    	else if(n>=100 && n<1000) {
    		if(n%100==0) return numberZeroToNineteen[n/100] + number10times[8];
    		else if(n%10==0) return numberZeroToNineteen[n/100] + number10times[8] + number10times[n%100/10-2];
    		else return numberZeroToNineteen[n/100] + number10times[8] + number10times[n%100/10-2] + " " + numberZeroToNineteen[n%10];
    	} else if(n==1000) return number10times[9];
    	return "";
    }
    
    
}
