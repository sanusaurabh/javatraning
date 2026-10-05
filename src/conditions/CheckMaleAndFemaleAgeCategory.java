package conditions;

public class CheckMaleAndFemaleAgeCategory {
    public static void main(String[] args){

        String name = "Anita";
        char gender =  'F';
        int age = 30;

        if(gender == 'M'){

            if(age>=10 && age<=17){

                System.out.println(name+  " is a young male");
            }
            if(age>=18 && age<=50){

                System.out.println(name+  " is a adult male");
            }
            if(age>=51 && age<=90){

                System.out.println(name+  " is a old male");
            }

        }
        if(gender == 'F'){

            if(age>=10 && age<=17){

                System.out.println(name+  " is a young female");
            }
            if(age>=18 && age<=50){

                System.out.println(name+  " is a adult female");
            }
            if(age>=51 && age<=90){

                System.out.println(name+  " is a old female");
            }

        }


    }
}
