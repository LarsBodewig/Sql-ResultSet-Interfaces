package dev.bodewig.sql_resultset_interfaces;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doThrow;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ResultSetInterfacesTest {

    @Mock
    ResultSet rs;

    @Test
    public void toCustomTest() {
        interface CloseableSql {
            void close() throws SQLException;
        }
        assertDoesNotThrow(() -> {
            CloseableSql res = ResultSetInterfaces.toCustom(rs, CloseableSql.class);
            res.close();
        });
    }

    @Test
    public void toCustomTest2() {
        interface CombinedInterface extends ResultSetReader, ResultSetTraverser {
        }
        assertDoesNotThrow(() -> {
            CombinedInterface res = ResultSetInterfaces.toCustom(rs, CombinedInterface.class);
            res.findColumn(null);
            res.absolute(0);
        });
    }

    @Test
    public void toCustomFail() {
        assertThrows(IllegalArgumentException.class, () -> ResultSetInterfaces.toCustom(rs, Object.class));
    }

    @Test
    public void toCustomFail2() throws SQLException {
        class CustomException extends SQLException {}
        interface Clear {
            void clearWarnings() throws SQLException;
        }
        doThrow(CustomException.class).when(rs).clearWarnings();
        assertThrows(CustomException.class, () -> {
            Clear res = ResultSetInterfaces.toCustom(rs, Clear.class);
            res.clearWarnings();
        });
    }

    @Test
    public void toMetaTest() {
        assertDoesNotThrow(() -> {
            ResultSetMeta res = ResultSetInterfaces.toMeta(rs);
            res.clearWarnings();
        });
    }

    @Test
    public void toReaderTest() {
        assertDoesNotThrow(() -> {
            ResultSetReader res = ResultSetInterfaces.toReader(rs);
            res.findColumn(null);
        });
    }

    @Test
    public void toTraverserTest() {
        assertDoesNotThrow(() -> {
            ResultSetTraverser res = ResultSetInterfaces.toTraverser(rs);
            res.absolute(0);
        });
    }

    @Test
    public void toUpdaterTest() {
        assertDoesNotThrow(() -> {
            ResultSetUpdater res = ResultSetInterfaces.toUpdater(rs);
            res.cancelRowUpdates();
        });
    }
}
