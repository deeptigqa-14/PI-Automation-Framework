package com.verifypolicy.framework.ui.utils;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.time.format.DateTimeFormatter;

public class GenerateTestData {

    // Method to generate a unique policy name based on the current timestamp
    public static String generateUniquePolicyName(String startsWith) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        return startsWith + "_" + timestamp;
    }
}
