package dev.bodewig.sql_resultset_interfaces;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.sql.NClob;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLType;
import java.sql.SQLXML;

public interface ResultSetUpdater {

	void updateNull(int columnIndex) throws SQLException;
	void updateBoolean(int columnIndex, boolean x) throws SQLException;
	void updateByte(int columnIndex, byte x) throws SQLException;
	void updateShort(int columnIndex, short x) throws SQLException;
	void updateInt(int columnIndex, int x) throws SQLException;
	void updateLong(int columnIndex, long x) throws SQLException;
	void updateFloat(int columnIndex, float x) throws SQLException;
	void updateDouble(int columnIndex, double x) throws SQLException;
	void updateBigDecimal(int columnIndex, BigDecimal x) throws SQLException;
	void updateString(int columnIndex, String x) throws SQLException;
	void updateBytes(int columnIndex, byte x[]) throws SQLException;
	void updateDate(int columnIndex, java.sql.Date x) throws SQLException;
	void updateTime(int columnIndex, java.sql.Time x) throws SQLException;
	void updateTimestamp(int columnIndex, java.sql.Timestamp x) throws SQLException;
	void updateAsciiStream(int columnIndex, java.io.InputStream x, int length) throws SQLException;
	void updateBinaryStream(int columnIndex, java.io.InputStream x, int length) throws SQLException;
	void updateCharacterStream(int columnIndex, java.io.Reader x, int length) throws SQLException;
	void updateObject(int columnIndex, Object x, int scaleOrLength) throws SQLException;
	void updateObject(int columnIndex, Object x) throws SQLException;
	void updateNull(String columnLabel) throws SQLException;
	void updateBoolean(String columnLabel, boolean x) throws SQLException;
	void updateByte(String columnLabel, byte x) throws SQLException;
	void updateShort(String columnLabel, short x) throws SQLException;
	void updateInt(String columnLabel, int x) throws SQLException;
	void updateLong(String columnLabel, long x) throws SQLException;
	void updateFloat(String columnLabel, float x) throws SQLException;
	void updateDouble(String columnLabel, double x) throws SQLException;
	void updateBigDecimal(String columnLabel, BigDecimal x) throws SQLException;
	void updateString(String columnLabel, String x) throws SQLException;
	void updateBytes(String columnLabel, byte x[]) throws SQLException;
	void updateDate(String columnLabel, java.sql.Date x) throws SQLException;
	void updateTime(String columnLabel, java.sql.Time x) throws SQLException;
	void updateTimestamp(String columnLabel, java.sql.Timestamp x) throws SQLException;
	void updateAsciiStream(String columnLabel, java.io.InputStream x, int length) throws SQLException;
	void updateBinaryStream(String columnLabel, java.io.InputStream x, int length) throws SQLException;
	void updateCharacterStream(String columnLabel, java.io.Reader reader, int length) throws SQLException;
	void updateObject(String columnLabel, Object x, int scaleOrLength) throws SQLException;
	void updateObject(String columnLabel, Object x) throws SQLException;

	void updateRow() throws SQLException;
	void cancelRowUpdates() throws SQLException;
	boolean rowUpdated() throws SQLException;

	void updateRef(int columnIndex, java.sql.Ref x) throws SQLException;
	void updateRef(String columnLabel, java.sql.Ref x) throws SQLException;
	void updateBlob(int columnIndex, java.sql.Blob x) throws SQLException;
	void updateBlob(String columnLabel, java.sql.Blob x) throws SQLException;
	void updateClob(int columnIndex, java.sql.Clob x) throws SQLException;
	void updateClob(String columnLabel, java.sql.Clob x) throws SQLException;
	void updateArray(int columnIndex, java.sql.Array x) throws SQLException;
	void updateArray(String columnLabel, java.sql.Array x) throws SQLException;

	void updateRowId(int columnIndex, RowId x) throws SQLException;
	void updateRowId(String columnLabel, RowId x) throws SQLException;

