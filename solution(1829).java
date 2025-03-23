 import java.util.Scanner;
public class Solution {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int n=input.nextInt();
        for(int i=0;i<n;i++){
            int a=input.nextInt();
            int[] arr=new int[a];
            int b=0;
            int c=0;

            for(int j=0;j<a;j++){
                arr[j]=input.nextInt();
            }
            for(int j=0;j<a;j++){
                if (arr[j]==1) {

                    if(c>b){
                        b=c;
                        c=0;

                    }
                    c=0;
                }
                else{
                    c+=1;
                }
            }if(c>b){
                b=c;}

            System.out.println(b);
        }

    }
}
