import java.util.Scanner;
import java.util.Arrays;

class Weather implements Comparable<Weather>{
    String date;
    String day;
    String weather;

    public Weather(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }

    public String getDate() {
        return date;
    }

    public String getWeather() {
        return weather;
    }

    public void print() {
        System.out.println(date + " " + day + " " + weather);
    }

    @Override
    public int compareTo(Weather o){
        int res = this.getDate().compareTo(o.getDate());

        if(res == 0) {
            if(weather.equals("Rain")) {
                res = -1;
            }
            else {
                res = 1;
            }
        }

        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Weather[] infos = new Weather[n];
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            // Please write your code here.
            infos[i] = new Weather(date, day, weather);
        }

        Arrays.sort(infos);

        for(int i = 0; i < n; i++){
            if(infos[i].getWeather().equals("Rain")){
                infos[i].print();
                break;
            }
        }
    }
}