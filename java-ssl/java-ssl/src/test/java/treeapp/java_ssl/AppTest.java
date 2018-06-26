package treeapp.java_ssl;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Test;
import org.hamcrest.Matchers
;

/**
 * Unit test for simple App.
 */

public class AppTest{

	@Test	
	public void getPage_UntrustedCertificate_ThrowException() {
		App app = new App();
		String url = "https://self-signed.badssl.com";
		
		try {
			app.getPage(url);
			fail();
		} catch (Exception e) {
		}
	}
	
	@Test	
	public void getPage_TrustedCertificate_DoNotThrowException() throws Exception {
		App app = new App();
		String url = "https://www.google.com";
		

String output = 			app.getPage(url);
		
assertThat(output, not(isEmptyString()));
	}
}
