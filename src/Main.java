public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {            // Compounding multiple Strings into a new String
        String firstName = "Sergey";
        String middleName = "Yakovlevich";
        String lastName = "Sudanov";
        char s = ' ';

        String fullName = lastName + s + firstName + s + middleName;

        System.out.println("Ф. И. О. сотрудника — " + fullName);
    }

    public static void task2() {            // Upper-case conversion of a String
        String fullName = "Valeriy Urievich Stoyanov";

        String fullNameRegister = fullName.toUpperCase();

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameRegister);
    }

    public static void task3() {            // Replacement of specified characters in a String
        String fullName = "Потёмкин Артём Михайлович";

        String fullNameSimple = fullName.replace('ё', 'е');

        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameSimple);
    }
}