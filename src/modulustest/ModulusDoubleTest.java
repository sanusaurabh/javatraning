package modulustest;

public class ModulusDoubleTest {
    public static void main(String[] args) {
        ModulusDouble modulusDoubleClass = new ModulusDouble();
        modulusDoubleClass.modulus();
        modulusDoubleClass.modulusByReturnValues();
        modulusDoubleClass.modulusByParameters(45556.67, 4545.88);
        modulusDoubleClass.modulusByParametersAndReturnValues(234.6, 56.88);
    }
}
