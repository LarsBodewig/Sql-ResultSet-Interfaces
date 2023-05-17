package dev.bodewig.sql_resultset_interfaces;

import java.sql.SQLException;

public interface ResultSetTraverser {

	boolean isBeforeFirst() throws SQLException;
	boolean isAfterLast() throws SQLException;
	boolean isFirst() throws SQLException;
	boolean isLast() throws SQLException;
	void beforeFirst() throws SQLException;
	void afterLast() throws SQLException;
	boolean first() throws SQLException;
	boolean last() throws SQLException;
	int getRow() throws SQLException;
	boolean absolute(int row) throws SQLException;
	boolean relative(int rows) throws SQLException;
	boolean previous() throws SQLException;
	boolean next() throws SQLException;
	boolean isClosed() throws SQLException;

	void moveToInsertRow() throws SQLException;
	void moveToCurrentRow() throws SQLException;
	boolean wasNull() throws SQLException;
	void close() throws SQLException;
}
