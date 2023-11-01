package Cup;

public class Cup {
    public static void main(String[] args) {
        int volume = 200;
        double percent = 33.5;
        double pouredWaterGlass = (volume * percent) / 100;

        System.out.println("В стакане объемом " + volume + " мл.");
        System.out.println("налито " + pouredWaterGlass + " мл., что составляет " + percent + "% от объема стакана");
    }
}
