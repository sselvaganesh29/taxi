import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass
{
        public String readProperty(String key)
        {
            Properties properties = new Properties();

            String value = null;

            try(FileInputStream file = new FileInputStream("configuration/demo.properties"))
            {

                properties.load(file);

                file.close();

                value = properties.getProperty(key);

            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            return value;

        }


}
