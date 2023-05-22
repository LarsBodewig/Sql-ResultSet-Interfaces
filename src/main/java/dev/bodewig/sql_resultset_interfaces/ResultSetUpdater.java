package dev.bodewig.sql_resultset_interfaces;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.sql.NClob;
import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLType;
import java.sql.SQLXML;

/**
 * Subset of the {@link ResultSet} interface containing only data writing
 * methods
 * 
 * @see ResultSet
 */
public interface ResultSetUpdater {

	/** see {@link ResultSet#cancelRowUpdates()} */
	void cancelRowUpdates() throws SQLException;

	/** see {@link ResultSet#deleteRow()} */
	void deleteRow() throws SQLException;

	/** see {@link ResultSet#insertRow()} */
	void insertRow() throws SQLException;

	/** see {@link ResultSet#refreshRow()} */
	void refreshRow() throws SQLException;

	/** see {@link ResultSet#rowDeleted()} */
	boolean rowDeleted() throws SQLException;

	/** see {@link ResultSet#rowInserted()} */
	boolean rowInserted() throws SQLException;

	/** see {@link ResultSet#rowUpdated()} */
	boolean rowUpdated() throws SQLException;

	/** see {@link ResultSet#updateArray(int columnIndex, java.sql.Array x)} */
	void updateArray(int columnIndex, java.sql.Array x) throws SQLException;

