class Solution {
    public Node connect(Node root) {
        if(root == null)
            return null;
        Queue<Node> q = new LinkedList<>();
        q.add(root); 
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Node curr = q.poll();
                if(i != size-1){
                    Node nextNode = q.peek();
                    curr.next = nextNode;
                }
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
        return root;
    }
}


//Time Complexity : O(N)
//Space Complexity : O(N/2)