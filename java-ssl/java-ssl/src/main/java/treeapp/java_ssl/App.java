package treeapp.java_ssl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws MalformedURLException, IOException
    {
    	String url = "https://www.google.com";
		URLConnection connection = new URL(url).openConnection();
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		
		String line;
		while((line = reader.readLine()) != null) {
			System.out.println(line);
		}
    }
}
