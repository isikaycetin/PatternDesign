public class Main {
    public static void main(String[] args) {
        DatabaseConnector relationalDBConnector = new RelationalDatabaseConnector(new MySQLConnection());
        relationalDBConnector.connect();
        relationalDBConnector.executeQuery("SELECT * FROM tblUsers");

        DatabaseConnector noSQLConnector = new NoSQLDatabaseConnector(new MongoDBConnection());
        noSQLConnector.connect();
        noSQLConnector.executeQuery("db.users");
    }
}