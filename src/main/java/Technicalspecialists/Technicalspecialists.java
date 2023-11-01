package Technicalspecialists;

public class Technicalspecialists {
    public static void main(String[] args) {
        int programmer = 4; // количество программистов
        int tester = 2; // количество тестировщиков на одного программиста
        int support = 1; // количество специалистов техничесой поддержки на одного прогаммиста
        int totaltesters = programmer * tester; // всего тестировщиков
        int totalsupports = programmer * support;
        int totaltechicalspecialists = programmer + totaltesters + totalsupports;

        System.out.println("Количество программистов " + programmer);
        System.out.println("Количество тестировщиков на одного программиста " + tester);
        System.out.println("Количество специалистов тех поддежки на одного программиста " + support);
        System.out.println("Всего тестировщиков " + totaltesters);
        System.out.println("Всего тех спец технической поддержки " + totalsupports);
        System.out.println("Общее количество тех специалистов на проекте " + totaltechicalspecialists);
    }

}
