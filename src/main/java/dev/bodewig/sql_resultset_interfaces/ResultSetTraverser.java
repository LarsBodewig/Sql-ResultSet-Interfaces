package dev.bodewig.sql_resultset_interfaces;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Subset of the {@link ResultSet} interface containing only traversing methods
 * 
 * @see ResultSet
 */
public interface ResultSetTraverser {

	/** see {@link ResultSet#absolute(int row)} */
	boolean absolute(int row) throws SQLException;

	/** see {@link ResultSet#afterLast()} */
	void afterLast() throws SQLException;

	/** see {@link ResultSet#beforeFirst()} */
	void beforeFirst() throws SQLException;

	/** see {@link ResultSet#close()} */
	void close() throws SQLException;

	/** see {@link ResultSet#first()} */
	boolean first() throws SQLException;

	/** see {@link ResultSet#getRow()} */
	int getRow() throws SQLException;

	/** see {@link ResultSet#isAfterLast()} */
	boolean isAfterLast() throws SQLException;

	/** see {@link ResultSet#isBeforeFirst()} */
	boolean isBeforeFirst() throws SQLException;

	/** see {@link ResultSet#isClosed()} */
	boolean isClosed() throws SQLException;

	/** see {@link ResultSet#isFirst()} */
	boolean isFirst() throws SQLException;

	/** see {@link ResultSet#isLast()} */
	boolean isLast() throws SQLException;

	/** see {@link ResultSet#last()} */
	boolean last() throws SQLException;

	/** see {@link ResultSet#moveToCurrentRow()} */
	void moveToCurrentRow() throws SQLException;

	/** see {@link ResultSet#moveToInsertRow()} */
	void moveToInsertRow() throws SQLException;

	/** see {@link ResultSet#next()} */
	boolean next() throws SQLException;

	/** see {@link ResultSet#previous()} */
	boolean previous() throws SQLException;

	/** see {@link ResultSet#relative(int rows)} */
	boolean relative(int rows) throws SQLException;

	/** see {@link ResultSet#wasNull()} */
	boolean wasNull() throws SQLException;
}
