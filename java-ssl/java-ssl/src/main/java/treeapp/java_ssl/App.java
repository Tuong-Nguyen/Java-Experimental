package treeapp.java_ssl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import com.google.common.io.CharStreams;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws MalformedURLException, IOException {
		String url = "https://www.google.com";
		App app = new App();
		String output = app.getPage(url);
		System.out.println(output);
	}

	public String getPage(String url) throws IOException, MalformedURLException {
		URLConnection connection = new URL(url).openConnection();
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String output = CharStreams.toString(reader);
		reader.close();
		return output;
	}
}
