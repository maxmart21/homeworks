package pro.sky.java.course1.lesson6;

public class Number5 {
    public static void main(String[] args) {
        String fullName = "Ivanov-Ivan-Ivanovich";
        int lastNameIndex = fullName.indexOf("Ivanov");
        int lastNameLastIndex = fullName.lastIndexOf("Ivanov");
        String lastName = fullName.substring(lastNameIndex, lastNameLastIndex - 6);
        System.out.println("Фамилия сотрудника – " + lastName);
        int firstNameIndex = fullName.indexOf("Ivan", 6);
        int firstNameLastIndex = fullName.lastIndexOf("Ivan");
        String firstName = fullName.substring(firstNameIndex, firstNameLastIndex - 1);
        System.out.println("Имя сотрудника – " + firstName);
        int middleNameIndex = fullName.indexOf("Ivanovich", 11);
        int middleNameLastIndex = fullName.lastIndexOf("");
        String middleName = fullName.substring(middleNameIndex, middleNameLastIndex);
        System.out.println("Отчество сотрудника – " + middleName);
    }
}
