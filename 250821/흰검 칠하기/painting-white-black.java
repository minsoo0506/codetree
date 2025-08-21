import java.util.*;

class Tile {
    int white;
    int black;
    String result;
    
    public Tile() {
        this.white = 0;
        this.black = 0;
    }

    public void addWhite() {
        this.white++;
        this.result = "white";

        if(white >= 2 && black >= 2) {
            this.result = "grey";
        }
    }

    public void addBlack() {
        this.black++;
        this.result = "black";

        if(white >= 2 && black >= 2) {
            this.result = "grey";
        }
    }

    public String getResult() {
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Tile> tiles = new HashMap<>();
        int index = 0;

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if(d == 'R') {
                for(int j = 0; j < x; j++){
                    int pos = index + j;
                    Tile tile = tiles.getOrDefault(pos, new Tile());
                    tile.addBlack();
                    tiles.put(pos, tile);
                }

                index = index + (x - 1);
            }
            else {
                for(int j = 0; j < x; j++){
                    int pos = index - j;
                    Tile tile = tiles.getOrDefault(pos, new Tile());
                    tile.addWhite();
                    tiles.put(pos, tile);
                }

                index = index - (x - 1);
            }
        }

        int whiteCount = 0;
        int blackCount = 0;
        int greyCount = 0;

        for(Integer key: tiles.keySet()){
            String result = tiles.get(key).getResult();

            if(result.equals("white")) whiteCount++;
            else if(result.equals("black")) blackCount++;
            else greyCount++;
        }

        System.out.println(whiteCount + " " + blackCount + " " + greyCount);
    }
}