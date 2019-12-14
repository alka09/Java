package calculator;

import java.util.Scanner;

public class DataReader {

    private int number1;
    private int number2;
    private String letter1;
    private String letter2;
    private char operation;
    private boolean exitFlag;
    private char exitCharacter;
    private char resultChar;

    public DataReader(char exitCharacter) {
        this.exitCharacter = exitCharacter;
        this.resultChar = '=';
    }

    public void read() {

        //Integer[] arabic = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};

        System.out.println("Введите выражение, состоящее из двух целых чисел от 0 до 10, знака операции и знака равно (напр. 2+2=, или V+II=): ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if (text.indexOf(exitCharacter) != -1) {
            exitFlag = true;
            return;
        }
        try {
            if ((text.charAt(text.length() - 1) != resultChar)) {
                throw new RuntimeException();
            }

            text = text.substring(0, text.length() - 1);
            String[] blocks = text.split("[+-/*]");

            boolean flag = false;
            for (int i = 0; i < roman.length; i++) {
                roman[i].equals(blocks[0]);
                roman[i].equals(blocks[1]);

            if(flag){
                    number1 = toArabic(blocks[0]);
                    number2 = toArabic(blocks[1]);
                } else {
                number1 = Integer.parseInt(blocks[0]);
                number2 = Integer.parseInt(blocks[1]);
            }
            }


            operation = text.charAt(blocks[0].length());


        if (number1 > 10 || number2 > 10) {
            throw new IllegalArgumentException();
        }
    } catch(
    RuntimeException e)

    {
        throw new IllegalArgumentException("Неверный формат данных");
    }
}

    private int toArabic(String value) {
        if (value.equals("I")) return 1;
        if (value.equals("II")) return 2;
        if (value.equals("III")) return 3;
        if (value.equals("IV")) return 4;
        if (value.equals("V")) return 5;
        if (value.equals("VI")) return 6;
        if (value.equals("VII")) return 7;
        if (value.equals("VIII")) return 8;
        if (value.equals("IX")) return 9;
        if (value.equals("X")) return 10;
        return -1;
    }


    public int getVar1() {
        return number1;
    }

    public int getVar2() {
        return number2;
    }

    public char getOper() {
        return operation;
    }

    public boolean isExitFlag() {
        return exitFlag;
    }
}
