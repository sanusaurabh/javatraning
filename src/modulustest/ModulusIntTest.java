package modulustest;

public class ModulusIntTest {
    public static void main(String[] args) {
        ModulusInt modulusIntclass = new ModulusInt();

        modulusIntclass.modulus();
        modulusIntclass.modulusByParameter(637,67);
        modulusIntclass.modulusByParameterAndReturnValue(637,67);
        modulusIntclass.modulusByReturnValue();
    }

}
