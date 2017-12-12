package Four;

import java.util.Scanner;

public class Four {
    public String convert(StringBuffer s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                s.replace(i,i+1,"%20");
            }
        }
          return s.toString();
    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        StringBuffer s=new StringBuffer(scan.nextLine());
        String ss=new Four().convert(s);
        System.out.println(ss);
    }
}
