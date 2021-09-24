package pro.sky.java.course1.lesson6;

public class Number5 {
    public static void main(String[] args) {
        String fullName = "Ivanov Ivan Ivanovich";
        int spaceIndex1 = fullName.indexOf(' ');
        int spaceIndex2 = fullName.lastIndexOf(' ');
        String lastName = fullName.substring(0, spaceIndex1);
        System.out.println("Фамилия сотрудника – " + lastName);

        String firstName = fullName.substring(spaceIndex1 + 1, spaceIndex2);
        System.out.println("Имя сотрудника – " + firstName);

        String middleName = fullName.substring(spaceIndex2 + 1);
        System.out.println("Отчество сотрудника – " + middleName);
    }
}
