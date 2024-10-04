package Listerners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterGenerator {

    public static ExtentReports getExtentReport() {
        String reportPath = "C:\\Users\\boopa\\eclipse-workspace\\Ecommerce\\Reports\\TestReport.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
        reporter.config().setReportName("BestBuy Test Report");
        reporter.config().setDocumentTitle("Test Report");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Dhivi");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Browser", "Chrome");

        return extent;
    }
}