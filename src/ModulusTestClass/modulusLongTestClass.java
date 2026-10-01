package ModulusTestClass;

public class modulusLongTestClass {
    public static void main(String[] args) {

        modulusLongClass modulusLongClass = new modulusLongClass();

        modulusLongClass.modulus();
        modulusLongClass.modulusByReturnValues();
        modulusLongClass.modulusByParameters(56456l, 545l);
        modulusLongClass.modulusByParametersAndReturnValues(56456l, 545l);
    }
}
