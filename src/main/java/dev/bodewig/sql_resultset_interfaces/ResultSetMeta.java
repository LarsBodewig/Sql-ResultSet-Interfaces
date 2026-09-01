package dev.bodewig.sql_resultset_interfaces;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;

/**
 * Subset of the {@link ResultSet} interface containing only methods operating
 * on the meta data
 * 
 * @see ResultSet
 */
public interface ResultSetMeta {

	/** see {@link ResultSet#clearWarnings()} */
	void clearWarnings() throws SQLException;

	/** see {@link ResultSet#close()} */
	void close() throws SQLException;

	/** see {@link ResultSet#getConcurrency()} */
	int getConcurrency() throws SQLException;

	/** see {@link ResultSet#getCursorName()} */
	String getCursorName() throws SQLException;

	/** see {@link ResultSet#getFetchDirection()} */
	int getFetchDirection() throws SQLException;

	/** see {@link ResultSet#getFetchSize()} */
	int getFetchSize() throws SQLException;

	/** see {@link ResultSet#getHoldability()} */
	int getHoldability() throws SQLException;

	/** see {@link ResultSet#getMetaData()} */
	ResultSetMetaData getMetaData() throws SQLException;

	/** see {@link ResultSet#getStatement()} */
	Statement getStatement() throws SQLException;

	/** see {@link ResultSet#getWarnings()} */
	SQLWarning getWarnings() throws SQLException;

	/** see {@link ResultSet#isClosed()} */
	boolean isClosed() throws SQLException;

	/** see {@link ResultSet#refreshRow()} */
	void refreshRow() throws SQLException;

	/** see {@link ResultSet#setFetchDirection(int direction)} */
	void setFetchDirection(int direction) throws SQLException;

	/** see {@link ResultSet#setFetchSize(int rows)} */
	void setFetchSize(int rows) throws SQLException;
}
