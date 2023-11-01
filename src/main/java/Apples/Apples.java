package Apples;

public class Apples {
    public static void main(String[] args) {
        int applespin = 45; // Количество яблок у Буратино
        int appleskar = 26; // Количество яблок Карабас Барабас отобрал у Буратино
        int remainsapplespin = applespin - appleskar; // Остаток у Буратино

        System.out.println("Количество яблок у бураимно " + applespin);
        System.out.println("Карабас Барабас отобрал " + appleskar + " яблок");
        System.out.println("У Буратино осталось " + remainsapplespin + " яблок");
    }
}
