package PackageCalculator;

public class Calculation {
    int iResult;
    char typeResult;
    String sResult;
   Calculation( Operand num1,  Operand num2, char operation) throws Exception {
       if(num1.typeOperand != num2.typeOperand) throw new Exception("Операнды разных типов");
       typeResult = num1.typeOperand;
       switch (operation){
            case '+' -> iResult = num1.iOperand + num2.iOperand;
            case '-' -> iResult = num1.iOperand - num2.iOperand;
            case '*' -> iResult = num1.iOperand * num2.iOperand;
            case '/' -> iResult = num1.iOperand / num2.iOperand;
            default -> throw new Exception("Недопустимый символ операции");
        }
       if (typeResult == 'r') {
           if(iResult < 1) throw new Exception("Недопустимый результат для римских чисел");
           sResult = numToStringRom(iResult);//Преобразование числа в римскую цифру
           }
       else sResult = Integer.toString(iResult);

   }
    //Преобразование числа в римскую цифру
   String numToStringRom(int num){
       String result ="";
       int iSurplus = 0;
       if (num == 100) result = "C";
       else if (num >= 90) {result = "XC"; iSurplus = num - 90;}
       else if (num >= 80) {result = "LXXX"; iSurplus = num - 80;}
       else if (num >= 70) {result = "LXX"; iSurplus = num - 70;}
       else if (num >= 60) {result = "LX"; iSurplus = num - 60;}
       else if (num >= 50) {result = "L"; iSurplus = num - 50;}
       else if (num >= 40) {result = "XL"; iSurplus = num - 40;}
       else if (num >= 30) {result = "XXX"; iSurplus = num - 30;}
       else if (num >= 20) {result = "XX"; iSurplus = num - 20;}
       else if (num >= 10) {result = "X"; iSurplus = num - 10;}
       else iSurplus = num;

       result = switch (iSurplus) {
           case 1 -> result + "I";
           case 2 -> result + "II";
           case 3 -> result + "III";
           case 4 -> result + "IV";
           case 5 -> result + "V";
           case 6 -> result + "VI";
           case 7 -> result + "VII";
           case 8 -> result + "VIII";
           case 9 -> result + "IX";
           default -> result;
       };
   return result;
   }
}
