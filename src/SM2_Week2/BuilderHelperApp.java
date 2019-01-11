package SM2_Week2;

public class BuilderHelperApp {
    public static void main(String[] args) {
        UnitConvertor convert = new UnitConvertor();
        convert.cmToInches(15.0);
        convert.inchesToCms(15.0);
        convert.kmToMiles(15.0);
        convert.milesToKms(15.0);
    }
}
