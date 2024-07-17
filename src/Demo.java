import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo
{

    public  void dummy()
    {
        Properties pro = new Properties();

        try (FileInputStream demofield = new FileInputStream("configuration/demo.properties"))
        {
            pro.load(demofield);

            int pDemo = Integer.parseInt(pro.getProperty("selva"));
            System.out.println("The value =" + pDemo);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
