package pro.sky.java.course1.lesson6;

public class Number4 {
    public static void main(String[] args) {
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника – " + fullName);
    }
}

