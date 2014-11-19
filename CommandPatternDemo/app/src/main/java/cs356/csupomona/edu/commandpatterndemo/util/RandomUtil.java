package cs356.csupomona.edu.commandpatterndemo.util;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

public class RandomUtil {

    /** Generate the random number from [0, maxRange) */
    public static int generateInt(int maxRangeExclusive) {
        Random r = new Random();
        return r.nextInt(maxRangeExclusive);
    }

    /** Generate a random string */
    public static String generateString() {
        SecureRandom random = new SecureRandom();
        return new BigInteger(130, random).toString(32);
    }
}
