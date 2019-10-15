package pl.weeia.makz.zadanie2.utils;

/**
 * Class used for validate strings
 */
public class ValidateUtils {

    /**
     * Method to resolve that string is number
     *
     * @param string to validate
     * @return boolean
     */
    private static boolean isNumeric(String string) {
        return string.matches("-?\\d+(\\.\\d+)?");
    }

    /**
     * Method to resolve that string is a Alphanumeric
     *
     * @param string to validate
     * @return boolean
     */
    private static boolean isAlphanumeric(String string) {
        return !string.matches("[a-zA-Z0-9]+");
    }

    /**
     * Method to resolve that string is string
     *
     * @param string to validate
     * @return boolean
     */
    private static boolean isLowerCaseString(String string) {
        return string.matches("[a-z]+");
    }

    private static boolean isUpperCaseString(String string) {
        return string.matches("[A-Z]+");
    }

    public static String validateString(String stringToValidate) {
        if (isAlphanumeric(stringToValidate)) {
            return "it is alphanumeric";
        } else if (isNumeric(stringToValidate)) {
            return "it is numeric";
        } else if (isLowerCaseString(stringToValidate)) {
            return "it is lower case string";
        } else if (isUpperCaseString(stringToValidate)) {
            return "it is lower case string";
        }else {
            return "String with mixed values";
        }
    }
}
