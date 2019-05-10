package web.updatedjars.web.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class LandingScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://devrabbit.com\",\"report_upload_url\":\"https://192.168.1.142:8080/UploadReportFile\",\"project_name\":\"UpdatedJARs\",\"project_description\":\"desc\",\"project_id\":290,\"module_name\":\"web\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":439,\"testcase_name\":\"TC1\",\"testcase_id\":471,\"testset_id\":0,\"executed_timestamp\":-1589320381,\"browser_type\":\"chrome\"}";

	public static String projectName = "updatedjars";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public LandingScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//LI[@id='menu-item-1476']/A[1]")	
	private WebElement	Contact_314482A;
	public String clkAContact_314482() {
		waitForExpectedElement(driver, Contact_314482A);		
		String text = Contact_314482A.getText();
		Contact_314482A.click();
		return text;
	}

}