package org.testng;



import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class JavaTech  extends BaseClass {
	
	
	

@Parameters({"cricket","date"})
@Test()

private void tc1(String s1, String s2) throws IOException, InterruptedException {
	
	launchChrome();
	winmax();
	loadurl("https://www.facebook.com/");
	LoginPojo l = new LoginPojo();
	fill(l.getTxtuser(),s1);
	fill(l.getTxtpass(),s2);
	btnClick(l.getTxtlogin());

}
}




