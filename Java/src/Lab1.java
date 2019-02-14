//Іванов А.В. КН-2-1 (10 варіант)
//1. Створити просту Java-програму, що запитує в користувача ім’я, вітається з ним, питає його вік та виводить рік народження. Вказівка: виконати усі пункти створення програми, описані в теоретичних відомостях.
//2. 10.Швидкість першого автомобіля V1 км/год, другого - V2 км/год (V1 > V2),  відстань між ними S км. Визначити відстань між ними через T годин, якщо рухаються в одному напрямку
import java.util.Scanner;

public class Lab1 {
    public static void main (String[] args) {
            System.out.println("Як вас звати?");
            Scanner scan = new Scanner(System.in);
            String name = scan.nextLine();
            System.out.println("Скльки вам років?");
            int age = scan.nextInt();
            System.out.println("Вітаю!" + "Вас звати " +name +". Вам " +age +" років");

            System.out.println("Введіть швидкість першого автомобіля: ");
            int speed_1 = scan.nextInt();
            System.out.println("Введіть швидкість другого автомобіля: ");
            int speed_2 = scan.nextInt();
            System.out.println("Введіть час (в хвилинах):");
            int time = scan.nextInt();
            int way1,way2,result;
            way1 = speed_1*time;
            way2 = speed_2*time;
            result = way1-way2;
            System.out.println("Відстань між автомобілями становить:" +result +" км.");
    }
}