	/** see {@link ResultSet#updateArray(String columnLabel, java.sql.Array x)} */
	void updateArray(String columnLabel, java.sql.Array x) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateAsciiStream(int columnIndex, java.io.InputStream x)}
	 */
	void updateAsciiStream(int columnIndex, java.io.InputStream x) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateAsciiStream(int columnIndex, java.io.InputStream x, int length)}
	 */
	void updateAsciiStream(int columnIndex, java.io.InputStream x, int length) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateAsciiStream(int columnIndex, java.io.InputStream x, long length)}
	 */
	void updateAsciiStream(int columnIndex, java.io.InputStream x, long length) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateAsciiStream(String columnLabel, java.io.InputStream x)}
	 */
	void updateAsciiStream(String columnLabel, java.io.InputStream x) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateAsciiStream(String columnLabel, java.io.InputStream x, int length)}
	 */
	void updateAsciiStream(String columnLabel, java.io.InputStream x, int length) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateAsciiStream(String columnLabel, java.io.InputStream x, long length)}
	 */
	void updateAsciiStream(String columnLabel, java.io.InputStream x, long length) throws SQLException;

	/** see {@link ResultSet#updateBigDecimal(int columnIndex, BigDecimal x)} */
	void updateBigDecimal(int columnIndex, BigDecimal x) throws SQLException;

	/** see {@link ResultSet#updateBigDecimal(String columnLabel, BigDecimal x)} */
	void updateBigDecimal(String columnLabel, BigDecimal x) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateBinaryStream(int columnIndex, java.io.InputStream x)}
	 */
	void updateBinaryStream(int columnIndex, java.io.InputStream x) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateBinaryStream(int columnIndex, java.io.InputStream x, int length)}
	 */
	void updateBinaryStream(int columnIndex, java.io.InputStream x, int length) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateBinaryStream(int columnIndex, java.io.InputStream x, long length)}
	 */
	void updateBinaryStream(int columnIndex, java.io.InputStream x, long length) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateBinaryStream(String columnLabel, java.io.InputStream x)}
	 */
	void updateBinaryStream(String columnLabel, java.io.InputStream x) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateBinaryStream(String columnLabel, java.io.InputStream x, int length)}
	 */
	void updateBinaryStream(String columnLabel, java.io.InputStream x, int length) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateBinaryStream(String columnLabel, java.io.InputStream x, long length)}
	 */
	void updateBinaryStream(String columnLabel, java.io.InputStream x, long length) throws SQLException;

	/**
	 * see {@link ResultSet#updateBlob(int columnIndex, InputStream inputStream)}
	 */
	void updateBlob(int columnIndex, InputStream inputStream) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateBlob(int columnIndex, InputStream inputStream, long length)}
	 */
	void updateBlob(int columnIndex, InputStream inputStream, long length) throws SQLException;

	/** see {@link ResultSet#updateBlob(int columnIndex, java.sql.Blob x)} */
	void updateBlob(int columnIndex, java.sql.Blob x) throws SQLException;

	/**
	 * see {@link ResultSet#updateBlob(String columnLabel, InputStream inputStream)}
	 */
	void updateBlob(String columnLabel, InputStream inputStream) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateBlob(String columnLabel, InputStream inputStream, long length)}
	 */
	void updateBlob(String columnLabel, InputStream inputStream, long length) throws SQLException;

	/** see {@link ResultSet#updateBlob(String columnLabel, java.sql.Blob x)} */
	void updateBlob(String columnLabel, java.sql.Blob x) throws SQLException;

	/** see {@link ResultSet#updateBoolean(int columnIndex, boolean x)} */
	void updateBoolean(int columnIndex, boolean x) throws SQLException;

	/** see {@link ResultSet#updateBoolean(String columnLabel, boolean x)} */
	void updateBoolean(String columnLabel, boolean x) throws SQLException;

	/** see {@link ResultSet#updateByte(int columnIndex, byte x)} */
	void updateByte(int columnIndex, byte x) throws SQLException;

	/** see {@link ResultSet#updateByte(String columnLabel, byte x)} */
	void updateByte(String columnLabel, byte x) throws SQLException;

	/** see {@link ResultSet#updateBytes(int columnIndex, byte[] x)} */
	void updateBytes(int columnIndex, byte x[]) throws SQLException;

	/** see {@link ResultSet#updateBytes(String columnLabel, byte[] x)} */
	void updateBytes(String columnLabel, byte x[]) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateCharacterStream(int columnIndex, java.io.Reader x)}
	 */
	void updateCharacterStream(int columnIndex, java.io.Reader x) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateCharacterStream(int columnIndex, java.io.Reader x, int length)}
	 */
	void updateCharacterStream(int columnIndex, java.io.Reader x, int length) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateCharacterStream(int columnIndex, java.io.Reader x, long length)}
	 */
	void updateCharacterStream(int columnIndex, java.io.Reader x, long length) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateCharacterStream(String columnLabel, java.io.Reader reader)}
	 */
	void updateCharacterStream(String columnLabel, java.io.Reader reader) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateCharacterStream(String columnLabel, java.io.Reader reader, int length)}
	 */
	void updateCharacterStream(String columnLabel, java.io.Reader reader, int length) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateCharacterStream(String columnLabel, java.io.Reader reader, long length)}
	 */
	void updateCharacterStream(String columnLabel, java.io.Reader reader, long length) throws SQLException;

	/** see {@link ResultSet#updateClob(int columnIndex, java.sql.Clob x)} */
	void updateClob(int columnIndex, java.sql.Clob x) throws SQLException;

	/** see {@link ResultSet#updateClob(int columnIndex, Reader reader)} */
	void updateClob(int columnIndex, Reader reader) throws SQLException;

	/**
	 * see {@link ResultSet#updateClob(int columnIndex, Reader reader, long length)}
	 */
	void updateClob(int columnIndex, Reader reader, long length) throws SQLException;

	/** see {@link ResultSet#updateClob(String columnLabel, java.sql.Clob x)} */
	void updateClob(String columnLabel, java.sql.Clob x) throws SQLException;

	/** see {@link ResultSet#updateClob(String columnLabel, Reader reader)} */
	void updateClob(String columnLabel, Reader reader) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateClob(String columnLabel, Reader reader, long length)}
	 */
	void updateClob(String columnLabel, Reader reader, long length) throws SQLException;

	/** see {@link ResultSet#updateDate(int columnIndex, java.sql.Date x)} */
	void updateDate(int columnIndex, java.sql.Date x) throws SQLException;

	/** see {@link ResultSet#updateDate(String columnLabel, java.sql.Date x)} */
	void updateDate(String columnLabel, java.sql.Date x) throws SQLException;

	/** see {@link ResultSet#updateDouble(int columnIndex, double x)} */
	void updateDouble(int columnIndex, double x) throws SQLException;

	/** see {@link ResultSet#updateDouble(String columnLabel, double x)} */
	void updateDouble(String columnLabel, double x) throws SQLException;

	/** see {@link ResultSet#updateFloat(int columnIndex, float x)} */
	void updateFloat(int columnIndex, float x) throws SQLException;

	/** see {@link ResultSet#updateFloat(String columnLabel, float x)} */
	void updateFloat(String columnLabel, float x) throws SQLException;

	/** see {@link ResultSet#updateInt(int columnIndex, int x)} */
	void updateInt(int columnIndex, int x) throws SQLException;

	/** see {@link ResultSet#updateInt(String columnLabel, int x)} */
	void updateInt(String columnLabel, int x) throws SQLException;

	/** see {@link ResultSet#updateLong(int columnIndex, long x)} */
	void updateLong(int columnIndex, long x) throws SQLException;

	/** see {@link ResultSet#updateLong(String columnLabel, long x)} */
	void updateLong(String columnLabel, long x) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateNCharacterStream(int columnIndex, java.io.Reader x)}
	 */
	void updateNCharacterStream(int columnIndex, java.io.Reader x) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateNCharacterStream(int columnIndex, java.io.Reader x, long length)}
	 */
	void updateNCharacterStream(int columnIndex, java.io.Reader x, long length) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateNCharacterStream(String columnLabel, java.io.Reader reader)}
	 */
	void updateNCharacterStream(String columnLabel, java.io.Reader reader) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateNCharacterStream(String columnLabel, java.io.Reader reader, long length)}
	 */
	void updateNCharacterStream(String columnLabel, java.io.Reader reader, long length) throws SQLException;

	/** see {@link ResultSet#updateNClob(int columnIndex, NClob nClob)} */
	void updateNClob(int columnIndex, NClob nClob) throws SQLException;

	/** see {@link ResultSet#updateNClob(int columnIndex, Reader reader)} */
	void updateNClob(int columnIndex, Reader reader) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateNClob(int columnIndex, Reader reader, long length)}
	 */
	void updateNClob(int columnIndex, Reader reader, long length) throws SQLException;

	/** see {@link ResultSet#updateNClob(String columnLabel, NClob nClob)} */
	void updateNClob(String columnLabel, NClob nClob) throws SQLException;

	/** see {@link ResultSet#updateNClob(String columnLabel, Reader reader)} */
	void updateNClob(String columnLabel, Reader reader) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateNClob(String columnLabel, Reader reader, long length)}
	 */
	void updateNClob(String columnLabel, Reader reader, long length) throws SQLException;

	/** see {@link ResultSet#updateNString(int columnIndex, String nString)} */
	void updateNString(int columnIndex, String nString) throws SQLException;

	/** see {@link ResultSet#updateNString(String columnLabel, String nString)} */
	void updateNString(String columnLabel, String nString) throws SQLException;

	/** see {@link ResultSet#updateNull(int columnIndex)} */
	void updateNull(int columnIndex) throws SQLException;

	/** see {@link ResultSet#updateNull(String columnLabel)} */
	void updateNull(String columnLabel) throws SQLException;

	/** see {@link ResultSet#updateObject(int columnIndex, Object x)} */
	void updateObject(int columnIndex, Object x) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateObject(int columnIndex, Object x, int scaleOrLength)}
	 */
	void updateObject(int columnIndex, Object x, int scaleOrLength) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateObject(int columnIndex, Object x, SQLType targetSqlType)}
	 */
	default void updateObject(int columnIndex, Object x, SQLType targetSqlType) throws SQLException {
		throw new SQLFeatureNotSupportedException("updateObject not implemented");
	}

	/**
	 * see
	 * {@link ResultSet#updateObject(int columnIndex, Object x, SQLType targetSqlType, int scaleOrLength)}
	 */
	default void updateObject(int columnIndex, Object x, SQLType targetSqlType, int scaleOrLength) throws SQLException {
		throw new SQLFeatureNotSupportedException("updateObject not implemented");
	}

	/** see {@link ResultSet#updateObject(String columnLabel, Object x)} */
	void updateObject(String columnLabel, Object x) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateObject(String columnLabel, Object x, int scaleOrLength)}
	 */
	void updateObject(String columnLabel, Object x, int scaleOrLength) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateObject(String columnLabel, Object x, SQLType targetSqlType)}
	 */
	default void updateObject(String columnLabel, Object x, SQLType targetSqlType) throws SQLException {
		throw new SQLFeatureNotSupportedException("updateObject not implemented");
	}

	/**
	 * see
	 * {@link ResultSet#updateObject(String columnLabel, Object x, SQLType targetSqlType, int scaleOrLength)}
	 */
	default void updateObject(String columnLabel, Object x, SQLType targetSqlType, int scaleOrLength)
			throws SQLException {
		throw new SQLFeatureNotSupportedException("updateObject not implemented");
	}

	/** see {@link ResultSet#updateRef(int columnIndex, java.sql.Ref x)} */
	void updateRef(int columnIndex, java.sql.Ref x) throws SQLException;

	/** see {@link ResultSet#updateRef(String columnLabel, java.sql.Ref x)} */
	void updateRef(String columnLabel, java.sql.Ref x) throws SQLException;

	/** see {@link ResultSet#updateRow()} */
	void updateRow() throws SQLException;

	/** see {@link ResultSet#updateRowId(int columnIndex, RowId x)} */
	void updateRowId(int columnIndex, RowId x) throws SQLException;

	/** see {@link ResultSet#updateRowId(String columnLabel, RowId x)} */
	void updateRowId(String columnLabel, RowId x) throws SQLException;

	/** see {@link ResultSet#updateShort(int columnIndex, short x)} */
	void updateShort(int columnIndex, short x) throws SQLException;

	/** see {@link ResultSet#updateShort(String columnLabel, short x)} */
	void updateShort(String columnLabel, short x) throws SQLException;

	/** see {@link ResultSet#updateSQLXML(int columnIndex, SQLXML xmlObject)} */
	void updateSQLXML(int columnIndex, SQLXML xmlObject) throws SQLException;

	/** see {@link ResultSet#updateSQLXML(String columnLabel, SQLXML xmlObject)} */
	void updateSQLXML(String columnLabel, SQLXML xmlObject) throws SQLException;

	/** see {@link ResultSet#updateString(int columnIndex, String x)} */
	void updateString(int columnIndex, String x) throws SQLException;

	/** see {@link ResultSet#updateString(String columnLabel, String x)} */
	void updateString(String columnLabel, String x) throws SQLException;

	/** see {@link ResultSet#updateTime(int columnIndex, java.sql.Time x)} */
	void updateTime(int columnIndex, java.sql.Time x) throws SQLException;

	/** see {@link ResultSet#updateTime(String columnLabel, java.sql.Time x)} */
	void updateTime(String columnLabel, java.sql.Time x) throws SQLException;

	/**
	 * see {@link ResultSet#updateTimestamp(int columnIndex, java.sql.Timestamp x)}
	 */
	void updateTimestamp(int columnIndex, java.sql.Timestamp x) throws SQLException;

	/**
	 * see
	 * {@link ResultSet#updateTimestamp(String columnLabel, java.sql.Timestamp x)}
	 */
	void updateTimestamp(String columnLabel, java.sql.Timestamp x) throws SQLException;
}
