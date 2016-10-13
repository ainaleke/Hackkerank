//https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree
/*
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   public int height(Node root)
    {
         //int lef
         if(root==null)
         {
           return 0;             
         }
         else{
            int leftSide=height(root.left)+1; 
            int rightSide=height(root.right)+1;
            int x=leftSide>rightSide?leftSide:rightSide;
            return x;
         }
         
    }
