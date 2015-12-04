package jugger.core.models;

import java.util.Collection;

/**
 * Created by root on 12/4/15.
 */
public class WorkflowConfig {
    private String wfcSid;
    private String wfcName;
    private String wfcAppSid;
    private String wfcEntity;
    private String wfcParent;
    private String wfcMailTemplate;
    private Boolean wfcTimerTask;
    private String wfcExt;
    private String wfcDesc;
    private Application applicationByWfcAppSid;
    private EntityConfig entityConfigByWfcEntity;
    private Collection<WorkflowInstance> workflowInstancesByWfcSid;
    private Collection<WorkflowNode> workflowNodesByWfcSid;
    private Collection<WorkflowOperation> workflowOperationsByWfcSid;

    public String getWfcSid() {
        return wfcSid;
    }

    public void setWfcSid(String wfcSid) {
        this.wfcSid = wfcSid;
    }

    public String getWfcName() {
        return wfcName;
    }

    public void setWfcName(String wfcName) {
        this.wfcName = wfcName;
    }

    public String getWfcAppSid() {
        return wfcAppSid;
    }

    public void setWfcAppSid(String wfcAppSid) {
        this.wfcAppSid = wfcAppSid;
    }

    public String getWfcEntity() {
        return wfcEntity;
    }

    public void setWfcEntity(String wfcEntity) {
        this.wfcEntity = wfcEntity;
    }

    public String getWfcParent() {
        return wfcParent;
    }

    public void setWfcParent(String wfcParent) {
        this.wfcParent = wfcParent;
    }

    public String getWfcMailTemplate() {
        return wfcMailTemplate;
    }

    public void setWfcMailTemplate(String wfcMailTemplate) {
        this.wfcMailTemplate = wfcMailTemplate;
    }

    public Boolean getWfcTimerTask() {
        return wfcTimerTask;
    }

    public void setWfcTimerTask(Boolean wfcTimerTask) {
        this.wfcTimerTask = wfcTimerTask;
    }

    public String getWfcExt() {
        return wfcExt;
    }

    public void setWfcExt(String wfcExt) {
        this.wfcExt = wfcExt;
    }

    public String getWfcDesc() {
        return wfcDesc;
    }

    public void setWfcDesc(String wfcDesc) {
        this.wfcDesc = wfcDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkflowConfig that = (WorkflowConfig) o;

        if (wfcSid != null ? !wfcSid.equals(that.wfcSid) : that.wfcSid != null) return false;
        if (wfcName != null ? !wfcName.equals(that.wfcName) : that.wfcName != null) return false;
        if (wfcAppSid != null ? !wfcAppSid.equals(that.wfcAppSid) : that.wfcAppSid != null) return false;
        if (wfcEntity != null ? !wfcEntity.equals(that.wfcEntity) : that.wfcEntity != null) return false;
        if (wfcParent != null ? !wfcParent.equals(that.wfcParent) : that.wfcParent != null) return false;
        if (wfcMailTemplate != null ? !wfcMailTemplate.equals(that.wfcMailTemplate) : that.wfcMailTemplate != null)
            return false;
        if (wfcTimerTask != null ? !wfcTimerTask.equals(that.wfcTimerTask) : that.wfcTimerTask != null) return false;
        if (wfcExt != null ? !wfcExt.equals(that.wfcExt) : that.wfcExt != null) return false;
        if (wfcDesc != null ? !wfcDesc.equals(that.wfcDesc) : that.wfcDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = wfcSid != null ? wfcSid.hashCode() : 0;
        result = 31 * result + (wfcName != null ? wfcName.hashCode() : 0);
        result = 31 * result + (wfcAppSid != null ? wfcAppSid.hashCode() : 0);
        result = 31 * result + (wfcEntity != null ? wfcEntity.hashCode() : 0);
        result = 31 * result + (wfcParent != null ? wfcParent.hashCode() : 0);
        result = 31 * result + (wfcMailTemplate != null ? wfcMailTemplate.hashCode() : 0);
        result = 31 * result + (wfcTimerTask != null ? wfcTimerTask.hashCode() : 0);
        result = 31 * result + (wfcExt != null ? wfcExt.hashCode() : 0);
        result = 31 * result + (wfcDesc != null ? wfcDesc.hashCode() : 0);
        return result;
    }

    public Application getApplicationByWfcAppSid() {
        return applicationByWfcAppSid;
    }

    public void setApplicationByWfcAppSid(Application applicationByWfcAppSid) {
        this.applicationByWfcAppSid = applicationByWfcAppSid;
    }

    public EntityConfig getEntityConfigByWfcEntity() {
        return entityConfigByWfcEntity;
    }

    public void setEntityConfigByWfcEntity(EntityConfig entityConfigByWfcEntity) {
        this.entityConfigByWfcEntity = entityConfigByWfcEntity;
    }

    public Collection<WorkflowInstance> getWorkflowInstancesByWfcSid() {
        return workflowInstancesByWfcSid;
    }

    public void setWorkflowInstancesByWfcSid(Collection<WorkflowInstance> workflowInstancesByWfcSid) {
        this.workflowInstancesByWfcSid = workflowInstancesByWfcSid;
    }

    public Collection<WorkflowNode> getWorkflowNodesByWfcSid() {
        return workflowNodesByWfcSid;
    }

    public void setWorkflowNodesByWfcSid(Collection<WorkflowNode> workflowNodesByWfcSid) {
        this.workflowNodesByWfcSid = workflowNodesByWfcSid;
    }

    public Collection<WorkflowOperation> getWorkflowOperationsByWfcSid() {
        return workflowOperationsByWfcSid;
    }

    public void setWorkflowOperationsByWfcSid(Collection<WorkflowOperation> workflowOperationsByWfcSid) {
        this.workflowOperationsByWfcSid = workflowOperationsByWfcSid;
    }
}
