import java.util.Scanner;
public class Part_b {
    public static int binaryConvert(int num){
        int[] div= new int[32];
        int index=0;
        while(num>0){
            div[index] = num%2;
            num = num/2;
            index++;
        }
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i]= div[index-1-i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] result = binaryConvert(num);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        sc.close();
    }
}
