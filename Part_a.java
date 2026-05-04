import java.util.Scanner;
public class Part_a {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = sc.nextInt();
        int[] div= new int[32];
        int index=0;
        while(num>0){
            div[index] = num%2;
            num = num/2;
            index++;
        }
        for(int i= index-1;i>=0;i--){
            System.out.print(div[i]);
        }
        sc.close();


    }
    
}
