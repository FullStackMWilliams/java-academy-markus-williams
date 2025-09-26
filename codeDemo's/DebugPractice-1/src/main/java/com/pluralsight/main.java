// Challenge: Debug This Code
// public class Test
// public static void main(String[] args) {
// int age = "twenty";// Error!
// boolean happy = "yes";// Error
// System.out.println("Age:" + age)
// System.out.println("Happy:" + happy)

package com.pluralsight;

public class main {
    public static void main(String[] args) {
        int age = 20;
        boolean happy = true;
        System.out.println("Age:" + age );
        System.out.println("Happy:" + happy);
    }
}

//                Maven/Pom.xml Debugging guide
// Are you having trouble with project turning off preview after adding a new project?
// Great im here to help.
// First locate the file that no longer previews
// check if pom.xml has M logo if not proceeded to the following steps
// If not intellij just needs you to add the pom file back in the Maven window
// open the Maven icon and select add file
// in the code file selected locate your pom.xml file
// select the pom.xml file of the code you want to preview
// add it to Maven and Done.