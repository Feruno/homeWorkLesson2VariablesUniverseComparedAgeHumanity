package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        final long ageUniverseYears = 13000000000l;
        System.out.println("Возраст Вселенной в годах :" + ageUniverseYears);

        final int ageHumanityView = 100000;
        System.out.println("Возраст человека, как вида :" + ageHumanityView);

        long universeOlderThanHumans = ageUniverseYears / ageHumanityView;
        System.out.println("Вселенная старше людей в " + universeOlderThanHumans + " раз");
    }
}
