package jugger.core.models;

import java.sql.Timestamp;

/**
 * Created by root on 12/4/15.
 */
public class WorkflowComments {
    private String wfcoSid;
    private String wfcoWfcSid;
    private String wfcoWfiSid;
    private String wfcoUser;
    private Timestamp wfcoTime;
    private String wfcoWfoSid;
    private String wfcoContent;
    private String wfcoExt;
    private WorkflowInstance workflowInstanceByWfcoWfiSid;

    public String getWfcoSid() {
        return wfcoSid;
    }

    public void setWfcoSid(String wfcoSid) {
        this.wfcoSid = wfcoSid;
    }

    public String getWfcoWfcSid() {
        return wfcoWfcSid;
    }

    public void setWfcoWfcSid(String wfcoWfcSid) {
        this.wfcoWfcSid = wfcoWfcSid;
    }

    public String getWfcoWfiSid() {
        return wfcoWfiSid;
    }

    public void setWfcoWfiSid(String wfcoWfiSid) {
        this.wfcoWfiSid = wfcoWfiSid;
    }

    public String getWfcoUser() {
        return wfcoUser;
    }

    public void setWfcoUser(String wfcoUser) {
        this.wfcoUser = wfcoUser;
    }

    public Timestamp getWfcoTime() {
        return wfcoTime;
    }

    public void setWfcoTime(Timestamp wfcoTime) {
        this.wfcoTime = wfcoTime;
    }

    public String getWfcoWfoSid() {
        return wfcoWfoSid;
    }

    public void setWfcoWfoSid(String wfcoWfoSid) {
        this.wfcoWfoSid = wfcoWfoSid;
    }

    public String getWfcoContent() {
        return wfcoContent;
    }

    public void setWfcoContent(String wfcoContent) {
        this.wfcoContent = wfcoContent;
    }

    public String getWfcoExt() {
        return wfcoExt;
    }

    public void setWfcoExt(String wfcoExt) {
        this.wfcoExt = wfcoExt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkflowComments that = (WorkflowComments) o;

        if (wfcoSid != null ? !wfcoSid.equals(that.wfcoSid) : that.wfcoSid != null) return false;
        if (wfcoWfcSid != null ? !wfcoWfcSid.equals(that.wfcoWfcSid) : that.wfcoWfcSid != null) return false;
        if (wfcoWfiSid != null ? !wfcoWfiSid.equals(that.wfcoWfiSid) : that.wfcoWfiSid != null) return false;
        if (wfcoUser != null ? !wfcoUser.equals(that.wfcoUser) : that.wfcoUser != null) return false;
        if (wfcoTime != null ? !wfcoTime.equals(that.wfcoTime) : that.wfcoTime != null) return false;
        if (wfcoWfoSid != null ? !wfcoWfoSid.equals(that.wfcoWfoSid) : that.wfcoWfoSid != null) return false;
        if (wfcoContent != null ? !wfcoContent.equals(that.wfcoContent) : that.wfcoContent != null) return false;
        if (wfcoExt != null ? !wfcoExt.equals(that.wfcoExt) : that.wfcoExt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = wfcoSid != null ? wfcoSid.hashCode() : 0;
        result = 31 * result + (wfcoWfcSid != null ? wfcoWfcSid.hashCode() : 0);
        result = 31 * result + (wfcoWfiSid != null ? wfcoWfiSid.hashCode() : 0);
        result = 31 * result + (wfcoUser != null ? wfcoUser.hashCode() : 0);
        result = 31 * result + (wfcoTime != null ? wfcoTime.hashCode() : 0);
        result = 31 * result + (wfcoWfoSid != null ? wfcoWfoSid.hashCode() : 0);
        result = 31 * result + (wfcoContent != null ? wfcoContent.hashCode() : 0);
        result = 31 * result + (wfcoExt != null ? wfcoExt.hashCode() : 0);
        return result;
    }

    public WorkflowInstance getWorkflowInstanceByWfcoWfiSid() {
        return workflowInstanceByWfcoWfiSid;
    }

    public void setWorkflowInstanceByWfcoWfiSid(WorkflowInstance workflowInstanceByWfcoWfiSid) {
        this.workflowInstanceByWfcoWfiSid = workflowInstanceByWfcoWfiSid;
    }
}
