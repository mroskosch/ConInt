
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.junit.Test;

import junit.framework.TestCase;


public class HTMLTest extends TestCase {

    @Test
    public void testApp()
    {
        String urlString = "http://localhost:8080/";

try {
    URL url = new URL(urlString);
    URLConnection conn = url.openConnection();
    InputStream is = conn.getInputStream();
    assertEquals(convertStreamToString(is), "Hello World!"); 
    is.close();
} catch (IOException e) {
     e.getMessage();
    }
    

    }
    
    private String convertStreamToString(java.io.InputStream is) {
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }
}
