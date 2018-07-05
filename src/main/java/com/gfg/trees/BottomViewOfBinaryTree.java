package com.gfg.trees;

import com.gfg.models.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class BottomViewOfBinaryTree {

    public static void main(String[] args){

    }

    public static void bottomView(TreeNode root){

        Map<Integer,Integer> verticalDistanceLastTreeNodeDataMap= new HashMap<Integer,Integer>();

        bottomViewUtils(root,verticalDistanceLastTreeNodeDataMap,0);

        for(Map.Entry<Integer,Integer> entry:verticalDistanceLastTreeNodeDataMap.entrySet()){
            System.out.print("Key: "+entry.getKey()+" Value: "+entry.getValue());
            System.out.println("");
        }
    }

    private static void bottomViewUtils(TreeNode root,Map<Integer,Integer> verticalDistanceLastTreeNodeDataMap,int hd) {
        if(root==null)
            return;

        verticalDistanceLastTreeNodeDataMap.put(hd,root.getData());

        bottomViewUtils(root.getLeft(),verticalDistanceLastTreeNodeDataMap,hd-1);
        bottomViewUtils(root.getRight(),verticalDistanceLastTreeNodeDataMap,hd+1);
    }
}
