import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int v, int e) 
    {
        // Write your code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();                   
        for(int i=0; i<v; i++)
        {         
            adj.add(new ArrayList<>());     
        }                
        for(int i=0; i<edges.size();i++)
        {      
         adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));    
        }              
       int[] indegree = new int[v];               
       for(int i=0; i<v; i++){  
          for(Integer it : adj.get(i)){  
              indegree[it]++;   
         }  
      }    
      Queue<Integer> q = new LinkedList<>();       
      ArrayList<Integer> res = new ArrayList<>();              
          for(int i=0; i<v; i++)
          {                       
              if(indegree[i]==0){             
                  q.add(i);        
          }      
         }       
                 while(!q.isEmpty())
                 {     
                 Integer node = q.poll();      
                 res.add(node);                 
                 for(Integer n : adj.get(node)){                                                                        
                     indegree[n]--;     
                 if(indegree[n]==0){       
                  q.add(n);     

               }   

             }      

          }   

     return res;   

    }
}
