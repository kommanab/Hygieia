package com.capitalone.dashboard.collector;

import com.capitalone.dashboard.model.CodeQuality;
import com.capitalone.dashboard.model.SonarProject;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface SonarClient {

    List<SonarProject> getProjects(String instanceUrl);

    CodeQuality currentCodeQuality(SonarProject project) throws FileNotFoundException, IOException;

}
