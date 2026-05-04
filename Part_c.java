import java.util.Scanner;
public class Part_c {
    public static String binaryConvert(int num){
        String binary="";
        int remainder;
        while(num>0){
            remainder = num%2;
            num = num/2;
            binary = remainder + binary;
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        String result= binaryConvert(num);
        System.out.print(result);
    }
}
