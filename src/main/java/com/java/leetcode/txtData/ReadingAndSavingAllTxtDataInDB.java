package com.java.leetcode.txtData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReadingAndSavingAllTxtDataInDB {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\sunilg\\data.txt"; // Replace with your text file path
        String jdbcURL = "jdbc:mysql://localhost:3306/savingalldatafromexceltodb";
        String username = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password);
             BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        	System.out.println("Insid ethe Try Block : =");

            String line;
            while ((line = reader.readLine()) != null) {
            	System.out.println("Insdide the while Loop ");
            	System.out.println(line);
                String[] parts = line.split(" "); // Splitting the line by SPace to extract individual values
                System.out.println(parts.toString());
                String id = parts[0].trim();
                String firstName = parts[1].trim();
                String beginDate = parts[2].trim();
                String endDate = parts[3].trim();
                // Assuming table structure: (name VARCHAR, age INT, email VARCHAR)
                String sql = "INSERT INTO txtdata (id, firstName, beginDate,endDate) VALUES (?, ?, ?,?)";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, id);
                statement.setString(2, firstName);
                statement.setString(3, beginDate);
                statement.setString(4, endDate);
                statement.executeUpdate();
                statement.close();
                System.out.println("The Size Of The Array is : ="+parts.length);
            }
            
            System.out.println("Data from text file saved into the database successfully!");

        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }
}


