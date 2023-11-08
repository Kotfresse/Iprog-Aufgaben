import java.math.BigInteger;
final public class Fraction extends Number{
    private BigInteger numerator, denominator;
    //Keep in mind that the Fraction itself gets changed when you do operations on it or not
    public static void main(String[] args) {
        /*
         Fraction Alex = new Fraction(1,2);
         Fraction Flaucher = new Fraction("6", "3");
         Fraction Helen = new Fraction(BigInteger.valueOf(3), BigInteger.valueOf(2));
         Fraction Lennard = new Fraction(2, 1);
         System.out.println(Alex.toString());
         System.out.println(Flaucher.toString());
         System.out.println(Helen.toString());
         System.out.println(Alex.add(Flaucher));
         System.out.println(MyMath.gcd(BigInteger.valueOf(2), BigInteger.valueOf(2)));
         if(Flaucher.isInteger()){
             System.out.println("Flaucher is an integer");
         }else{
             System.out.println("Flaucher is not an integer");
         }
         
         if(Helen.isInteger()){
             System.out.println("Helen is an integer");
         }else{
             System.out.println("Helen is not an integer");
         }
         System.out.println(Helen);
         System.out.println(Lennard);
         System.out.println(Helen.multiply(Lennard));
         if(Helen.multiply(Lennard).isInteger()){
             System.out.println("Helen*Lennard is an integer");
         }else{
             System.out.println("Helen*Lennard is not an integer");
         }
         Fraction neu= new Fraction(17, 91);
         Fraction b = new Fraction(8, 1);
         Fraction h = new Fraction(136, 91);
         System.out.println(MyMath.gcd(h.getNumerator(), h.getDenominator()));
         System.out.println(neu.multiply(b));
         */
    }
    //private Fraction(){} // private constructor
    public Fraction(long numerator, long denominator) {
        this.numerator = BigInteger.valueOf(numerator);
        this.denominator = BigInteger.valueOf(denominator);
    }
    public Fraction(BigInteger numerator, BigInteger denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        numerator=numerator.divide(MyMath.gcd(numerator, denominator));
        denominator=denominator.divide(MyMath.gcd(numerator, denominator));
    }
    public Fraction(String numerator, String denominator) {
        this.numerator = new BigInteger(numerator);
        this.denominator = new BigInteger(denominator);
        this.denominator=this.denominator.divide(MyMath.gcd(this.numerator, this.denominator));
        this.numerator=this.numerator.divide(MyMath.gcd(this.numerator, this.denominator));
        
    }
    public int intValue(){
        return 0;
    }
    public long longValue(){
        return 0;
    }
    public float floatValue(){
        return 0f;
    }
    public double doubleValue(){
        return 0.0;
    }
    
    public BigInteger getNumerator() {
        return numerator;
    }
    public BigInteger getDenominator() {
        return denominator;
    }
    public Fraction add(Fraction r){
        BigInteger num = numerator.multiply(r.denominator).add(r.numerator.multiply(denominator).divide(denominator));
        BigInteger den = denominator.multiply(r.denominator);
        BigInteger gcd = MyMath.gcd(num, den);
        this.numerator=this.numerator.divide(gcd);
        this.denominator=this.denominator.divide(gcd);
        return new Fraction(num, den);
    }
    public Fraction substract(Fraction r){
        BigInteger num = numerator.multiply(r.denominator).subtract(r.numerator.multiply(denominator));
        BigInteger den = denominator.multiply(r.denominator);
        BigInteger gcd = MyMath.gcd(num, den);
        this.numerator=this.numerator.divide(gcd);
        this.denominator=this.denominator.divide(gcd);
        return new Fraction(num, den);
    }
    public Fraction multiply (Fraction r){
        BigInteger num = numerator.multiply(r.numerator);
        BigInteger den = denominator.multiply(r.denominator);
        BigInteger gcd = MyMath.gcd(num, den);
        num=num.divide(gcd);
        den=den.divide(gcd);
        return new Fraction(num, den);
    }
    public Fraction divide (Fraction r){
        BigInteger num = numerator.multiply(r.denominator);
        BigInteger den = denominator.multiply(r.numerator);
        BigInteger gcd = MyMath.gcd(num, den);
        this.numerator=this.numerator.divide(gcd);
        this.denominator=this.denominator.divide(gcd);
        return new Fraction(num, den);
    }
    public String toString(){
        return numerator.toString() + "/" + denominator.toString();
    }
    public boolean isInteger(){
        return denominator.equals(BigInteger.ONE);
    }
}