import java.util.*;
public class BFS {
    static int move[][] = {{0,1}, {1,0}, {-1,0}, {0,-1}};
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char g[][] = new char[n][n];
        for(int i = 0; i < n; i++) g[i] = sc.next().toCharArray();
        
        Point start = new Point(sc.nextInt(), sc.nextInt());
        Point end = new Point(sc.nextInt(), sc.nextInt());
        System.out.println(bfs(start, end, g, n));
        sc.close();
    }
    static int bfs(Point start, Point end, char g[][], int n) {
        LinkedList<Point> q = new LinkedList<Point>();
        boolean vis[][] = new boolean[n][n];
        int dist[][] = new int[n][n];
        q.add(start);
        while(!q.isEmpty()) {
            Point cur = q.poll();
            for(int i = 0; i < 4; i++) {
                int nx = cur.x + move[i][0], cur.y + move[i][1];
                if(nx < 0 || ny < 0 || nx >= n || ny >= n || vis[nx][ny] || g[nx][ny] == 1) continue;
                dist[nx][ny] = dist[cur.x][cur.y] + 1;
                if(nx == end.x && ny == end.y) return dist[nx][ny];
                q.add(new Point(nx, ny);
            }
        }
        return -1;
    }
    static class Point {
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
