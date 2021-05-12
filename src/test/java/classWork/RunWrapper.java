package classWork;

import org.testng.annotations.Test;

import wrapper.GenericWrapper;

public class RunWrapper extends GenericWrapper {
	
	@Test
	public void CreateLeas() {
		 invokeBrowser("chrome", "http://iarchtaps.com:8080/opentaps/control/main/");

}
}