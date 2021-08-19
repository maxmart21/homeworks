package pro.sky.java.course1.lesson1;

public class Number3 {
    public static void main(String[] args) {
        short bananaWeight = 80;
        short milkWeight = 105;
        short iceCreamWeight = 100;
        short rawEggWeight = 70;
        int allBananasWeight = bananaWeight * 5;
        int allMilkWeight = milkWeight * 2;
        int allIceCreamWeight = iceCreamWeight * 2;
        int allRawEggsWeight = rawEggWeight * 4;
        int breakfastWeight = allBananasWeight + allMilkWeight + allIceCreamWeight + allRawEggsWeight;
        float kg = 1000f;
        float finalWeight = breakfastWeight / kg;
        System.out.println("Общий вес продуктов " + finalWeight + " кг");

    }

}
