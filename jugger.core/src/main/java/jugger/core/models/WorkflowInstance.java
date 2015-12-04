package jugger.core.models;

import java.util.Collection;

/**
 * Created by root on 12/4/15.
 */
public class WorkflowInstance {
    private String wfiSid;
    private String wfiWfcSid;
    private String wfiEntityConfig;
    private String wfiEntitySid;
    private int wfiEntityStatus;
    private int wfiInstanceStatus;
    private String wfiExt;
    private Collection<WorkflowComments> workflowCommentsesByWfiSid;
    private WorkflowConfig workflowConfigByWfiWfcSid;

    public String getWfiSid() {
        return wfiSid;
    }

    public void setWfiSid(String wfiSid) {
        this.wfiSid = wfiSid;
    }

    public String getWfiWfcSid() {
        return wfiWfcSid;
    }

    public void setWfiWfcSid(String wfiWfcSid) {
        this.wfiWfcSid = wfiWfcSid;
    }

    public String getWfiEntityConfig() {
        return wfiEntityConfig;
    }

    public void setWfiEntityConfig(String wfiEntityConfig) {
        this.wfiEntityConfig = wfiEntityConfig;
    }

    public String getWfiEntitySid() {
        return wfiEntitySid;
    }

    public void setWfiEntitySid(String wfiEntitySid) {
        this.wfiEntitySid = wfiEntitySid;
    }

    public int getWfiEntityStatus() {
        return wfiEntityStatus;
    }

    public void setWfiEntityStatus(int wfiEntityStatus) {
        this.wfiEntityStatus = wfiEntityStatus;
    }

    public int getWfiInstanceStatus() {
        return wfiInstanceStatus;
    }

    public void setWfiInstanceStatus(int wfiInstanceStatus) {
        this.wfiInstanceStatus = wfiInstanceStatus;
    }

    public String getWfiExt() {
        return wfiExt;
    }

    public void setWfiExt(String wfiExt) {
        this.wfiExt = wfiExt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkflowInstance that = (WorkflowInstance) o;

        if (wfiEntityStatus != that.wfiEntityStatus) return false;
        if (wfiInstanceStatus != that.wfiInstanceStatus) return false;
        if (wfiSid != null ? !wfiSid.equals(that.wfiSid) : that.wfiSid != null) return false;
        if (wfiWfcSid != null ? !wfiWfcSid.equals(that.wfiWfcSid) : that.wfiWfcSid != null) return false;
        if (wfiEntityConfig != null ? !wfiEntityConfig.equals(that.wfiEntityConfig) : that.wfiEntityConfig != null)
            return false;
        if (wfiEntitySid != null ? !wfiEntitySid.equals(that.wfiEntitySid) : that.wfiEntitySid != null) return false;
        if (wfiExt != null ? !wfiExt.equals(that.wfiExt) : that.wfiExt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = wfiSid != null ? wfiSid.hashCode() : 0;
        result = 31 * result + (wfiWfcSid != null ? wfiWfcSid.hashCode() : 0);
        result = 31 * result + (wfiEntityConfig != null ? wfiEntityConfig.hashCode() : 0);
        result = 31 * result + (wfiEntitySid != null ? wfiEntitySid.hashCode() : 0);
        result = 31 * result + wfiEntityStatus;
        result = 31 * result + wfiInstanceStatus;
        result = 31 * result + (wfiExt != null ? wfiExt.hashCode() : 0);
        return result;
    }

    public Collection<WorkflowComments> getWorkflowCommentsesByWfiSid() {
        return workflowCommentsesByWfiSid;
    }

    public void setWorkflowCommentsesByWfiSid(Collection<WorkflowComments> workflowCommentsesByWfiSid) {
        this.workflowCommentsesByWfiSid = workflowCommentsesByWfiSid;
    }

    public WorkflowConfig getWorkflowConfigByWfiWfcSid() {
        return workflowConfigByWfiWfcSid;
    }

    public void setWorkflowConfigByWfiWfcSid(WorkflowConfig workflowConfigByWfiWfcSid) {
        this.workflowConfigByWfiWfcSid = workflowConfigByWfiWfcSid;
    }
}
