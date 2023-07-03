public class Metods {
    public static void main(String[] args) {

        task1();
        task2();


    }
    static public void task1() {
        /**
         *Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным, и выводит результат в консоль.
         */
        System.out.println("Задача 1");

        private static void isLeapYear (int year) {
            if (year % 4 != 0 || (year % 400 == 0) && year % 100 != 0) {
                System.out.println(year + "год является високосным");
            } else {
                System.out.println(year + "год не является високосным");
            }
        }


        System.out.println( );
    }
    public static void task2() {
        /**
         *Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.
         * Если устройство старше текущего года, предложите ему установить облегченную версию.
         * Текущий год можно получить таким способом:
         * int currentYear = LocalDate.now().getYear();
         * Или самим задать значение вручную — ввести в переменную числовое значение.
         * В результате программа должна выводить в консоль сообщение, какую версию приложения (обычную или облегченную) и для какой ОС (Android или iOS) установить пользователю.
         */
        System.out.println("Задача 2");

        private static void OS (int currentYear = LocalDate.now().getYear();) {
            if (LocalDate == 0 && getYear == 2023) {
                System.out.println("установите версию приложения для iOS");
            } if else (LocalDate == 1 && getYear == 2023) {
                System.out.println("установите версию приложения для Android"); {
                    if else (LocalDate == 0 && getYear < 2023)
                    System.out.println("установите облегченную версию приложения для iOS");
                } if else (LocalDate == 1 && getYear < 2023)
                System.out.println("установите облегченную версию приложения для Android");
            }
        }

        System.out.println( );
    }

}