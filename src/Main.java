public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 23;
        if (age >= 18) {
            System.out.println("Поздравляю!!! Тебе всё можно!!!");
        }
        if (age < 18) {
            System.out.println("Потерпи, братишка!)))");
        }


        System.out.println("Задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }


        System.out.println("Задание 3");
        int capacity = 102;
        int seatsPlace = 60;
        int standingRoom = capacity - seatsPlace;

        int seatsUsed = 60;
        int standingUsed = 42;
        if (seatsUsed < seatsPlace) {
            System.out.println("Есть ещё " + (seatsPlace - seatsUsed) + " сидячих мест");
        }
        if (seatsUsed == seatsPlace) {
            System.out.println("Сидячих мест нет");
        }
        if (standingUsed < standingRoom) {
            System.out.println("Есть ещё " + (standingRoom - standingUsed) + " стоячие мест");
        }
        if (standingUsed == standingRoom) {
            System.out.println("Стоячих мест нет");
        }


        System.out.println("Задание 4");
        int age1 = 17;
        if (age1 >= 18) {
            System.out.println("Поздравляю!!! Тебе всё можно!!!");
        } else {
            System.out.println("Потерпи, братишка!)))");
        }


        System.out.println("Задание 5");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }


        System.out.println("Задание 6");
        int capacity1 = 102;
        int seatsPlace1 = 60;
        int standingRoom1 = capacity1 - seatsPlace1;

        int seatsUsed1 = 59;
        int standingUsed1 = 42;
        if (seatsUsed1 < seatsPlace1) {
            System.out.println("Есть ещё " + (seatsPlace1 - seatsUsed1) + " сидячих мест");
        } else {
            System.out.println("Сидячих мест нет");
        }
        if (standingUsed1 < standingRoom1) {
            System.out.println("Есть ещё " + (standingRoom1 - standingUsed1) + " стоячие мест");
        } else {
            System.out.println("Стоячих мест нет");
        }


        System.out.println("Задание 7");
        int age2 = 25;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в детский сад");
        } else if (age2 > 6 && age2 <= 18) {
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в школу");
        } else if (age2 > 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в универ");
        } else if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно робить");
        }


        System.out.println("Задание 8");

    }
}