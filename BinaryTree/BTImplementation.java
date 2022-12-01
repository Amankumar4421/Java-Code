package BinaryTree;

import java.util.*;

public class BTImplementation
{
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    static class BinaryTree {
        static int i = -1;
        public static Node buildTree (int node[]) {
            i++;
            if(node[i] == -1)
                return null;
            
            Node newNode = new Node(node[i]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);
            
            return newNode;
        }
    }
    
    static void preorder(Node root) {
        if(root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    
    static void inorder(Node root) {
        if(root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    
    static void postorder(Node root) {
        if(root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
    
    public static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode == null) {
                System.out.println();
                if(q.isEmpty()) {
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                System.out.print(currNode.data + " ");
                if(currNode.left != null) {
                    q.add(currNode.left);
                }
                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }
    
    static int countNode (Node root) {
        if(root==null)
            return 0;
        return countNode(root.left) + countNode(root.right) + 1;
    }

    static int sumofNode (Node root) {
        if(root==null)
            return 0;
        return sumofNode(root.left) + sumofNode(root.right) + root.data;
    }
    
    static int height (Node root) {
        if(root==null)
            return 0;

        return Math.max(height(root.left), height(root.right)) + 1;
    }


    static int diameter(Node root) {
        if(root == null) {
            return 0;
        }

        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		int node[] = {8,2,3,-1,-1,6,-1,-1,4,-1,-1};
		
		Node root = tree.buildTree(node);
		System.out.println("preorder");
		preorder(root);
		System.out.println();

		System.out.println("inorder");
		inorder(root);
		System.out.println();

		System.out.println("preorder");
		postorder(root);
		System.out.println();

		System.out.println("levelOrder");
		levelOrder(root);
        System.out.println();

        System.out.println("Count of Node : " + countNode(root));
        System.out.println("Sum of Node : " + sumofNode(root));
        System.out.println("Height of the Tree : " + height(root));

        System.out.println("Diameter of Tree : " + diameter(root));
	}
}

