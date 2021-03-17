package com.my.blog.website;

import java.io.BufferedInputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            this.val = x;
        }
    }

    class ListNode{
        int val;
        ListNode next;
        public ListNode(){}
        public ListNode(int x){
            this.val = x;
        }
    }
    int res;
    Map<Integer,Integer> left;
    public int widthOfBinaryTree(TreeNode root) {
        res = 0;
        left = new HashMap<>();
        dfs(root,0,0);
        return res;
    }

    public void dfs(TreeNode root,int depth,int pos){
        if (root == null){
            return;
        }
        left.computeIfAbsent(depth , x -> pos);
        res = Math.max(res,pos - left.get(depth) + 1);
        dfs(root.left, depth+1, 2*pos);
        dfs(root.right,depth+1,2*pos+1);
    }
}
