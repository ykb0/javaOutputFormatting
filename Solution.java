import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                if(x>99 && x<=999){
                    System.out.println(s1 + String.format("%" + (15-s1.length()) + "s","") + x);
                }
                else if(x==0){
                        System.out.println(s1 + String.format("%" + (15-s1.length()) + "s","") + "00" + x);
                }
                else{   
                    System.out.println(s1 + String.format("%" + (15-s1.length()) + "s","") + "0" + x);
                }
                //Complete this line
            }
            System.out.println("================================");

    }
}



