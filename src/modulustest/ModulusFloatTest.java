package modulustest;

public class ModulusFloatTest {
    public static void main(String[] args) {

        ModulusFloat modulusFloatClass = new ModulusFloat();
        modulusFloatClass.modulus();
        modulusFloatClass.modulusByParameter(345365f, 56f);
        modulusFloatClass.modulusByParametersAndReturnValues(345365f, 56f);
        modulusFloatClass.modulusByReturnValues();
    }
}
