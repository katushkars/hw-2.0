public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Task 1");
        determineYear(2022);

        System.out.println("Task 2");

        int[] device = {2023, 0};
        enterDevice(device);
        int delivery = delivery(300);

        System.out.println("Потребуется дней: " + delivery + " день срок доставки");

    }

    public static void determineYear(int year) {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + "- високосный год!");
        } else {
            System.out.println(year + "- не является високосным годом!");

        }
    }

    public static void enterDevice(int[] device) {
        if (device[0] >= 2022 && device[1] == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (device[0] >= 2022 && device[1] == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (device[0] < 2022 && device[1] == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (device[0] < 2022 && device[1] == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }

    public static int delivery(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else {
            return deliveryDistance / 40 + 1;
        }
    }
}