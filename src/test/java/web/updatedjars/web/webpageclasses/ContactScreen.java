package web.updatedjars.web.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class ContactScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://devrabbit.com\",\"report_upload_url\":\"https://192.168.1.142:8080/UploadReportFile\",\"project_name\":\"UpdatedJARs\",\"project_description\":\"desc\",\"project_id\":290,\"module_name\":\"web\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":439,\"testcase_name\":\"TC1\",\"testcase_id\":471,\"testset_id\":0,\"executed_timestamp\":-1589740761,\"browser_type\":\"chrome\"}";

	public static String projectName = "updatedjars";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public ContactScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//A[@id='tpth']")	
	private WebElement	Tirupati_314709A;
	public String clkATirupati_314709() {
		waitForExpectedElement(driver, Tirupati_314709A);		
		String text = Tirupati_314709A.getText();
		Tirupati_314709A.click();
		return text;
	}

}