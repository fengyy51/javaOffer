package six;
public class Solution {

    public  TreeNode ConstuctBinaryTree(int[]pre,int startpr,int endpr,int[]in,int startin,int endin){
        if(startpr>endpr||startin>endin){
            return null;
        }
        TreeNode root=new TreeNode(pre[startpr]);
        for(int i=startin;i<=endin;i++){
            if(in[i]==pre[startpr]){
                root.left=ConstuctBinaryTree(pre,startpr+1,startpr+i-startin,in,startin,i-1);
                root.right=ConstuctBinaryTree(pre,startpr+i-startin+1,endpr,in,i+1,endin);
            }
        }
        return root;
    }

    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return new Solution().ConstuctBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
    }

}