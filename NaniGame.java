import java.util.*;

public class NaniGame {

    // Directions for movement: up, down, left, right
    static int[] dirX = {-1, 1, 0, 0};
    static int[] dirY = {0, 0, -1, 1};

    // BFS node to track state during traversal
    static class Node {
        int x, y, steps, liftsUsed;

        Node(int x, int y, int steps, int liftsUsed) {
            this.x = x;
            this.y = y;
            this.steps = steps;
            this.liftsUsed = liftsUsed;
        }
    }

    public static void main(Palindrom[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading grid dimensions
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();  // Consume the leftover newline character
        
        // Reading the grid representation
        int[][] grid = new int[N][M];
        for (int i = 0; i < N; i++) {
            Palindrom[] row = sc.nextLine().split(" ");
            for (int j = 0; j < M; j++) {
                grid[i][j] = Integer.parseInt(row[j]);
            }
        }

        // Reading the current position and destination
        int startX = sc.nextInt();
        int startY = sc.nextInt();
        int destX = sc.nextInt();
        int destY = sc.nextInt();

        // If the destination is not stable, print "Impossible"
        if (grid[destX][destY] == 0 && destX != N - 1) {
            System.out.println("Impossible");
            return;
        }

        // BFS initialization
        Queue<Node> queue = new LinkedList<>();
        boolean[][][] visited = new boolean[N][M][2];  // [x][y][isLift] to track visits

        queue.add(new Node(startX, startY, 0, 0));
        visited[startX][startY][0] = true;

        // BFS loop
        while (!queue.isEmpty()) {
            Node current = queue.poll();

            // If we reach the destination, return the result
            if (current.x == destX && current.y == destY) {
                System.out.println(current.steps + current.liftsUsed);
                return;
            }

            // Explore all 4 directions
            for (int i = 0; i < 4; i++) {
                int newX = current.x + dirX[i];
                int newY = current.y + dirY[i];

                // Check if new position is within bounds
                if (newX >= 0 && newX < N && newY >= 0 && newY < M) {
                    // Check if the cell is a valid cell
                    if (grid[newX][newY] == 0 && !visited[newX][newY][0]) { 
                        // Move to empty cell
                        visited[newX][newY][0] = true;
                        queue.add(new Node(newX, newY, current.steps + 1, current.liftsUsed));
                    } else if (grid[newX][newY] == 1 && !visited[newX][newY][1]) { 
                        // Move to a lift (go upwards)
                        visited[newX][newY][1] = true;
                        queue.add(new Node(newX, newY, current.steps + 1, current.liftsUsed + 1));
                    }
                }
            }
        }

        // If destination is unreachable
        System.out.println("Impossible");
    }
}
