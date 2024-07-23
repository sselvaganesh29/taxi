
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Optional;

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
            System.out.println("Your properties file not found!!!");
        }

    }

    public Optional <Object> readProperty( String key)
    {
        String value = properties.getProperty(key);

        if(value == null)
        {
            return Optional.of("Your key not found");
        }

        try
        {
            return  Optional.of(Integer.parseInt(value));
        }
        catch(Exception e)
        {}

        try
        {
            return  Optional.of(Long.parseLong(value));
        }
        catch(Exception e)
        {}

        try
        {
            return Optional.of(Float.parseFloat(value));
        }
        catch(Exception e)
        {}

        return Optional.of(value);
    }


}
