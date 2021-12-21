package PackageCalculator;
import java.util.Scanner;
//класс для работы со строкой ввода
class DataLine {
    String strIn;//вводимая строка
    String[] expression; //массив строк
    //конструктор при создании объекта
    DataLine()throws Exception  {
        Scanner console = new Scanner(System.in);
        System.out.print("Ввод строки:");
        strIn = console.nextLine();//сохранение вводимой строки в переменной
        //проверка длины строки
        if ((strIn.length() < 3) || (strIn.length() > 11)) {
            throw new Exception("Строка не соответствует размеру");
        }
        expression = strIn.split(" ");
        //System.out.println(expression.length);
        if (expression.length != 3) {
            throw new Exception("Выражение не соответствует размеру");
        }
    }
}
