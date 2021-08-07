public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

//        int a = calc.plus.apply(1, 2);
//        int b = calc.minus.apply(1, 1);
//        int c = calc.divide.apply(a, b);

        int a = -1;
        int b = calc.absAnalog.apply(a);

        calc.println.accept(b);
//        calc.println.accept(c);
    }
}
