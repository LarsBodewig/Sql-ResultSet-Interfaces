package dev.bodewig.sql_resultset_interfaces;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;

class ResultSetInterfacesTest {

	@Test
	public void toCustomTest() {
		interface CloseableSql {
			void close() throws SQLException;
		}
		ResultSet rs = new TestResultSet();
		assertDoesNotThrow(() -> {
			CloseableSql res = ResultSetInterfaces.toCustom(rs, CloseableSql.class);
			res.close();
		});
	}

	@Test
	public void toCustomTest2() {
		interface CombinedInterface extends ResultSetReader, ResultSetTraverser {
		}
		ResultSet rs = new TestResultSet();
		assertDoesNotThrow(() -> {
			CombinedInterface res = ResultSetInterfaces.toCustom(rs, CombinedInterface.class);
			res.findColumn(null);
			res.absolute(0);
		});
	}

	@Test
	public void toMetaTest() {
		ResultSet rs = new TestResultSet();
		assertDoesNotThrow(() -> {
			ResultSetMeta res = ResultSetInterfaces.toMeta(rs);
			res.clearWarnings();
		});
	}

	@Test
	public void toReaderTest() {
		ResultSet rs = new TestResultSet();
		assertDoesNotThrow(() -> {
			ResultSetReader res = ResultSetInterfaces.toReader(rs);
			res.findColumn(null);
		});
	}

	@Test
	public void toTraverserTest() {
		ResultSet rs = new TestResultSet();
		assertDoesNotThrow(() -> {
			ResultSetTraverser res = ResultSetInterfaces.toTraverser(rs);
			res.absolute(0);
		});
	}

	@Test
	public void toUpdaterTest() {
		ResultSet rs = new TestResultSet();
		assertDoesNotThrow(() -> {
			ResultSetUpdater res = ResultSetInterfaces.toUpdater(rs);
			res.cancelRowUpdates();
		});
	}
}
