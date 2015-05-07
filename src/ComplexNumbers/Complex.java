/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComplexNumbers;

/**
 *
 * @author Miles Robson
 */
public final class Complex
{

    /**
     * Constructor of Complex
     *
     * @param iReal real of complex number
     * @param iImagine imagine of complex number
     */
    public Complex(float iReal, float iImagine)
    {
        real = iReal;
        imagine = iImagine;
    }

    /**
     * Constructor Variant of Complex
     *
     * @param iReal Real of complex number
     */
    public Complex(float iReal)
    {
        real = iReal;
        imagine = 0;
    }

    /**
     * toString of Complex, converting our number into a string
     *
     * @return string representation of complex
     */
    public String toString()
    {
        String result;
        if (imagine < 0) {
            float imagineCup = imagine * -1;
            result = Float.toString(real) + " - " + Float.toString(imagineCup) + "i";
            return result;
        } else {
            result = Float.toString(real) + " + " + Float.toString(imagine) + "i";
            return result;
        }

    }

    /**
     * add of Complex
     *
     * @param inputComplex
     * @return sum of this, inputComplex as returned new Complex
     */
    public Complex add(Complex inputComplex)
    {
        // Used http://www.mathsisfun.com/numbers/complex-numbers.html as a resource
        float ourReal = inputComplex.r() + this.real;
        float ourImagine = inputComplex.i() + this.imagine;

        return new Complex(ourReal, ourImagine);

    }

    /**
     * sub of Complex
     *
     * @param inputComplex, our subtrahend
     * @return difference of this(minuend), inputComplex(subtrahend) as returned
     * new Complex
     */
    public Complex sub(Complex inputComplex)
    {
        // Used http://www.mathsisfun.com/numbers/complex-numbers.html as a resource
        float ourReal = this.real - inputComplex.r();
        float ourImagine = this.imagine - inputComplex.i();

        return new Complex(ourReal, ourImagine);

    }

    /**
     * conj of Complex
     *
     * @return conjugate of this, returned as new complex
     */
    public Complex conj()
    {
        // Used http://www.mathsisfun.com/numbers/complex-numbers.html as a resource
        float ourReal = this.r();
        float ourImagine = this.i() * -1;

        return new Complex(ourReal, ourImagine);
    }

    /**
     * mult of Complex
     *
     * @param inputComplex
     * @return product of this, returned as new complex
     */
    public Complex mult(Complex inputComplex)
    {
        // Used http://www.mathsisfun.com/numbers/complex-numbers.html as a resource
        float one = this.r();
        float two = this.i();
        float three = inputComplex.r();
        float four = inputComplex.i();

        float first = one * three;
        float outer = one * four;
        float inner = two * three;
        float last = two * four * -1;

        float ourReal = first + last;
        float ourImagine = outer + inner;

        return new Complex(ourReal, ourImagine);
    }

    /**
     * div of Complex
     *
     * @param inputComplex
     * @return quotient of this, returned(divisor) as new complex
     */
    public Complex div(Complex inputComplex)
    {
        // Used http://www.mathsisfun.com/numbers/complex-numbers.html as a resource
        Complex top = this;

        top = top.mult(inputComplex.conj());
        float bottom = (float) Math.pow(inputComplex.conj().r(), 2) + (float) Math.pow(inputComplex.conj().i(), 2);

        if (bottom == 0) {
            throw new ArithmeticException("bottom is 0");
        }

        float ourReal = top.real / bottom;
        float ourImagine = top.imagine / bottom;

        return new Complex(ourReal, ourImagine);

    }

    /**
     * equals of Complex
     *
     * @param inputComplex
     * @return returns if input and this are equal as boolean
     */
    public Boolean equals(Complex inputComplex)
    {
        Boolean result = true;

        result = (Math.abs(this.real - inputComplex.r()) < MARGIN) && (Math.abs(this.imagine - inputComplex.i()) < MARGIN);

        return result;
    }

    public float r()
    {
        return real;
    }

    public float i()
    {
        return imagine;
    }

    private float real;
    private float imagine;
    private double MARGIN = .0000000001;

    public static void main(String[] args)
    {
        Complex mathTest1 = new Complex(1, 1);
        Complex mathTestCon = mathTest1.conj();
        mathTest1 = new Complex(1, -1);
        System.out.println(mathTestCon.equals(mathTest1));
        //prints true, tests equal and conj
        System.out.println(mathTest1.toString());
        Complex addTest = new Complex(2, 2);
        Complex result = addTest.add(mathTest1);
        System.out.println(result.toString());
        //prints 1+1i
        Complex subTest = new Complex(5, 2);
        mathTest1 = new Complex(3, 1);
        result = subTest.sub(mathTest1);
        System.out.println(result.toString());
        //2+1i
        Complex mulTest = new Complex(-2, 2);
        result = mulTest.mult(mathTest1);
        System.out.println(result.toString());
        //-8, 4 foil with i^2 being -2.
        Complex devTest = new Complex(2, 3);
        mathTest1 = new Complex(4, -5);
        result = devTest.div(mathTest1);
        System.out.println(result.toString());
        // -7/41  + 22i/41
    }

}
