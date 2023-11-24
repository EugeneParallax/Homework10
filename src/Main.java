public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {            // Compounding multiple Strings into a new String
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        char s = ' ';

        String fullName = firstName + s + middleName + s + lastName;

        System.out.println("Ф. И. О. сотрудника — " + fullName);
    }

    public static void task2() {            // Upper-case conversion of a String
        String fullName = "Ivan Ivanovich Ivanov";

        String fullNameRegister = fullName.toUpperCase();

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameRegister);
    }

    public static void task3() {            // Replacement of specified characters in a String
        String fullName = "Иванов Семён Семёнович";

        String fullNameSimple = fullName.replace('ё', 'е');

        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameSimple);
    }
}