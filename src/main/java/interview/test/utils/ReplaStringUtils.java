package interview.test.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * @author ansel
 */
public class ReplaStringUtils {

    private static final String HELLO = "HELLO";
    private static final String WORLD = "WORLD";

    /**
     * This method is to replace string "HELLO" with "WORLD" and won't ignore case.
     *
     * @param origin
     * @return
     */
    public static String replaceHelloWithWorld(String origin) {
        return StringUtils.replace(origin, HELLO, WORLD);
    }
}
