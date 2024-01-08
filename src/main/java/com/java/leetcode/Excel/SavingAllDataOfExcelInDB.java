package com.java.leetcode.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.apache.poi.ss.usermodel.*;

public class SavingAllDataOfExcelInDB {

    public static void main(String[] args) {
        String excelFilePath = "C:\\Users\\sunilg.INFICS\\Documents\\ExcelDataReading.xlsx"; // Replace with your Excel file path
        String jdbcURL = "jdbc:mysql://localhost:3306/savingAlldataFromExcelToDB";
        String username = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
        	System.out.println("Insid ethe Try Block : ");
            FileInputStream inputStream = new FileInputStream(excelFilePath);

            Workbook workbook = WorkbookFactory.create(inputStream);
            Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet

            String sql = "INSERT INTO excelData1 (id, firstName, lastName,age,dateOfBirth,gender) VALUES (?, ?, ?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            for (Row row : sheet) {
            	System.out.println("Insid ethe for loop Block : =");
                Cell cell1 = row.getCell(0); // Access the first cell
                Cell cell2 = row.getCell(1); // Access the second cell
                Cell cell3 = row.getCell(2); // Access the third cell
                Cell cell4 = row.getCell(3); // Access the first cell
                Cell cell5 = row.getCell(4); // Access the second cell
                Cell cell6 = row.getCell(5); // Access the third cell

                // Assuming columns are of type String
                String value1 = cell1.getStringCellValue();
                String value2 = cell2.getStringCellValue();
                String value3 = cell3.getStringCellValue();
                String value4 = cell4.getStringCellValue();
                String value5 = cell5.getStringCellValue();
                String value6 = cell6.getStringCellValue();

                statement.setString(1, value1);
                statement.setString(2, value2);
                statement.setString(3, value3);
                statement.setString(4, value4);
                statement.setString(5, value5);
                statement.setString(6, value6);

                statement.addBatch(); // Add the prepared statement to the batch
            }

            statement.executeBatch(); // Execute all statements as a batch
            workbook.close();
            System.out.println("Data imported into database successfully!");

        } catch (IOException | SQLException e) {
        	System.out.println("Insid ethe cathc Block : =");
            e.printStackTrace();
        }
    }
}

