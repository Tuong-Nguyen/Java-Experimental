package treeapp.java_ssl;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Test;
import static org.hamcrest.Matchers.*;

/**
 * Unit test for simple App.
 */

public class AppTest {

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
		assertThat(new App().getPage("https://www.google.com"), not(isEmptyString()));
	}
}
