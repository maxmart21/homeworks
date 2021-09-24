package pro.sky.java.course1.lesson6;

public class Number6 {
    public static void main(String[] args) {
        String fullName = "ivanov ivan ivanovich";
        String[] words = fullName.split(" ");
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);

            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            words[i] = sb.toString();

        }
        System.out.println("Верное написание ФИО сотрудника с заглавных букв – " + String.join(" ", words));
    }
}
