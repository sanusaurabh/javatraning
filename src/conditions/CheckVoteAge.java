package conditions;

import static java.lang.System.out;

public class CheckVoteAge {

    public static void main(String[] args) {

        int age = 19;

        if(age >= 18){
            System.out.println("Allowed age for vote");
        }
        else{
            System.out.println("Not allowed age for vote");
        }
        System.out.println("check vote age complete");
    }
}
