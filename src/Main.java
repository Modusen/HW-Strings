import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Задание №1 + №2:");
        System.out.println("Введите Имя:");
        String firstName = reader.readLine();
        System.out.println("Введите Отчество:");
        String secondName = reader.readLine();
        System.out.println("Введите Фамилию:");
        String lastName = reader.readLine();
        String fullName = firstName + " " + secondName + " " + lastName;

        //1st task
        System.out.println("ФИО сотрудника — " + fullName);
        //2nd task
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        //3rd task
        System.out.println("Данные ФИО сотрудника  — " + fullName.replace(('ё'), ('е')));

    }
}