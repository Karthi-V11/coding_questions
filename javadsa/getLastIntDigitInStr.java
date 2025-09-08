import java.util.Scanner;

public class getLastIntDigitInStr {
    public static void main(String ar[]){
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the Strings : ");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.println("Last digit of " + str1 + "^" + str2 + " is: " + getLastDigits(str1, str2));
        sc.close();
    }
    static int getLastDigits(String str1,String str2){
        int base=Integer.parseInt(str1)%10;
        if(str2.equals("0")){
            return 1;
        }
        int exp=0;
        for (int i = 0; i <str2.length(); i++) {
            exp=(exp*10+(str2.charAt(i)-'0'))%4;
        }
        if(exp==0){
            exp=4;
        }
        return (int)Math.pow(base, exp)%10;
    }
}
