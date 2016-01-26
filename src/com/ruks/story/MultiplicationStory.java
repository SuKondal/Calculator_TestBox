package com.ruks.story;

import java.util.ArrayList;
import java.util.List;


import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import com.ruks.step.MultiplicationStep;


public class MultiplicationStory extends JUnitStories{

	//	@Override
	public Configuration configuration() {
		return new MostUsefulConfiguration()
		// where to find the stories
				.useStoryLoader(new LoadFromClasspath(this.getClass()))
				// CONSOLE and TXT reporting
				.useStoryReporterBuilder(
						new StoryReporterBuilder().withDefaultFormats()
								.withFormats(Format.CONSOLE, Format.TXT));
	}

	
	@Override
	public InjectableStepsFactory stepsFactory() {


		return new InstanceStepsFactory(configuration(),new MultiplicationStep());
		
		
	}
	
	

	@Override
	protected List<String> storyPaths() {
		
		return new StoryFinder().findPaths(CodeLocations.codeLocationFromClass(this.getClass()), "**/multiplication*.story", "");
	}
}
