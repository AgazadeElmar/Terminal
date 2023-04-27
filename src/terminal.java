import java.util.Scanner;

public class terminal{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] arr={1,5,10,20,50,100,200,500};
        System.out.print("Cash out: ");
        int cash = input.nextInt();
        for(int i = arr.length-1;i>=0;i--){
            int remain =0;
            if (cash > arr[i]){
                remain=cash/arr[i];
                System.out.println(arr[i]+"Azn---"+remain);
            }
            cash-=remain*arr[i];

        }
    }


















}