package web.updatedjars.webmodule.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class HomeScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.devrabbit.com/\",\"report_upload_url\":\"https://192.168.1.142:8080/UploadReportFile\",\"project_name\":\"UpdatedJARs\",\"project_description\":\"desc\",\"project_id\":290,\"module_name\":\"WebModule\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":435,\"testcase_name\":\"Tc1\",\"testcase_id\":470,\"testset_id\":0,\"executed_timestamp\":-1351889340,\"browser_type\":\"chrome\"}";

	public static String projectName = "updatedjars";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public HomeScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//HTML/BODY[1]/SECTION[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[5]/A[1]")	
	private WebElement	IoTSolutionsAndServices_313749A;
	public String clkAIoTSolutionsAndServices_313749() {
		waitForExpectedElement(driver, IoTSolutionsAndServices_313749A);		
		String text = IoTSolutionsAndServices_313749A.getText();
		IoTSolutionsAndServices_313749A.click();
		return text;
	}

}