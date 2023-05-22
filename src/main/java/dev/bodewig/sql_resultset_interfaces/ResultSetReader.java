package dev.bodewig.sql_resultset_interfaces;

import java.math.BigDecimal;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLXML;
import java.util.Calendar;

/**
 * Subset of the {@link ResultSet} interface containing only data reading
 * methods
 * 
 * @see ResultSet
 */
public interface ResultSetReader {

	/** see {@link ResultSet#findColumn(String columnLabel)} */
	int findColumn(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getArray(int columnIndex)} */
	Array getArray(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getArray(String columnLabel)} */
	Array getArray(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getAsciiStream(int columnIndex)} */
	java.io.InputStream getAsciiStream(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getAsciiStream(String columnLabel)} */
	java.io.InputStream getAsciiStream(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getBigDecimal(int columnIndex)} */
	BigDecimal getBigDecimal(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getBigDecimal(String columnLabel)} */
	BigDecimal getBigDecimal(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getBinaryStream(int columnIndex)} */
	java.io.InputStream getBinaryStream(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getBinaryStream(String columnLabel)} */
	java.io.InputStream getBinaryStream(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getBlob(int columnIndex)} */
	Blob getBlob(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getBlob(String columnLabel)} */
	Blob getBlob(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getBoolean(int columnIndex)} */
	boolean getBoolean(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getBoolean(String columnLabel)} */
	boolean getBoolean(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getByte(int columnIndex)} */
	byte getByte(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getByte(String columnLabel)} */
	byte getByte(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getBytes(int columnIndex)} */
	byte[] getBytes(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getBytes(String columnLabel)} */
	byte[] getBytes(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getCharacterStream(int columnIndex)} */
	java.io.Reader getCharacterStream(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getCharacterStream(String columnLabel)} */
	java.io.Reader getCharacterStream(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getClob(int columnIndex)} */
	Clob getClob(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getClob(String columnLabel)} */
	Clob getClob(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getDate(int columnIndex)} */
	java.sql.Date getDate(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getDate(int columnIndex, Calendar cal)} */
	java.sql.Date getDate(int columnIndex, Calendar cal) throws SQLException;

	/** see {@link ResultSet#getDate(String columnLabel)} */
	java.sql.Date getDate(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getDate(String columnLabel, Calendar cal)} */
	java.sql.Date getDate(String columnLabel, Calendar cal) throws SQLException;

	/** see {@link ResultSet#getDouble(int columnIndex)} */
	double getDouble(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getDouble(String columnLabel)} */
	double getDouble(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getFloat(int columnIndex)} */
	float getFloat(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getFloat(String columnLabel)} */
	float getFloat(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getInt(int columnIndex)} */
	int getInt(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getInt(String columnLabel)} */
	int getInt(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getLong(int columnIndex)} */
	long getLong(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getLong(String columnLabel)} */
	long getLong(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getNCharacterStream(int columnIndex)} */
	java.io.Reader getNCharacterStream(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getNCharacterStream(String columnLabel)} */
	java.io.Reader getNCharacterStream(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getNClob(String columnLabel)} */
	NClob getNClob(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getNString(int columnIndex)} */
	String getNString(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getNString(String columnLabel)} */
	String getNString(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getObject(int columnIndex)} */
	Object getObject(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getObject(int columnIndex, Class<T> type)} */
	public <T> T getObject(int columnIndex, Class<T> type) throws SQLException;

	/** see {@link ResultSet#getObject(int columnIndex, java.util.Map map)} */
	Object getObject(int columnIndex, java.util.Map<String, Class<?>> map) throws SQLException;

	/** see {@link ResultSet#getObject(String columnLabel)} */
	Object getObject(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getObject(String columnLabel, Class<T> type)} */
	public <T> T getObject(String columnLabel, Class<T> type) throws SQLException;

	/** see {@link ResultSet#getObject(String columnLabel, java.util.Map map)} */
	Object getObject(String columnLabel, java.util.Map<String, Class<?>> map) throws SQLException;

	/** see {@link ResultSet#getRef(int columnIndex)} */
	Ref getRef(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getRef(String columnLabel)} */
	Ref getRef(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getRowId(int columnIndex)} */
	RowId getRowId(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getRowId(String columnLabel)} */
	RowId getRowId(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getShort(int columnIndex)} */
	short getShort(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getShort(String columnLabel)} */
	short getShort(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getSQLXML(int columnIndex)} */
	SQLXML getSQLXML(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getSQLXML(String columnLabel)} */
	SQLXML getSQLXML(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getString(int columnIndex)} */
	String getString(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getString(String columnLabel)} */
	String getString(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getTime(int columnIndex)} */
	java.sql.Time getTime(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getTime(int columnIndex, Calendar cal)} */
	java.sql.Time getTime(int columnIndex, Calendar cal) throws SQLException;

	/** see {@link ResultSet#getTime(String columnLabel)} */
	java.sql.Time getTime(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getTime(String columnLabel, Calendar cal)} */
	java.sql.Time getTime(String columnLabel, Calendar cal) throws SQLException;

	/** see {@link ResultSet#getTimestamp(int columnIndex)} */
	java.sql.Timestamp getTimestamp(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getTimestamp(int columnIndex, Calendar cal)} */
	java.sql.Timestamp getTimestamp(int columnIndex, Calendar cal) throws SQLException;

	/** see {@link ResultSet#getTimestamp(String columnLabel)} */
	java.sql.Timestamp getTimestamp(String columnLabel) throws SQLException;

	/** see {@link ResultSet#getTimestamp(String columnLabel, Calendar cal)} */
	java.sql.Timestamp getTimestamp(String columnLabel, Calendar cal) throws SQLException;

	/** see {@link ResultSet#getURL(int columnIndex)} */
	java.net.URL getURL(int columnIndex) throws SQLException;

	/** see {@link ResultSet#getURL(String columnLabel)} */
	java.net.URL getURL(String columnLabel) throws SQLException;

	/** see {@link ResultSet#wasNull()} */
	boolean wasNull() throws SQLException;
}