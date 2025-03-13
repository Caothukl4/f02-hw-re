//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        circle.Chuvi();
        circle.Dientich();

        Fraction fraction = new Fraction(7,6);
        Fraction f1 = new Fraction(3,9);
        Fraction result = fraction.add(f1);
        Fraction sub = fraction.subtraction(f1);
        Fraction multi = fraction.multi(f1);
        Fraction division = fraction.division(f1);
        result.display();
        sub.display();
        multi.display();
        division.display();
    }
}