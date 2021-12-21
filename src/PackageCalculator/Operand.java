package PackageCalculator;

class Operand {
    String sOperand;
    int iOperand;
    char typeOperand ;//тип символв
    Operand(String s) throws Exception {
        sOperand = s;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);// символ
            if((i == 0) && (c == '0')) throw new Exception("Ведущий ноль");
            char tC = switch (c) {
                case '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' -> 'd';
                case 'I', 'V', 'X' -> 'r';
                default -> throw new Exception("несоответствующий тип символов");
            };
            if (typeOperand == 0) typeOperand = tC;
            else { if(typeOperand != tC) throw new Exception("Разный тип символов");}
        }
        switch (typeOperand) {
            case 'd' ->  iOperand = StrDecToNum(sOperand);
            case 'r' -> iOperand = StrRomToNum(sOperand);
            default -> throw new Exception("Неопределенный тип символов");
        }
        if (iOperand > 10) {throw new Exception("Превышено значение операнда");}
    }
    //Преобразование строки с десятичными цифрами
    int StrDecToNum(String s){return Integer.parseInt(s);}
    //Преобразование строки с римскими цифрами
    int StrRomToNum(String s) throws Exception {
        int result;
        switch (s) {
            case "I" -> result = 1;
            case "II" -> result = 2;
            case "III" -> result = 3;
            case "IV" -> result = 4;
            case "V" -> result = 5;
            case "VI" -> result = 6;
            case "VII" -> result = 7;
            case "VIII" -> result = 8;
            case "IX" -> result = 9;
            case "X" -> result = 10;
            default -> throw new Exception("Недопустимый символ или превышено значение");
        }
        return result;
    }
}
