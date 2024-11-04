package com.automation.boilerplate.util_featurescript;
/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author kiyandark a.k.a. Muhammad Irfan Syaifur Rizal Wiratama
Java Developer
Created on 26/06/2024 12:04
@Last Modified 26/06/2024 12:04
Version 1.0
*/

import java.util.Scanner;

public class ScenarioMapperToHooks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder output = new StringBuilder();

        System.out.println("Enter feature steps (or 'exit' to quit):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String convertedStep = convertFeature(input);
            if (!convertedStep.isEmpty()) {
                output.append(convertedStep + "\n");
            }
        }

        if (output.length() > 0) {
            System.out.println(output.toString());
        } else {
            System.out.println("No valid feature steps entered.");
        }

        scanner.close();
    }

    private static String convertFeature(String line) {
        StringBuilder output = new StringBuilder();

        int startIndex = line.indexOf('"');
        int endIndex = line.lastIndexOf('"');
        if (startIndex != -1 && endIndex != -1 && endIndex > startIndex) {
            String content = line.substring(startIndex + 1, endIndex);
            output.append("/*").append(content).append("*/ 1,");
        }

        return output.toString();
    }
}
