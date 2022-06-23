package com.example.test1;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

public class DBUtility {
    private static String user = DBCredentials.user;
    private static String password = DBCredentials.password;

    //AWS connection
    private static String connectURL = "jdbc:mysql://localhost:3306/javaTest";

    /**
     * It will return a list of all the sutudent object in the Database
     */
    public static ArrayList<Student> getStudentsFromDB() {
        ArrayList<Student> Students = new ArrayList<>();

        String sql = "SELECT * FROM students;";

        try (
                Connection conn = DriverManager.getConnection(connectURL, user, password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while (resultSet.next()) {
                int studentNum = resultSet.getInt("studentNum");
                String firstName = resultSet.getString("firstName");
                String lastName = resultSet.getString("lastName");
                String gender = resultSet.getString("gender");
                String telephone = resultSet.getString("telephone");
                String province = resultSet.getString("province");
                int avgGrade = resultSet.getInt("avgGrade");
                String majorCode = resultSet.getString("majorCode");

                Students.add(new Student(studentNum, firstName, lastName, gender, telephone,province, avgGrade, majorCode));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Students;
    }
}