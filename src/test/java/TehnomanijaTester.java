import org.openqa.selenium.edge.EdgeDriver;
import org.junit.Test;

public class TehnomanijaTester {
    EdgeDriver driver;

    public TehnomanijaTester() {
        System.setProperty("webdriver.edge.driver","C:\\Users\\katar\\OneDrive\\Radna površina\\QA Kurs\\Test\\Driver\\msedgedriver.exe");
        this.driver = new EdgeDriver();
    }

    @Test
    public void probaTesta() {
        driver.get("http://www.tehnomanija.rs/");
    }

}
