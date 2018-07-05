/*



*/


package com.gfg.bst;

import com.gfg.models.TreeNode;

import java.util.Scanner;

public class IsBST {

    public static void main(String[] args){

        System.out.println(isBST(readInput()));
    }

    public static boolean isBST(TreeNode root){
        
    	return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private static boolean isBST(TreeNode root,int min, int max){
        if(root==null)
            return true;

        if(root.getData() < min || root.getData() > max){
            return false;
        }

        return isBST(root.getLeft(),min, root.getData()) && isBST(root.getRight(),root.getData(),max);
    }

    private static TreeNode readInput(){
        TreeNode root = new TreeNode(45);
        root.setLeft(new TreeNode(23)) ;
        root.setRight(new TreeNode(56));

        root.getLeft().setLeft(new TreeNode(12));
        root.getLeft().setRight(new TreeNode(30));

        root.getRight().setLeft(new TreeNode(55));
        root.getRight().setRight(new TreeNode(65));

        return root;
    }
}
