public class Main {
    public static void main(String[] args) {
        printYear(2021);
        applicationSelection(0, 2018);
        calculationDeliveryDays(70);
    }
    public static void printYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным ");
        } else {
            System.out.println(year + " год неявляется високосным ");
        }
    }

    public static void applicationSelection(int os, int year) {
        int currentYear = 2023;
        if (os == 0 && currentYear > year) {
            System.out.println(" Установите облегченную версию приложения для iOS по ссылке ");
        } else if (os == 0 && currentYear <= year) {
            System.out.println(" Установите обычную версию приложения для iOS по ссылке ");
        }
        if (os == 1 && currentYear > year) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке ");
        } else if (os == 1 && currentYear <= year) {
            System.out.println(" Установите обычную версию приложения для Android по ссылке ");
        }
    }

    public static void calculationDeliveryDays(int deliveryDistance) {
        if (deliveryDistance > 100) {
            System.out.println(" Доставки нет ");
            return;
        }
        int deliveryDay = 1;
        if (deliveryDistance > 20) {
            deliveryDay++;
            System.out.println(" Потребуется дней: " + deliveryDay);
        }
        if (deliveryDistance > 60) {
            deliveryDay++;
            System.out.println(" Потребуется дней: " + deliveryDay);
        }

        }
    }





