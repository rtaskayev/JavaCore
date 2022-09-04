package com.netology;

class Main {


    public static void main(String[] args) {


        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(2, 1);
        int c = calc.devide.apply(a, b);

        boolean d = calc.isPositive.test(-3);

        int e = calc.pow.apply(2);
        int f = calc.abs.apply(-2);

        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);

        //calc.println.accept(d);
        // Не понял почему код не должен был скомпилироваться. Единственная проблема возникла с предикатом, так как он выдает булево число.
        // Пришлось добавить ниже операцию для приведения к интеджер при выводе

        calc.println.accept((d) ? 1 : 0);
        calc.println.accept(e);
        calc.println.accept(f);
    }

}