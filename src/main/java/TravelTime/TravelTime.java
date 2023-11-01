package TravelTime;

public class TravelTime {
    public static void main(String[] args) {
        int distance = 30; // расстояние от дома до офиса
        float speed = 34; // средняя скорость такси
        float time = (distance / speed) * 60; // время за которое тестировщик добирается от дома до офиса мин.
        double ratio = 1.45; // коэффициент замедления
        float timeEvening = (float) (time * ratio); // обратно домой вечером

        System.out.println("расстояние от дома до офиса в " + distance + " км.");
        System.out.println("тестировщик преодолевает за " + time + " минут");
        System.out.println("вечером домой из офиса за " + timeEvening + " минут");
    }
}
