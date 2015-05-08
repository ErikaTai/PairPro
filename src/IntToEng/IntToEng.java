package IntToEng;
import java.util.Scanner;

public class IntToEng {
	
	static String[] number = {
			"zero", "one", "two", "three", "four", "five",
			"six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen",
			"sixteen", "sevelnteen", "eighteen", "nineteen", "twenty"
	};
	
	// ���C�����\�b�h
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // ���l���p�󂷂�ϊ����郁�\�b�h
    static String translateEng(int n) {
    	if(n>=0 && n<number.length) return number[n];
    	return "";
    }
    
    
}
