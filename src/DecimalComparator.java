public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number1,double number2)
    {
        boolean compareResult=false;
        double number3 = number1 * 1000;
        System.out.println(number3);
        double number4 = number2 * 1000;
        System.out.println(number4);
        int num1=(int)number3;
        System.out.println(num1);
        int num2=(int)number4;
        System.out.println(num2);
        if((int)number3 == (int)number4)
        {
            compareResult = true;
            System.out.println(compareResult);
        }
        return compareResult;

    }
}
