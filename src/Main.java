public class Main {
    public static void main(String[] args) {

        //1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Petrov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
        System.out.println(" ");

        //2
        String upperCaseName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperCaseName);
        System.out.println(" ");

        //3
        String semyonSemyonich = "Иванов Семен Семёнович";
        String correctLetters = semyonSemyonich.replace("ё", "е");
        correctLetters = correctLetters.replace("Ё", "Е");
        System.out.println("Данные ФИО сотрудника — " + correctLetters);
    }
}