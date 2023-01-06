public class Main {
    public static void main(String[] args) {

        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите приложение для Android по ссылке");
        }

        int clientOS2 = 1;
        int clientDeviceYear = 2015;
        if (clientOS2 == 0) {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите  версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS2 == 1) {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите  версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }

        }
        int year = 1990;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "является високостным");
        }else {
            System.out.println(year + "является високостным");
        }

        int distance = 200;
        int deliveryDays = 0;
        if (distance < 20 ) {
            deliveryDays = 1;
        } else if (distance <60) {
            deliveryDays = 2;
        } else if (distance < 100) {
            deliveryDays = 3;
        }
        if (deliveryDays == 0) {
            System.out.println("Доставка не осуществляеться");
        } else {
            System.out.println("Потребуеться дней" + deliveryDays);
        }
        int month = 9;
        switch(month) {
            case  12:
            case  1:
            case  2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Нет такого месяца");

        }
    }
    }


