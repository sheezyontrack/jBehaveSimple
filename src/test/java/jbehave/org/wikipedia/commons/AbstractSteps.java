package jbehave.org.wikipedia.commons;

import org.openqa.selenium.WebDriver;

/**
 * Created by Alex.
 */
public abstract class AbstractSteps {

    protected StoryContext context;
    protected WebDriver driver;

    public AbstractSteps(WebDriver driver, StoryContext context) {
        this.driver = driver;
        this.context = context;
    }
}