	void updateNString(int columnIndex, String nString) throws SQLException;
	void updateNString(String columnLabel, String nString) throws SQLException;
	void updateNClob(int columnIndex, NClob nClob) throws SQLException;
	void updateNClob(String columnLabel, NClob nClob) throws SQLException;
	void updateSQLXML(int columnIndex, SQLXML xmlObject) throws SQLException;
	void updateSQLXML(String columnLabel, SQLXML xmlObject) throws SQLException;
	void updateNCharacterStream(int columnIndex, java.io.Reader x, long length) throws SQLException;
	void updateNCharacterStream(String columnLabel, java.io.Reader reader, long length) throws SQLException;
	void updateAsciiStream(int columnIndex, java.io.InputStream x, long length) throws SQLException;
	void updateBinaryStream(int columnIndex, java.io.InputStream x, long length) throws SQLException;
	void updateCharacterStream(int columnIndex, java.io.Reader x, long length) throws SQLException;
	void updateAsciiStream(String columnLabel, java.io.InputStream x, long length) throws SQLException;
	void updateBinaryStream(String columnLabel, java.io.InputStream x, long length) throws SQLException;
	void updateCharacterStream(String columnLabel, java.io.Reader reader, long length) throws SQLException;
	void updateBlob(int columnIndex, InputStream inputStream, long length) throws SQLException;
	void updateBlob(String columnLabel, InputStream inputStream, long length) throws SQLException;
	void updateClob(int columnIndex, Reader reader, long length) throws SQLException;
	void updateClob(String columnLabel, Reader reader, long length) throws SQLException;
	void updateNClob(int columnIndex, Reader reader, long length) throws SQLException;
	void updateNClob(String columnLabel, Reader reader, long length) throws SQLException;

	void updateNCharacterStream(int columnIndex, java.io.Reader x) throws SQLException;
	void updateNCharacterStream(String columnLabel, java.io.Reader reader) throws SQLException;
	void updateAsciiStream(int columnIndex, java.io.InputStream x) throws SQLException;
	void updateBinaryStream(int columnIndex, java.io.InputStream x) throws SQLException;
	void updateCharacterStream(int columnIndex, java.io.Reader x) throws SQLException;
	void updateAsciiStream(String columnLabel, java.io.InputStream x) throws SQLException;
	void updateBinaryStream(String columnLabel, java.io.InputStream x) throws SQLException;
	void updateCharacterStream(String columnLabel, java.io.Reader reader) throws SQLException;
	void updateBlob(int columnIndex, InputStream inputStream) throws SQLException;
	void updateBlob(String columnLabel, InputStream inputStream) throws SQLException;
	void updateClob(int columnIndex, Reader reader) throws SQLException;
	void updateClob(String columnLabel, Reader reader) throws SQLException;
	void updateNClob(int columnIndex, Reader reader) throws SQLException;
	void updateNClob(String columnLabel, Reader reader) throws SQLException;

	boolean rowInserted() throws SQLException;
	boolean rowDeleted() throws SQLException;
	void insertRow() throws SQLException;
	void deleteRow() throws SQLException;
	void refreshRow() throws SQLException;

	default void updateObject(int columnIndex, Object x, SQLType targetSqlType, int scaleOrLength) throws SQLException {
		throw new SQLFeatureNotSupportedException("updateObject not implemented");
	}
	default void updateObject(String columnLabel, Object x, SQLType targetSqlType, int scaleOrLength)
			throws SQLException {
		throw new SQLFeatureNotSupportedException("updateObject not implemented");
	}
	default void updateObject(int columnIndex, Object x, SQLType targetSqlType) throws SQLException {
		throw new SQLFeatureNotSupportedException("updateObject not implemented");
	}
	default void updateObject(String columnLabel, Object x, SQLType targetSqlType) throws SQLException {
		throw new SQLFeatureNotSupportedException("updateObject not implemented");
	}
}
