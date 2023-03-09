package utils;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.ThreadLocalRandom;

public class RegistrationFakeData {

    public static int randomInteger(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static String randomArray (String @NotNull [] value){
        int index = randomInteger(0, value.length - 1);
        return value [index];
    }
}
