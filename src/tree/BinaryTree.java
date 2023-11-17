package tree;

import stack.linked_base.StackNode;

import java.util.Stack;

public class BinaryTree <Type> {
    private TreeNode root;
    private int size;
    // number on edges from root to note (x)
    private int depth;


    BinaryTree(){
        createTree();
    }

    private void createTree(){
        this.root = null;
        this.size = 0;
        this.depth = 0;
    }

    public Boolean treeEmpty(){
        return this.root == null;
    }

    public boolean treeFull(){
        return false;
    }


    public void traverstTree(){
        inorderRecurcive(this.root);
    }

    public void inorderRecurcive(TreeNode node){
        if (node != null){
            // First recur on left child
            inorderRecurcive(node.left);
            // Then print the data of node
            System.out.print(node.data + " ");
            // Now recur on right child
            inorderRecurcive(node.right);
        }
    }

    public void inorderIteratively(TreeNode node){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = this.root;
        if (node != null) {
            // if current not null continue go left || stack size > 0 this mean
            while (current != null || stack.size() > 0) {
                // if curr in not null this mean that left tree have item not checked
                while (current != null) {
                    // Place pointer to a tree node on
                    // the stack before traversing
                    // the node's left subtree
                    stack.push(current);
                    current = current.left;
                }
                // Current must be NULL at this point
                //if Current is null at the end leave of left sub tree
                // pop last node in left
                // to retuen to last node
                current = stack.pop();
                System.out.print(current.data + " ");

                // we have visited the node and its
                // left subtree. Now, it's right
                // subtree's turn
                current = current.right;
            }
        }

    }

    public void clearRec(TreeNode node){
        if (node != null){
            clearRec(node.left);
            clearRec(node.right);
            free(node);
        }
    }

    public void clearRecAux(TreeNode node){
        clearRec(node);
        this.root = null;
    }



     void free(TreeNode node){
        node = null;
        System.gc();
    }

}




