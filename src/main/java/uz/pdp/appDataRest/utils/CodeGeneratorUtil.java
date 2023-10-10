package uz.pdp.appDataRest.utils;

import java.util.Random;

public class CodeGeneratorUtil {
    static int codeLength = 7;
    static int upperBound = 10;

    public static String generateRandomCode() {
        Random random = new Random();
        StringBuilder codeBuilder = new StringBuilder();
        for (int i = 0; i < codeLength; i++) {
            int digit = random.nextInt(upperBound);
            codeBuilder.append(digit);
        }
        return codeBuilder.toString();
    }
}
