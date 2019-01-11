package SM2_Week2;

public class UnitConvertor {

    public void cmToInches(double cms){
        final double measure = 0.394;
         double conversion = cms * measure;
        System.out.println(cms + " cms in inches is " + conversion);
    }

    public void inchesToCms(double inches){
        final double measure = 2.54;
        double conversion = inches * measure;
        System.out.println(inches + " inches in cms is " + conversion);
    }

    public void kmToMiles(double kms){
        final double measure = 1.609;
        double conversion = kms * measure;
        System.out.println(kms + " kms in miles is " + conversion);
    }

    public void milesToKms(double miles){
        final double measure = 0.621;
        double conversion = miles * measure;
        System.out.println(miles + " miles in kms is " + conversion);
    }
}
