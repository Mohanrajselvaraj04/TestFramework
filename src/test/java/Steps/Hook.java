package Steps;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hook extends SeMethods {

    @Before
    public void beforeScenario(Scenario sc) {
        
        startResult();
        startTestModule(sc.getName(), sc.getId());
        test = startTestCase(testNodes);
        test.assignCategory("Smoke");
        test.assignAuthor("Mohanraj");
        startApp("Chrome");  
    }
    
    
    public void afterScenario(Scenario sc) {
        closeAllBrowsers();
        endResult();
        
    }
    
}
