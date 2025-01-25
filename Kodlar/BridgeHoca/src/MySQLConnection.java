//3. CONCRETE (SOMUT UYGULAYICI)
public class MySQLConnection implements DatabasePlatform{
    @Override
    public void configureConnection() {
        System.out.println("Connecting to MySQL...");
    }
}
