package graphdfs;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GraphDFS {
  static class Node{
	int data;
	boolean visited;
	List<Node> neighbours;
 
	Node(int key){
           data=key;visited=false;
           neighbours=new ArrayList();
        }
        public void addNeighbours(Node nNode){
           neighbours.add(nNode);
	}
	public List<Node> getNeighbours() {
           return neighbours;
	}
   }
    // Recursive DFS
    public static void dfsR(Node nodeA){
	System.out.print(nodeA.data + " ");
	List<Node> neighbour=nodeA.getNeighbours();
        nodeA.visited=true;
	for(int i = 0; i < neighbour.size(); i++) {
            Node nodeB=neighbour.get(i);
            if(nodeB!=null && !nodeB.visited)
		dfsR(nodeB);
	}
    }
    // Iterative DFS using stack
    public static void dfs(Node nodeA){
	Stack<Node> S=new Stack();
	S.add(nodeA);
        while (!S.isEmpty()){  
          Node element=S.pop();
	  if(!element.visited){
            System.out.print(element.data + " ");
            element.visited=true;
          }  
          List<Node> neighbour=element.getNeighbours();
     	  for(int i = 0; i < neighbour.size(); i++) {
            Node nodeB=neighbour.get(i);
	    if(nodeB!=null && !nodeB.visited)
                S.add(nodeB);	
          }
     	}
    }
     public static void main(String[] args) {
        Node node40 =new Node(40);
	Node node10 =new Node(10);
	Node node20 =new Node(20);
	Node node30 =new Node(30);
	Node node60 =new Node(60);
	Node node50 =new Node(50);
	Node node70 =new Node(70);
 
	node40.addNeighbours(node10);
	node40.addNeighbours(node20);
	node10.addNeighbours(node30);
	node20.addNeighbours(node10);
	node20.addNeighbours(node30);
	node20.addNeighbours(node60);
	node20.addNeighbours(node50);
	node30.addNeighbours(node60);
	node60.addNeighbours(node70);
	node50.addNeighbours(node70);
	System.out.println("The DFS traversal of the graph using stack ");
	dfs(node40);
        System.out.println();
 
	// Resetting the visited flag for nodes
	node40.visited=false;
	node10.visited=false;
	node20.visited=false;
	node30.visited=false;
	node60.visited=false;
	node50.visited=false;
	node70.visited=false;
 
	System.out.println("The DFS traversal of the graph using recursion ");
	dfsR(node40); 
        System.out.println();
    }
    
}
