package ua.pp.voronin.serhii.task;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.List.of;

public class CompleteMethods {

    public static void main(String[] args) {
        getUniqueMeasurableItems (List.of(new Apple(), new WaterMelon(), new Tomato())); // 1
        getUniqueMeasurableItems(of(new Coin(), new Toy(), new Chair())); // 2
        getUniqueMeasurableItems(of(new Water(), new Juice(), new Oil())); // 3
        var packedBeverages  = getUniqueMeasurableItems(of(new CanOfCoke(), new BottleOfJuice())); // 4
    }

    public static <T> Set<T> getUniqueMeasurableItems(List<T> list) {
        return new HashSet<T>(list);
    }

    private interface MeasuredInKilograms<T1> {

    }

    private static class Apple<T1> implements MeasuredInKilograms<T1> {}
    private static class WaterMelon <T1>implements MeasuredInKilograms <T1>{}
    private static class Tomato<T1> implements MeasuredInKilograms <T1>{}

    private interface Countable<T2> {}

    private static class Coin<T2> implements Countable <T2>{}
    private static class Toy<T2> implements Countable<T2> {}
    private static class Chair<T2> implements Countable <T2>{}

    private interface MeasuredInLiters<T3> {

    }

    private static class Water <T3>implements MeasuredInLiters <T3>{}
    private static class Juice<T3> implements MeasuredInLiters <T3>{}
    private static class Oil <T3>implements MeasuredInLiters <T3>{}

    private static class CanOfCoke<T4> implements Countable, MeasuredInLiters {}
    private static class BottleOfJuice<T5> implements Countable, MeasuredInLiters {}
}
