import java.math.BigInteger;

public class Numbers {

    public static void main(String[] args) {
        int myInt = 10;
        System.out.println(myInt);

        long myLong = 10L;
        System.out.println(myLong);

        int myHexadecimal = 0x2A;
        System.out.println(myHexadecimal);

        double myDouble = 3.14;
        System.out.println(myDouble);

        //float myFloat = 3.14; //show the error of incompatibility => STRONG TYPED LANGUAGE
        float myFloat = 3.14f;
        System.out.println(myFloat);

        double positiveInfinity = Double.POSITIVE_INFINITY;
        double negativeInfinity = Double.NEGATIVE_INFINITY;
        System.out.println(positiveInfinity+positiveInfinity);

        BigInteger myBigInteger1 = new BigInteger("1");
        BigInteger myBigInteger2 = new BigInteger("2");
        BigInteger myBigIntegerSum = myBigInteger1.add(myBigInteger2);
        System.out.println(myBigIntegerSum);
    }
}
