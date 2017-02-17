package com.learning.spring.database;

import com.learning.spring.entity.Grade;

import java.sql.*;

public class DatabaseManager {

    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public DatabaseManager() {
    }

    public int addGrade(Grade grade) {
        try {
            connection = DatabaseConnector.createConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO grade (id, subject, weight, grade) VALUES " +
                    "(?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, grade.getId());
            preparedStatement.setString(2, grade.getSubject());
            preparedStatement.setInt(3, grade.getWeight());
            preparedStatement.setDouble(4, grade.getGrade());
            preparedStatement.execute();
            System.out.println("Insert grade completed");

            resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                int id = resultSet.getInt(1);
                resultSet.close();
                preparedStatement.close();
                DatabaseConnector.closeConnection();
                return id;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1;
    }

    public int updateGrade(Grade grade) {
        try {
            connection = DatabaseConnector.createConnection();
            preparedStatement = connection.prepareStatement("UPDATE grade SET subject = ?, weight = ?, " +
                    "grade = ? WHERE id = ?");
            preparedStatement.setString(1, grade.getSubject());
            preparedStatement.setInt(2, grade.getWeight());
            preparedStatement.setDouble(3, grade.getGrade());
            preparedStatement.setInt(4, grade.getId());
            preparedStatement.execute();

            System.out.println("Update grade completed");
            preparedStatement.close();
            DatabaseConnector.closeConnection();
            return 1;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public Grade getGradeById(Integer id) {
        Grade grade = new Grade();
        try {
            connection = DatabaseConnector.createConnection();
            preparedStatement = connection.prepareStatement("SELECT subject, weight, grade FROM grade WHERE id = ?");
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                grade.setId(id);
                grade.setSubject(resultSet.getString("subject"));
                grade.setWeight(resultSet.getInt("weight"));
                grade.setGrade(resultSet.getDouble("grade"));
            }

            resultSet.close();
            preparedStatement.close();
            DatabaseConnector.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return grade;
    }

    public int deleteGrade(Integer id) {
        try {
            connection = DatabaseConnector.createConnection();
            preparedStatement = connection.prepareStatement("DELETE FROM grade WHERE id = ?");
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            System.out.println("Delete grade completed");

            preparedStatement.close();
            DatabaseConnector.closeConnection();
            return 1;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
