//4. REFINED ABSTRACTION (GELİŞMİŞ SOYUTMA)
public class RelationalDatabaseConnector implements DatabaseConnector {

    protected DatabasePlatform databasePlatform;

    public RelationalDatabaseConnector(DatabasePlatform databasePlatform) {
        this.databasePlatform = databasePlatform;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to Relational Database...");
        databasePlatform.configureConnection();
    }
    @Override
    public void executeQuery(String query) {
        System.out.println("Executing query: " + query+"\n");
    }
}
