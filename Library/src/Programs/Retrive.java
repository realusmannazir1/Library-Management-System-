package com.lib.library;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

import Programs.ConnectionTest;

public class Retrive {
    ConnectionTest c = new ConnectionTest();

    public void showBooksInStage(String query) {
        TableView<ObservableList<String>> table = new TableView<>();

        try (Connection con = c.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            // Build columns dynamically
            for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                final int j = i;
                TableColumn<ObservableList<String>, String> col =
                        new TableColumn<>(rs.getMetaData().getColumnName(i + 1));
                col.setCellValueFactory(param -> new ReadOnlyStringWrapper(param.getValue().get(j)));
                table.getColumns().add(col);
            }

            // Add rows
            while (rs.next()) {
                ObservableList<String> row = FXCollections.observableArrayList();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    row.add(rs.getString(i));
                }
                table.getItems().add(row);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

      
    }
     public void loadData(TableView<Map<String, Object>> table,String query) {
        try {
            // Get connection using your existing ConnectionTest class
            Connection connection = new ConnectionTest().getConnection();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            
            // Get information about the columns
            ResultSetMetaData metaData = result.getMetaData();
            int columnCount = metaData.getColumnCount();
            
            // Create table columns
            for (int i = 1; i <= columnCount; i++) {
                String columnName = metaData.getColumnName(i);
                TableColumn<Map<String, Object>, Object> column = new TableColumn<>(columnName);
                
                // Set how to get data for each cell
                column.setCellValueFactory(data -> 
                    new javafx.beans.property.SimpleObjectProperty<>(
                        data.getValue().get(columnName)
                    )
                );
                
                // Add column to table
                table.getColumns().add(column);
            }
            
            // Create list to hold all rows
            ObservableList<Map<String, Object>> rows = FXCollections.observableArrayList();
            
            // Read each row from the database
            while (result.next()) {
                Map<String, Object> row = new HashMap<>();
                
                // Add each column's value to the row
                for (int i = 1; i <= columnCount; i++) {
                    row.put(metaData.getColumnName(i), result.getObject(i));
                }
                
                // Add the row to our list
                rows.add(row);
            }
            
            // Put all rows in the table
            table.setItems(rows);
            
            // Close database connections
            result.close();
            statement.close();
            connection.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
            // In a real app, show an error message to the user
        }
    }
}
