/**
 * TweetUsage automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.twitter;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
public class TweetUsage {
    private int capResetDay;
    private String projectCap;
    private String projectId;
    private String projectUsage;
    @JsonSetter("cap_reset_day")
    public void setCapResetDay(int capResetDay) {
        this.capResetDay = capResetDay;
    }
    @JsonGetter("cap_reset_day")
    public int getCapResetDay() {
        return this.capResetDay;
    }
    @JsonSetter("project_cap")
    public void setProjectCap(String projectCap) {
        this.projectCap = projectCap;
    }
    @JsonGetter("project_cap")
    public String getProjectCap() {
        return this.projectCap;
    }
    @JsonSetter("project_id")
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    @JsonGetter("project_id")
    public String getProjectId() {
        return this.projectId;
    }
    @JsonSetter("project_usage")
    public void setProjectUsage(String projectUsage) {
        this.projectUsage = projectUsage;
    }
    @JsonGetter("project_usage")
    public String getProjectUsage() {
        return this.projectUsage;
    }
}
