import java.time.Year;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет мир! ");
        task1();
        task2();
        task3();
    }

    private static void task3() {
        System.out.println(" задача 3 ");
        kykyld(2);
        kykyld(30);
        kykyld(80);
    }

    public static void kykyld(int distance) {
        int days = computeDelivertDeys(distance);

        System.out.println(String.format(" потребуется дней: %s ", days));
    }

    public static int computeDelivertDeys(int distance) {
        int days;
        {
        }


        if (distance <= 20) {
            return 1;
        } else if (distance > 20 && distance <= 60) {

            return 2;
        } else if (distance > 60 && distance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }


    private static void task2() {
        System.out.println(" Задача 2 ");
        solutionMethod(2017, 0);
        solutionMethod(2014, 1);


    }

    private static void solutionMethod(int currentYear, int clientOs) {
        int YearOfIssue = 2015;


        String LighInfo;

        if (currentYear < YearOfIssue) {
            LighInfo = " облекченую ";
        } else {
            LighInfo = "";
        }
        String osType;
        if (clientOs == 0) {
            osType = "IOS";
        } else {
            osType = "Android ";
        }
        String generalInfo = " Устоновите " + LighInfo + " Версию приложения для " + osType + " по ссылке ";
        System.out.println(generalInfo);

    }

    private static void task1() {
        System.out.println("задача 1 ");
        checkYearLeap(2003);
        checkYearLeap(2008);
        checkYearLeap(2021);


    }

    private static void checkYearLeap(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " - высокосный год ");
        } else {
            System.out.println(year + " - невысокосный год ");


        }
    }
}
