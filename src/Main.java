public class Main {
    public static void main(String[] args) {

        DecimalComparator.areEqualByThreeDecimalPlaces(-3.17568,-3.17169);
        DecimalComparator.areEqualByThreeDecimalPlaces(21.45678,21.6789);
        DecimalComparator.areEqualByThreeDecimalPlaces(1.22234,1.2214);
        DecimalComparator.areEqualByThreeDecimalPlaces(1.2234,1.2233);
    }

}
