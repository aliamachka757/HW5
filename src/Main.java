import java.nio.file.FileSystemNotFoundException;

public class Main {
    public static void main(String[] args) {
        ///Problem1
        System.out.println("Problem 1");

        int clientOs = 0;
        if (clientOs <= 0) {

            System.out.println(" Установите версию приложения для iOS по ссылке");
        } else if (clientOs >= 0) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        }

        ////Problem2///
        System.out.println("Problem 2 ");

        int clientDeviceYear = 2009;
        if (clientDeviceYear >= 2015) {
        } else if (clientOs == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear >= 2015) {
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        ///Problem 4 ////
        System.out.println("Problem 4 ");
        /////Вернемся к делам банковским. У нас хороший банк, поэтому для наших клиентов мы организуем доставку банковских карт на
        // дом с четкой датой доставки. Чтобы известить клиента о том, когда будет доставлена его карта, нам нужно знать расстояние от
        // нашего офиса до адреса доставки.
        //
        //Правила доставки такие:
        //
        //Доставка в пределах 20 км занимает сутки.
        //
        //Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        //
        //Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
        //
        //То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
        //
        //Напишите программу, которая выдает сообщение в консоль:
        //
        //"Потребуется дней: " + срок доставки
        //
        //Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.

        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance>20) {
            deliveryTime++;
        }
        if(deliveryDistance>60){
            deliveryTime++;


        }
        System.out.println("Delivery time will be"  +deliveryTime+ "days ");



        ///Problem 5
        System.out.println("Problem5");
        int monthNumber = 11;
        



        switch (monthNumber) {
            case 1:
                System.out.println("winter ");
                break;
            case 2:
            case 12:
                System.out.println("winter");
                break;
            case 3:
                System.out.println(" spring");
                break;
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
                System.out.println("summer");
                break;
            case 8:
                System.out.println("Summer ");
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Такого месяца  не существует");


            {


            }
        }
    }
}




