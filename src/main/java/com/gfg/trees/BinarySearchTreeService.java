package com.gfg.trees;

import com.gfg.models.TreeNode;

public class BinarySearchTreeService {

    public TreeNode getLCA(TreeNode root,int n1, int n2){

        TreeNode lca = null;
        int min = n1<n2 ? n1:n2;
        int max = n1<n2 ? n2:n1;

        return getLCARecursive(root,min,max,lca);
    }

    private TreeNode getLCARecursive(TreeNode root, int min, int max,TreeNode lca) {
        if(root == null){
            return null;
        }
        if(root.getData() < min){
            return getLCARecursive(root.getRight(),min, max, lca);
        }else if(root.getData() > max){
            return getLCARecursive(root.getLeft(), min, max, lca);
        }else{
            return root;
        }
    }
}
