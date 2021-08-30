package pro.sky.java.course1.lesson2;

public class Number4 {
    public static void main(String[] args) {
        int weightLoss1 = 250;
        int weightLoss2 = 500;
        int kg = 1000;
        int needLoseWeight = 7 * kg;
        int daysToLoseWeight1 = needLoseWeight / weightLoss1;
        int daysToLoseWeight2 = needLoseWeight / weightLoss2;
        System.out.println("Дней для похудения в первом случае понадобится " + daysToLoseWeight1);
        System.out.println("Дней для похудения во втором случае понадобится " + daysToLoseWeight2);
        int averageDaysToLoseWeight = (daysToLoseWeight1 + daysToLoseWeight2) / 2;
        System.out.println("В среднем чтобы похудеть нужно " + averageDaysToLoseWeight + " День");
    }
}
