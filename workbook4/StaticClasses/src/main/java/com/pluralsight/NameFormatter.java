package com.pluralsight;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class NameFormatter {

    private NameFormatter() {}

    public static String format(String firstname, String lastName) {
        if (firstname == null || lastName == null)
            return "";
        return lastName + ", " + firstname;
    }
      public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        if (lastName == null || firstName == null)
            return "";
        StringBuilder results = new StringBuilder();
        results.append(lastName).append(", ");

        if (prefix != null && !prefix.isBlank()) {
            results.append(prefix).append(" ");
        }

        results.append(firstName);

        if (middleName != null && !middleName.isBlank()) {
            results.append(" ").append(middleName);
        }

        if (suffix != null && !suffix.isBlank()) {
            results.append(", ").append(suffix);
        }

        return results.toString().trim();
      }


      public static String format(String fullName) {
        if (fullName == null || fullName.isBlank())
            return "";

        String prefix = "";
        String first
      }

}