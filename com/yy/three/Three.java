package three;

import java.util.Scanner;

public class Three {
    public Boolean find(int[][] arr,int row,int column,int nums){
        int frow=0;
        int fcolumn=column-1;
        while (frow<=row-1&&fcolumn>=0){
            System.out.println(frow);
            System.out.println(fcolumn);
            if(arr[frow][fcolumn]>nums){
                fcolumn--;
            }else if(arr[frow][fcolumn]<nums){
                frow++;
            }else if(arr[frow][fcolumn]==nums){
                return true;
            }
        }
        System.out.println(frow);
        System.out.println(fcolumn);
// if(frow>row-1||fcolumn<0){
// return false
// }
// if(arr[frow][fcolumn]==nums){
// return true;
// }else {
        return false;
// }
    }
    public static void main(String[]args){
        int[][] arr=new int[4][4];
        Scanner scn=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=Integer.parseInt(scn.next());
            }
        }
// for(int i=0;i<arr.length;i++){
// for(int j=0;j<arr[i].length;j++){
// System.out.println(arr[i][j]);
// }
// }
        Scanner scn1=new Scanner(System.in);
        int pos=Integer.parseInt(scn1.nextLine());
        Boolean bl=new Three().find(arr,4,4,pos);
        System.out.println(bl);


    }

}

