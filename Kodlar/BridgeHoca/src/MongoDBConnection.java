//3. CONCRETE (SOMUT UYGULAYICI)
public class MongoDBConnection implements DatabasePlatform{
    @Override
    public void configureConnection() {
        System.out.println("Connecting to MongoDB...");
    }
}
