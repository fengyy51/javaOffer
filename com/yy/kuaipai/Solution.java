package kuaipai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public void sort(int[]data,int start,int end){
        if(start>=end){
            return;
        }
        int i=start,j=end,k=data[start];
        while (i<j){
            while (i<j&&data[j]>=k){
                j--;
            }
            if(data[j]<=data[start]){
//                System.out.println("j="+String.valueOf(j));
//                System.out.println("i="+String.valueOf(i));
                swap(data,j,i);
                while ((i<j)&&(data[i]<=k)){
                    i++;
                }
                if(data[i]>=k){
//                    System.out.println("j="+String.valueOf(j));
//                    System.out.println("i="+String.valueOf(i));
                    swap(data,i,j);
                }
            }

        }
        int min=(j<i?j:i);
//        System.out.println("min="+String.valueOf(min));
        sort(data,start,min-1+1);
        sort(data,min+1,end);


    }
    public void swap(int[]data,int i,int j){
        int tem=data[i];
        data[i]=data[j];
        data[j]=tem;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String scan=br.readLine();
        String[] ls = scan.split(" ");
        int[]arr=new int[ls.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(ls[i]);
        }
        new Solution().sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
