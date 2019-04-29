package customcode;

import java.net.MalformedURLException;
import java.net.URL;

import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;

/**
 * @author unknown
 */
public class FindSelfPort implements com.ibm.rational.test.lt.kernel.custom.ICustomCode2 {

	/**
	 * Instances of this will be created using the no-arg constructor.
	 */
	public FindSelfPort() {
	}

	/**
	 * For javadoc of ICustomCode2 and ITestExecutionServices interfaces, select 'Help Contents' in the
	 * Help menu and select 'Extending Rational Performance Tester functionality' -> 'Extending test execution with custom code'
	 */
	public String exec(ITestExecutionServices tes, String[] args) {
		String moebUrl = System.getProperty("moebServerBaseUrl");
		if (moebUrl != null) {
			try {
				URL url = new URL(moebUrl);
				return String.valueOf(url.getPort());
			} catch (MalformedURLException e) {
				return "7080";
			}
			
		} else {
			return "7080";
		}
	}

}
