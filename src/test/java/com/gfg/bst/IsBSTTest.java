package com.gfg.bst;

import com.gfg.models.TreeNode;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class IsBSTTest {

    @Test
    public void testCase1(){

        TreeNode root = new TreeNode(45);
        root.setLeft(new TreeNode(23)) ;
        root.setRight(new TreeNode(56));

        root.getLeft().setLeft(new TreeNode(12));
        root.getLeft().setRight(new TreeNode(30));

        root.getRight().setLeft(new TreeNode(54));
        root.getRight().setRight(new TreeNode(65));

        assertTrue(IsBST.isBST(root));
    }

    @Test
    public void testCase2(){

        TreeNode root = new TreeNode(45);
        root.setLeft(new TreeNode(23)) ;
        root.setRight(new TreeNode(56));

        root.getLeft().setLeft(new TreeNode(12));
        root.getLeft().setRight(new TreeNode(30));

        root.getRight().setLeft(new TreeNode(58));
        root.getRight().setRight(new TreeNode(65));

        assertFalse(IsBST.isBST(root));
    }
}
