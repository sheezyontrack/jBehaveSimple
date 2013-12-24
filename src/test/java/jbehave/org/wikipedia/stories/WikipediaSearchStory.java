package jbehave.org.wikipedia.stories;

import jbehave.org.wikipedia.commons.AbstractStory;
import jbehave.org.wikipedia.steps.WikipediaGivenSteps;
import jbehave.org.wikipedia.steps.WikipediaThenSteps;
import jbehave.org.wikipedia.steps.WikipediaWhenSteps;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Alex.
 */
public class WikipediaSearchStory extends AbstractStory {

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(),
                new WikipediaGivenSteps(getDriver(), storyContext),
                new WikipediaWhenSteps(getDriver(), storyContext),
                new WikipediaThenSteps(getDriver(), storyContext));
    }
}