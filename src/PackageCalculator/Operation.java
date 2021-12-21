package PackageCalculator;

class Operation {
char sOperator;
Operation (String s) throws Exception {
    switch (s){
        case "+", "-" , "*", "/" ->  sOperator = s.charAt(0);
        default -> throw new Exception("Недопустимый символ операции");
    }

}
}
