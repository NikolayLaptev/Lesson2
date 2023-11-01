package Mortgage;

public class Mortgage {
    public static void main(String[] args) {
        int costApartment = 5000000;
        double contributionPercentage = 25;
        double contributionAmount = (costApartment * contributionPercentage) / 100;

        System.out.println("Первоначальный взнос от стоимости квартиры в " + costApartment + " рублей");
        System.out.println("в размере " + contributionPercentage + "% состаляет " + contributionAmount + " рублей");
    }
}
