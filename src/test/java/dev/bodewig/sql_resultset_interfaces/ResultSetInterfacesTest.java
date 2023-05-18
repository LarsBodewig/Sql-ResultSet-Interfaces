package dev.bodewig.sql_resultset_interfaces;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;

class ResultSetInterfacesTest {

	@Test
	public void toMetaTest() {
		ResultSet rs = new TestResultSet();
		assertDoesNotThrow(() -> {
			ResultSetMeta res = InterfaceDelegator.delegate(rs, ResultSetMeta.class);
			res.clearWarnings();
		});
	}

	@Test
	public void toReaderTest() {
		ResultSet rs = new TestResultSet();
		assertDoesNotThrow(() -> {
			ResultSetReader res = InterfaceDelegator.delegate(rs, ResultSetReader.class);
			res.findColumn(null);
		});
	}

	@Test
	public void toTraverserTest() {
		ResultSet rs = new TestResultSet();
		assertDoesNotThrow(() -> {
			ResultSetTraverser res = InterfaceDelegator.delegate(rs, ResultSetTraverser.class);
			res.absolute(0);
		});
	}

	@Test
	public void toUpdaterTest() {
		ResultSet rs = new TestResultSet();
		assertDoesNotThrow(() -> {
			ResultSetUpdater res = InterfaceDelegator.delegate(rs, ResultSetUpdater.class);
			res.cancelRowUpdates();
		});
	}

	@Test
	public void toCustomTest() {
		interface CloseableSql {
			void close() throws SQLException;
		}
		ResultSet rs = new TestResultSet();
		assertDoesNotThrow(() -> {
			CloseableSql res = InterfaceDelegator.delegate(rs, CloseableSql.class);
			res.close();
		});
	}
}
