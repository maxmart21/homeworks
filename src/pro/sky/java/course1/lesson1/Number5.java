package pro.sky.java.course1.lesson1;

public class Number5 {
    public static void main(String[] args) {
        int MashaSalary = 67760;
        int DenisSalary = 83690;
        int KrisSalary = 76230;
        float raise = 0.1f;
        float MashaSalaryNow = MashaSalary + MashaSalary * raise;
        float DenisSalaryNow = DenisSalary + DenisSalary * raise;
        float KrisSalaryNow = KrisSalary + KrisSalary * raise;
        int monthsInYear = 12;
        int MashaAnnualIncome = MashaSalary * monthsInYear;
        int DenisAnnualIncome = DenisSalary * monthsInYear;
        int KrisAnnualIncome = KrisSalary * monthsInYear;
        float MashaAnnualIncomeNow = MashaSalaryNow * monthsInYear;
        float DenisAnnualIncomeNow = DenisSalaryNow * monthsInYear;
        float KrisAnnualIncomeNow = KrisSalaryNow * monthsInYear;
        float MashaDifferAnnualIncome = MashaAnnualIncomeNow - MashaAnnualIncome;
        float DenisDifferAnnualIncome = DenisAnnualIncomeNow - DenisAnnualIncome;
        float KrisDifferAnnualIncome = KrisAnnualIncomeNow - KrisAnnualIncome;
        System.out.println("Маша теперь получает " + MashaSalaryNow + " руб." + " Годовой доход вырос на " + MashaDifferAnnualIncome + " руб.");
        System.out.println("Денис теперь получает " + DenisSalaryNow + " руб." + " Годовой доход вырос на " + DenisDifferAnnualIncome + " руб.");
        System.out.println("Кристина теперь получает " + KrisSalaryNow + " руб." + " Годовой доход вырос на " + KrisDifferAnnualIncome + " руб.");
    }
}
