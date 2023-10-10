class ComplexNumber {
    private final double real;
    private final double imaginary;

    public static void main(String[] args){
        var cn = new ComplexNumber(4,8);
        var a = toString(cn);
        System.out.print(a);
    }

    public ComplexNumber(final double real, final double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public String toString(cn){
        var convNum = "";
        convNum += cn.real.toString();
        convNum += " + ";
        convNum += cn.imaginary.toString();

        return convNum;
    }

    public double getImaginary() {
        return 0;
    }

    public double getReal() {
        return 0;
    }
    
    public ComplexNumber plus(final ComplexNumber other) {
        return null;
    }
    
    public ComplexNumber sub(final ComplexNumber other) {
        return null;
    }

    public ComplexNumber times(final ComplexNumber other) {
        return null;
    }

    public ComplexNumber div(final ComplexNumber other) {
        final double commonDenominator = other.getReal() * other.getReal() + other.getImaginary() * other.getImaginary();
        final double realNumerator = this.getReal() * other.getReal() + this.getImaginary() * other.getImaginary();
        final double imaginaryNumerator = other.getReal() * this.getImaginary() - this.getReal() * other.getImaginary();
        return new ComplexNumber(realNumerator / commonDenominator, imaginaryNumerator / commonDenominator);
    }
}