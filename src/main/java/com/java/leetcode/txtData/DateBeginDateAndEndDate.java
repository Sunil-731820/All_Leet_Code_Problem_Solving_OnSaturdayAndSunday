package com.java.leetcode.txtData;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateBeginDateAndEndDate {

    public static void main(String[] args) {
        String beginDateStr = "2023-01-15";
        String endDateStr = "2025-02-10";
        String date1 = "";

        // Define a date format matching your string representation
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Parse the strings into LocalDate objects
        LocalDate beginDate = LocalDate.parse(beginDateStr, formatter);
        LocalDate endDate = LocalDate.parse(endDateStr, formatter);

        // Check if beginDate is greater than endDate
        if (beginDate.isAfter(endDate)) {
            System.out.println("Begin date should not be greater than end date.");
            // Handle the situation where the begin date is greater than the end date
        } else {
            System.out.println("Dates are valid: Begin date is not greater than end date.");
            // Proceed with your logic if the dates are valid
        }
    }
}

