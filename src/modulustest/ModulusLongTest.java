package modulustest;

public class ModulusLongTest {
    public static void main(String[] args) {

        ModulusLong modulusLongClass = new ModulusLong();

        modulusLongClass.modulus();
        modulusLongClass.modulusByReturnValues();
        modulusLongClass.modulusByParameters(56456l, 545l);
        modulusLongClass.modulusByParametersAndReturnValues(56456l, 545l);
    }
}
