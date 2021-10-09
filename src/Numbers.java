import java.math.BigInteger;

public class Numbers {

    public static void main(String[] args) {
        int myInt = 10;
        System.out.println(myInt);

        long myLong = 10L;
        System.out.println(myLong);

        Integer myInteger = 10;
        //Integer myInteger = Integer.valueOf("10");
        //String myIntegerString = myInteger;
        String myIntegerString2 = myInteger.toString();
        System.out.println(myIntegerString2);

        BigInteger myBigInteger1 = new BigInteger("1");
        BigInteger myBigInteger2 = new BigInteger("2");
        BigInteger myBigIntegerSum = myBigInteger1.add(myBigInteger2);
        System.out.println(myBigIntegerSum);

        int myHexadecimal = 0x2A;
        System.out.println(myHexadecimal);

        //float myFloat = 3.14;
        float myFloat = 3.14f;
        System.out.println(myFloat);

        double myDouble = 3.14;
        System.out.println(myDouble);

        double positiveInfinity = Double.POSITIVE_INFINITY;
        double negativeInfinity = Double.NEGATIVE_INFINITY;
        System.out.println(positiveInfinity+positiveInfinity);
    }
}
