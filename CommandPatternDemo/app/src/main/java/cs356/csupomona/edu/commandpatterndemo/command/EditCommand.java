package cs356.csupomona.edu.commandpatterndemo.command;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by yusun on 11/13/14.
 */
public abstract class EditCommand {

    /** Generate the random number from [0, maxRange) */
    protected int generateInt(int maxRangeExclusive) {
        Random r = new Random();
        return r.nextInt(maxRangeExclusive);
    }

    /** Generate a random string */
    protected String generateString() {
        SecureRandom random = new SecureRandom();
        return new BigInteger(130, random).toString(32);
    }

    abstract public void execute();
    abstract public void undo();

}
