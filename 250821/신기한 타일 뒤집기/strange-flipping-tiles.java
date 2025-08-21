import java.util.*;

class Tile {
    // -1 이면 흰색, 0이면 회색, 1이면 검은색
    int result;

    public Tile() {
        result = 0;
    }

    public void moveLeft() {
        result = -1;
    }

    public void moveRight() {
        result = 1;
    }

    public int getResult() {
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Tile> tiles = new HashMap<>();
        int index = 0;

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if(d == 'R') {
                for(int j = 0; j < x; j++){
                    int pos = index + j;
                    Tile tile = tiles.getOrDefault(pos, new Tile());
                    tile.moveRight();
                    tiles.put(pos, tile);
                }

                index = index + (x - 1);
            }
            else {
                for(int j = 0; j < x; j++){
                    int pos = index - j;
                    Tile tile = tiles.getOrDefault(pos, new Tile());
                    tile.moveLeft();
                    tiles.put(pos, tile);
                }

                index = index - (x - 1);
            }
        }

        int whiteCount = 0;
        int blackCount = 0;
        for(Integer key: tiles.keySet()){
            int result = tiles.get(key).getResult();

            if(result == -1) whiteCount++;
            if(result == 1) blackCount++;
        }

        System.out.println(whiteCount + " " + blackCount);
    }
}