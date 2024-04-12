import java.util.Random;

public class Main {

    public static String task1(int a) {
        if (a == 0) {
            return "correct";
        } else {
            return "incorrect";
        }
    }

    public static String task2(int a) {
        if (a > 0) {
            return "correct";
        } else {
            return "incorrect";
        }
    }

    public static String task3(int a) {
        if (a < 0) {
            return "correct";
        } else {
            return "incorrect";
        }
    }

    public static String task4(int a) {
        if (a >= 0) {
            return "correct";
        } else {
            return "incorrect";
        }
    }

    public static String task5(int a) {
        if (a <= 0) {
            return "correct";
        } else {
            return "incorrect";
        }
    }

    public static String task6(int a) {
        if (a != 0) {
            return "correct";
        } else {
            return "incorrect";
        }
    }

    public static String task7(String a) {
        if (a.equals("test")) {
            return "correct";
        } else {
            return "incorrect";
        }
    }

    public static String task8(int a) {
        if (a == 1) {
            return "correct";
        } else {
            return "incorrect";
        }
    }

    public static String task9(Boolean test) {
        if (test) {
            return "correct";
        } else {
            return "incorrect";
        }
    }

    public static String task10(Boolean test) {
        if (!test) {
            return "correct";
        } else {
            return "incorrect";
        }
    }

    public static String task11(int a) {
        if (a > 0 && a < 5) {
            return "correct";
        } else {
            return "incorrect";
        }
    }

    public static int task12(int a) {
        if (a == 0 || a == 2) {
            return a + 7;
        } else if (a == -3) {
            return -3;
        } else {
            return 12;
        }
    }



    public static String task13(int a, int b) {
        if (a <= 1 && b >= 3) {
            return "sub:" + (a - b);
        } else {
            return "sum:" + (a + b);
        }
    }




    public static String task14(int a, int b) {
        if ((a > 2 && a < 11) || (b >= 6 && b < 14)) {
            return "correct";
        } else {
            return "incorrect";
        }
    }


    public static String task15() {
        int num = new Random().nextInt(4) + 1;
        String result;

        switch (num) {
            case 1:
                result = "winter";
                break;
            case 2:
                result = "spring";
                break;
            case 3:
                result = "summer";
                break;
            case 4:
                result = "autumn";
                break;
            default:
                result = "incorrect for num";
        }

        return "Value num: " + num + "\nResult for variable num: " + result;
    }

    public static String task16() {
        int day = new Random().nextInt(32) + 1;

        if (day >= 1 && day <= 10) {
            return "Первая декада месяца:" + day;
        } else if (day >= 11 && day <= 20) {
            return "Вторая декада месяца:" + day;
        } else if (day >= 21 && day <= 31) {
            return "Третья декада месяца:" + day;
        } else {
            return "Некорректное значение дня месяца";
        }
    }

    public static String task17() {
        int month = new Random().nextInt(12) + 1;

        if (month >= 1 && month <= 12) {
            String season;
            if (month >= 3 && month <= 5) {
                season = "spring";
            } else if (month >= 6 && month <= 8) {
                season = "summer";
            } else if (month >= 9 && month <= 11) {
                season = "autumn";
            } else {
                season = "winter";
            }
            return "Пора года для месяца " + month + ": " + season;
        } else {
            return "Некорректное значение месяца";
        }
    }

    public static String task18(String str) {
        if (str.length() > 0 && str.charAt(0) == 'a') {
            return "yup";
        } else {
            return "nah";
        }
    }

    public static String task19(String str) {
        if (str.length() > 0) {
            char firstChar = str.charAt(0);
            if (firstChar == '1' || firstChar == '2' || firstChar == '3') {
                return "yup";
            } else {
                return "nah";
            }
        } else {
            return "pustota";
        }
    }

    public static String task20(String str) {

        if (str.length() == 3) {
            int digit1 = Character.getNumericValue(str.charAt(0));
            int digit2 = Character.getNumericValue(str.charAt(1));
            int digit3 = Character.getNumericValue(str.charAt(2));

            int sum = digit1 + digit2 + digit3;

            return "Сумма цифр: " + sum;
        } else {
            return "Строка не содержит 3 цифры";
        }
    }

    public static String task21(String str) {

        if (str.length() == 6) {
            int digit1 = Character.getNumericValue(str.charAt(0));
            int digit2 = Character.getNumericValue(str.charAt(1));
            int digit3 = Character.getNumericValue(str.charAt(2));
            int digit4 = Character.getNumericValue(str.charAt(3));
            int digit5 = Character.getNumericValue(str.charAt(4));
            int digit6 = Character.getNumericValue(str.charAt(5));

            int sumFirstThree = digit1 + digit2 + digit3;
            int sumLastThree = digit4 + digit5 + digit6;

            if (sumFirstThree == sumLastThree) {
                return "yup";
            } else {
                return "nah";
            }
        } else {
            return "Строка не содержит 6 цифр";
        }
    }
}
