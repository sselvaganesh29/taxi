import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class AppProperties
{
    private static final Properties properties = new Properties();

    public static void loadProperties()
    {
        try(FileInputStream file = new FileInputStream("configuration/demo.properties"))
        {
            properties.load(file);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public String readProperty( String key, String defaultValue )
    {
        return properties.getProperty( key, defaultValue);
    }

    public String readProperty( int key, String defaultValue)
    {
        String intKey = Integer.toString(key);
        return  properties.getProperty(intKey, defaultValue);
    }
}
