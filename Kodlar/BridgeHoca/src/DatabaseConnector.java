//2. ABSTRACTION (SOYUTMA)
public interface DatabaseConnector {
    void connect();
    void executeQuery(String query);
}
