package Universe;

public class Universe {
    public static void main(String[] args) {
        long ageUniverse = Long.parseLong("13000000000");
        int agePerson = 100000;
        int ageDifference = (int) (ageUniverse / agePerson);

        System.out.println("Вселенная в " + ageDifference + " раз старше человечества");
    }
}