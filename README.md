# Sql-ResultSet-Interfaces

A small dependency mostly aimed at frameworks to enhance APIs with specialized `ResultSet` interfaces.

## Why?
Because the `java.sql.ResultSet` interface is very mighty and can confuse framework users when they are expected to do simple operations.

Why would you expose methods to update data in a `ResultSet` if your API only expects users to read a single column value?

This is just a workaround for Java's bloated `ResultSet` interface.


## Usage

The class `ResultSetInterfaces` is the main entry point offering a method for each predefined interfaces and `toCustom(ResultSet, Class<T>)` for custom interfaces:

```java
import dev.bodewig.sql_resultset_interfaces.ResultSetInterfaces;
import dev.bodewig.sql_resultset_interfaces.ResultSetReader;
...
ResultSet rs = ...
ResultSetReader rsReader = ResultSetInterfaces.toReader(rs);
rsReader.getString(1);
rsReader.deleteRow(); // method not in ResultSetReader -> does not compile
```

### Predefined interfaces

The predefined interfaces are very simple:

* `ResultSetMeta` contains methods operating on the meta data,
* `ResultSetReader` contains data reading methods,
* `ResultSetTraverser` contains traversing methods,
* `ResultSetUpdater` contains data writing methods.


### Custom interfaces

You can use custom interfaces to combine multiple existing interfaces or for your specialized use case:

```java
import dev.bodewig.sql_resultset_interfaces.ResultSetInterfaces;
import dev.bodewig.sql_resultset_interfaces.ResultSetReader;
import dev.bodewig.sql_resultset_interfaces.ResultSetTraverser;
...
interface TraversingReader extends ResultSetReader, ResultSetTraverser {}
...
ResultSet rs = ...
TraversingReader traversingReader = ResultSetInterfaces.toReader(rs);
traversingReader.getString(1);
traversingReader.next();
```

or

```java
import dev.bodewig.sql_resultset_interfaces.ResultSetInterfaces;
...
interface CloseableSql { void close() throws SQLException; }
...
CloseableSql closeableRs = ResultSetInterfaces.toReader(rs);
closeableRs.close();
```

You can also mix existing interfaces and single methods.


## Development

Run `git config --add include.path ../.gitconfig` to include the template config in your project config.
