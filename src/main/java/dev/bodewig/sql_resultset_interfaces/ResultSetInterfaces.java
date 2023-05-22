package dev.bodewig.sql_resultset_interfaces;

import java.sql.ResultSet;

/**
 * Utility-Class to cast a {@link ResultSet} to a specialized sub-interface.
 * Combine multiple interfaces at once with
 * {@link ResultSetInterfaces#toCustom(ResultSet, Class)}.
 */
public class ResultSetInterfaces {

	/**
	 * Cast a {@code ResultSet} to a special interface containing only the custom
	 * interface's methods.
	 * <p>
	 * The custom interface has to be a subset of {@code ResultSet} to work (method
	 * signatures need to match in name and parameters), but you can combine
	 * existing interfaces from this package:
	 * <p>
	 * {@code interface MyResultSetApi extends ResultSetReader, ResultSetTraverser}
	 * 
	 * @param rs
	 *            the {@code ResultSet} to cast
	 * @return the specialized {@code ResultSet}
	 */
	public static <T> T toCustom(ResultSet rs, Class<T> iface) {
		if (!iface.isInterface()) {
			throw new IllegalArgumentException("Second parameter is not an interface");
		}
		return InterfaceDelegator.delegate(rs, iface);
	}

	/**
	 * Cast a {@code ResultSet} to a special interface containing only methods
	 * operating on the meta data
	 * 
	 * @param rs
	 *            the {@code ResultSet} to cast
	 * @return the specialized {@code ResultSet}
	 */
	public static ResultSetMeta toMeta(ResultSet rs) {
		return InterfaceDelegator.delegate(rs, ResultSetMeta.class);
	}

	/**
	 * Cast a {@code ResultSet} to a special interface containing only data reading
	 * methods
	 * 
	 * @param rs
	 *            the {@code ResultSet} to cast
	 * @return the specialized {@code ResultSet}
	 */
	public static ResultSetReader toReader(ResultSet rs) {
		return InterfaceDelegator.delegate(rs, ResultSetReader.class);
	}

	/**
	 * Cast a {@code ResultSet} to a special interface containing only traversing
	 * methods
	 * 
	 * @param rs
	 *            the {@code ResultSet} to cast
	 * @return the specialized {@code ResultSet}
	 */
	public static ResultSetTraverser toTraverser(ResultSet rs) {
		return InterfaceDelegator.delegate(rs, ResultSetTraverser.class);
	}

	/**
	 * Cast a {@code ResultSet} to a special interface containing only data writing
	 * methods
	 * 
	 * @param rs
	 *            the {@code ResultSet} to cast
	 * @return the specialized {@code ResultSet}
	 */
	public static ResultSetUpdater toUpdater(ResultSet rs) {
		return InterfaceDelegator.delegate(rs, ResultSetUpdater.class);
	}

	private ResultSetInterfaces() {
	}
}
