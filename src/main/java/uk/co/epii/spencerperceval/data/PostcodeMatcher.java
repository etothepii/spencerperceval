package uk.co.epii.spencerperceval.data;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: James Robinson
 * Date: 26/10/2013
 * Time: 18:20
 */
public class PostcodeMatcher {

    private String prefixPattern;
    private String suffixPattern;
    private boolean spacesRequired;
    private Pattern postcodeMatcher;
    private Pattern postcodeFinder;

    public void setPrefixPattern(String prefixPattern) {
        this.prefixPattern = prefixPattern;
    }

    public void setSuffixPattern(String suffixPattern) {
        this.suffixPattern = suffixPattern;
    }

    public void setSpacesRequired(boolean spacesRequired) {
        this.spacesRequired = spacesRequired;
    }

    public void init() {
        postcodeMatcher = Pattern.compile(String.format(
                "^(%s) %s(%s)$", prefixPattern, spacesRequired ? "+" : "*", suffixPattern));
        postcodeFinder = Pattern.compile(String.format(
                "%s %s%s", prefixPattern, spacesRequired ? "+" : "*", suffixPattern));
    }

    public boolean containsPostcode(String line) {
        return postcodeFinder.matcher(line).find();
    }

    public String standardize(String postcode) {
        Matcher matcher = postcodeMatcher.matcher(postcode);
        if (!matcher.find()) {
            throw new IllegalArgumentException(String.format("%s is not a valid postcode", postcode));
        }
        return String.format("%s %s", matcher.group(1), matcher.group(2));
    }
}
