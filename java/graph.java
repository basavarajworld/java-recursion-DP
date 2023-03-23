import java.util.*;
public class graph {
   static class Edge{
        int src;
       int dist;
    
   
    public Edge(int s,int d){
        this.src=s;
        this.dist=d;
    }}
    public static void creategraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,3));
        graph[1].add(new Edge(1,2));
        graph[2].add(new Edge(2,1));
        graph[3].add(new Edge(3,2));
    }
    public static void bfs(ArrayList<Edge> graph[],int v,boolean vis[]){
        Queue<Integer> q=new LinkedList<>();
       
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(vis[curr]==false){
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dist);
                }
            }

        }
    }
    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(vis[e.dist]!=true){
                dfs(graph,e.dist,vis);
            }
        }

    }
    public static void main(String args[]){
        int v=4;
        ArrayList<Edge> graph[]=new ArrayList[v];
        boolean vis[]=new boolean[v];
        creategraph(graph);
        // bfs(graph,v,vis);
        dfs(graph,0,vis);

    }
}
