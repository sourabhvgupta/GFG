package com.gfg.trees;

import com.gfg.models.TreeNode;
import com.google.common.collect.Multimap;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;

import static org.fest.assertions.api.Assertions.assertThat;


public class BinaryTreeServiceTest {

    BinaryTreeService binaryTreeService;

    @BeforeMethod
    public void setup(){
        this.binaryTreeService = new BinaryTreeService();
    }

    @Test
    public void testLevelOrderTraversal(){

        TreeNode root = new TreeNode(5);
        root.setLeft(new TreeNode(4));
        root.setRight(new TreeNode(9));
        root.getLeft().setLeft(new TreeNode(8));
        root.getRight().setRight(new TreeNode(6));
        root.getLeft().getLeft().setLeft(new TreeNode(13));

        Multimap<Integer, TreeNode> levelOrderTraversal = binaryTreeService.levelOrderTraversal(root);
        assertThat(levelOrderTraversal.get(1).iterator().next().getData()).isEqualTo(5);

        Iterator<TreeNode> iterator2 =  levelOrderTraversal.get(2).iterator();
        assertThat(iterator2.next().getData()).isEqualTo(4);
        assertThat(iterator2.next().getData()).isEqualTo(9);

        Iterator<TreeNode> iterator3 = levelOrderTraversal.get(3).iterator();
        assertThat(iterator3.next().getData()).isEqualTo(8);
        assertThat(iterator3.next().getData()).isEqualTo(6);

        assertThat(levelOrderTraversal.get(4).iterator().next().getData()).isEqualTo(13);
    }

}
