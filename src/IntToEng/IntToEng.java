package IntToEng;
import java.util.Scanner;

public class IntToEng {
	// ���C�����\�b�h
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // ���l���p�󂷂�ϊ����郁�\�b�h
    static String translateEng(int n) {
    	if(n == 0) return "zero";
    	if(n == 1) return "one";
    	if(n == 2) return "two";
    	if(n == 3) return "three";
    	if(n == 4) return "four";
    	if(n == 5) return "five";
    	return "";
    }
    
    
}
