package com.gfg.trees;

import com.gfg.models.TreeNode;
import com.google.common.base.Preconditions;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeService {

    public Multimap<Integer, TreeNode> levelOrderTraversal(TreeNode root) {
        Preconditions.checkNotNull(root);
        Multimap<Integer,TreeNode> levelDataMap = LinkedHashMultimap.create();
        List<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            if(size > 0)
                level++;

            while(size > 0){
                TreeNode value = queue.remove(0);
                levelDataMap.put(level,value);
                if(value.getLeft()!= null)
                    queue.add(value.getLeft());
                if(value.getRight()!=null)
                    queue.add(value.getRight());

                size--;
            }

        }
        return levelDataMap;
    }


}
