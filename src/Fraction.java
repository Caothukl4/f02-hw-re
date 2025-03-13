public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction( int numerator,int denominator) {
        if (denominator == 0){
            throw new IllegalArgumentException("Mẫu số không thể bằng 0");
        }
        this.denominator = denominator;
        this.numerator = numerator;
        simplify();
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
    public void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        // Đảm bảo mẫu số luôn dương
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    public Fraction add(Fraction other){
        int newNumerator = this.numerator*other.denominator+other.numerator*this.denominator;
        int newDeminator = this.denominator*other.denominator;
        return new Fraction(newNumerator,newDeminator);
    }

    public Fraction subtraction(Fraction other){
        int newNumerator = this.numerator*other.denominator-other.numerator*this.denominator;
        int newDeminator = this.denominator*other.denominator;
        return  new Fraction(newNumerator,newDeminator);
    }

    public Fraction multi(Fraction other){
        int newNumerator = this.numerator*other.numerator;
        int newDeminator = this.denominator*other.denominator;
        return  new Fraction(newNumerator,newDeminator);
    }

    public Fraction division(Fraction other){
        int newNumerator = this.numerator*other.denominator;
        int newDeminator = this.denominator*other.numerator;
        return  new Fraction(newNumerator,newDeminator);
    }
    public void display() {
        System.out.println("Phân số: " + numerator + "/" + denominator);
    }

}
