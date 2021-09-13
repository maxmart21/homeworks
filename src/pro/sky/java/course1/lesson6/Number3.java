package pro.sky.java.course1.lesson6;

public class Number3 {
    public static void main(String[] args) {
        String fullName = "Ivanov Ivan Ivanovich";
        fullName = fullName.replace(" ", ";");
        System.out.println("Данные ФИО сотрудника для административного отдела – " + fullName);
    }
}
