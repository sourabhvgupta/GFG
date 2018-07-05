package com.gfg.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }


}
