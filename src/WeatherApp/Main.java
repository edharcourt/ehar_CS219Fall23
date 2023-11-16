package WeatherApp;

public class Main {
    public static void main(String[] args) {
        ZipcodeDB db = new ZipcodeDB();
        System.out.println(db.findByZip("13617"));
        System.out.println(
            db.getCurrentTemp(db.findByZip("10001")));
    }
}
