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
        String firstName = "";
        String middleName = "";
        String lastName = "";
        String suffix = "";

        String[] parts = fullName.split(",", 2);
        String nameParts = parts[0].trim();
        if (parts.length > 1)
            suffix = parts[1].trim();

        String[] tokens = nameParts.split("\\s+");
        if (tokens.length == 2) {

            firstName = tokens[0];
            lastName = tokens[1];
        } else if (tokens.length == 3) {
            if (tokens[0].endsWith(".")) {
                prefix = tokens[0];
                firstName = tokens[1];
                lastName = tokens[2];
            } else {
                firstName = tokens[0];
                middleName = tokens[1];
                lastName = tokens[2];
            }
        } else if (tokens.length == 4) {

            prefix = tokens [0];
            firstName = tokens[1];
            middleName = tokens[2];
            lastName = tokens[3];
        }

        return format(prefix, firstName, middleName,lastName, suffix);
    }
}