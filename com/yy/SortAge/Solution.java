package SortAge;

public class Solution {
    public void Sort(int data[],int length){
        int maxAge=99;
        int[]ageArr=new int[maxAge+1];
        for(int i=0;i<maxAge;i++){
            ageArr[i]=0;
        }
        for(int i=0;i<length;i++){
            ageArr[data[i]]++;
        }
        int index=0;
        for(int i=0;i<maxAge;i++){
            for(int j=0;j<ageArr[i];j++){
                data[index]=i;
                ++index;
            }
        }
    }
    public static void main(String[] args){
        int[]data=new int[]{1, 1,17,17,2,18,9,19};
        new Solution().Sort(data,data.length-1);
        for(int i=0;i<data.length-1;i++){
            System.out.print(String.valueOf(data[i])+' ');
        }
    }
}
