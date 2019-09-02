package com.gfg.trees;

import com.gfg.models.TreeNode;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class BinarySearchTreeServiceTest {

    BinarySearchTreeService binarySearchTreeService =  null;
    @BeforeMethod
    public void setup(){
        this.binarySearchTreeService = new BinarySearchTreeService();
    }

    @Test
    public void testGetLCA(){
        TreeNode root = new TreeNode(5);
        root.setLeft(new TreeNode(3));
        root.setRight(new TreeNode(7));
        root.getLeft().setLeft(new TreeNode(1));
        root.getLeft().setRight(new TreeNode(4));
        root.getRight().setLeft(new TreeNode(6));
        root.getRight().setRight(new TreeNode(8));

        TreeNode lca  = binarySearchTreeService.getLCA(root,1,6);
        assertThat(lca.getData()).isEqualTo(5);

        TreeNode lca2  = binarySearchTreeService.getLCA(root,6,3);
        assertThat(lca2.getData()).isEqualTo(5);

        TreeNode lca3  = binarySearchTreeService.getLCA(root,6,8);
        assertThat(lca3.getData()).isEqualTo(7);

        TreeNode lca4  = binarySearchTreeService.getLCA(root,4,1);
        assertThat(lca4.getData()).isEqualTo(3);


    }
}
