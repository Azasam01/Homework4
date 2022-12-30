public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("You're an adult");
        } else {
            System.out.println("You're not an adult");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int weather = 10;
        if (weather < 5){
            System.out.println("It's " + weather + " degrees outside, you need to put on a hat");
        } else {
            System.out.println("It's " + weather + " degrees outside, you don't need to put on a hat");
        }

    }

    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 30;
        if (speed > 60){
            System.out.println("If the speed is " + speed + " km/h, then you will have to pay a fine");
        } else {
            System.out.println("If the speed is " + speed + " km/h, then you won't have to pay a fine");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int age = 29;
        if (age >= 2 && age <= 6){
            System.out.println("If person is " + age + " years old, then he/she needs to go to kindergarten");
        } else if (age >= 7 && age <= 18){
            System.out.println("If person is " + age + " years old, then he/she needs to go to school");
        } else if (age >= 18 && age <= 24){
            System.out.println("If person is " + age + " years old, then he/she needs to go to university");
        } else if (age > 24) {
            System.out.println("If person is " + age + " years old, then he/she needs to go to work");
        }
        }



        public static void task5 () {
            System.out.println("Задача 5");
            int age = 12;
            int adult;
            if ( age < 5 ) {
                System.out.println("If the person is " + age + " years old, then he/she can't ride the attraction");
            } else if ( age >= 5 || age < 14 )  {
                System.out.println("If the person is " + age + " years old, then he/she can only ride the attraction when accompanied by an adult");
            } else if (age > 14) {
                System.out.println("If the person is " + age + " years old, then he/she can ride the attraction without an adult accompanying him/her");
            }
        }

        public static void task6 () {
            System.out.println("Задача 6");
            int carriageCapacity = 102;
            int standingPlaces = 60;
            int sittingPlaces = 60;

            int occupiedStandingPlaces = 30;
            int occupiedSittingPlaces = 60;
            if (sittingPlaces > occupiedSittingPlaces){
                System.out.println("There are still " + (sittingPlaces - occupiedSittingPlaces) + " sitting seats in the carriage" );
            }
            if (standingPlaces > occupiedStandingPlaces){
                System.out.println("There are still " + (standingPlaces - occupiedStandingPlaces) + " standing seats in the carriage" );
            }
            if (sittingPlaces == occupiedSittingPlaces){
                System.out.println("There are no more sitting seats in the carriage" );
            }
            if (standingPlaces == occupiedStandingPlaces){
                System.out.println("There are no more standing places in the carriage" );
            }


        }
        public static void task7 () {
            System.out.println("Задача 7");
            int one = 10;
            int two = 600;
            int three = 30;
            if (one>=two && one>=three){
                System.out.println("Number one is the largest");
            } else if (two>=one && two>=three){
                System.out.println("Number two is the largest");
            } else if (three>=two && three>=one){
                System.out.println("Number three is the largest");
            }
        }
    }
