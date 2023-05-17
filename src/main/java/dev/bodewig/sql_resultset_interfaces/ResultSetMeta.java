package dev.bodewig.sql_resultset_interfaces;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;

public interface ResultSetMeta {

	void setFetchDirection(int direction) throws SQLException;
	int getFetchDirection() throws SQLException;
	void setFetchSize(int rows) throws SQLException;
	int getFetchSize() throws SQLException;

	SQLWarning getWarnings() throws SQLException;
	void clearWarnings() throws SQLException;
	String getCursorName() throws SQLException;
	ResultSetMetaData getMetaData() throws SQLException;

	int getConcurrency() throws SQLException;

	Statement getStatement() throws SQLException;

	int getHoldability() throws SQLException;

	boolean isClosed() throws SQLException;
	void close() throws SQLException;

	void refreshRow() throws SQLException;
}
