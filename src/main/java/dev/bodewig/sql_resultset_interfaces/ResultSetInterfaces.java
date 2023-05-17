package dev.bodewig.sql_resultset_interfaces;

import java.sql.ResultSet;

public class ResultSetInterfaces {

	private ResultSetInterfaces() {
	}

	public static ResultSetMeta toMeta(ResultSet rs) {
		return InterfaceDelegator.delegate(rs, ResultSetMeta.class);
	}

	public static ResultSetReader toReader(ResultSet rs) {
		return InterfaceDelegator.delegate(rs, ResultSetReader.class);
	}

	public static ResultSetTraverser toTraverser(ResultSet rs) {
		return InterfaceDelegator.delegate(rs, ResultSetTraverser.class);
	}

	public static ResultSetUpdater toUpdater(ResultSet rs) {
		return InterfaceDelegator.delegate(rs, ResultSetUpdater.class);
	}

	public static <T> T toCustom(ResultSet rs, Class<T> iface) {
		return InterfaceDelegator.delegate(rs, iface);
	}
}
