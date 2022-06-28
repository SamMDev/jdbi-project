package com.example.jdbiproject.jdbi;

import lombok.Getter;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Model representing one row in resultSet
 *
 * @author Samuel Molcan
 */
public class ResultSetRowModel {

    @Getter
    private final ResultSetMetaData metaData;
    @Getter
    private final List<String> columnNames = new ArrayList<>();

    public ResultSetRowModel(ResultSet resultSet) throws SQLException {
        this.metaData = resultSet.getMetaData();

        for (int columnIndex = 1; columnIndex <= this.metaData.getColumnCount(); columnIndex++) {
            this.columnNames.add(metaData.getColumnLabel(columnIndex));
        }
    }
}
