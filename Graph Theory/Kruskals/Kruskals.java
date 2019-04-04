 import java.util.*;
 import java.io.*;
    public class Kruskals{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static int[] p; // create parent array
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), m = readInt(), cnt = 0, mst = 0; Edge e[] = new Edge[m]; p = new int[n + 1]; 
    	  for(int i = 0; i < p.length; i++) p[i] = i; // initialize the parent array for disjoint set
        
    	  for(int i = 0; i < m; i++) {
          e[i] = new Edge(readInt(), readInt(), readInt()); // get values,
        } 
        Arrays.sort(e); // sort the edges according to weight
    	  for(int i =0; i < m; i++) {
    		  int u = e[i].u, v = e[i].v, w = e[i].w;
    		  if(cnt == n - 1) break; // if we visited every edge, break
    		  int fu = Find(u), fv = Find(v); // find the parents of u and v
    		  if(fu != fv) { // if the nodes are not connected           
                      p[fu] = fv; // set the parent of fu to fv              
                      cnt++; // add one to number of visited edges
                      mst += w; // add the weight to the mst
                  }
    	  }
    	  pw.println(mst); // print mst
        pw.close();
      }
      static int Find(int d) { // create method find for disjoint set
    	  if(d != p[d])  // path compression
          p[d] = Find(p[d]); 
        return p[d];
      }
      static class Edge implements Comparable<Edge>{
    	  int u, v, w; 
        public Edge(int u, int v, int w) {
          this.u = u; 
          this.v = v; 
          this.w = w;
        }
    	  public int compareTo(Edge x) { // override method to allow java to sort this object
          return Integer.compare(w,  x.w);
        }
      }
      static String next () throws IOException {
    	  while (st == null || !st.hasMoreTokens())
    		  st = new StringTokenizer(br.readLine().trim());
    	  return st.nextToken();
      }
      
      static long readLong () throws IOException {
    	  return Long.parseLong(next());
      }

      static int readInt () throws IOException {
    	  return Integer.parseInt(next());
      }

      static double readDouble () throws IOException {
    	  return Double.parseDouble(next());
      }
      
      static String readLine () throws IOException {
    	  return br.readLine().trim();
      } 
  }
