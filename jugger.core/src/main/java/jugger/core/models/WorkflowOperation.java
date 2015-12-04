package jugger.core.models;

/**
 * Created by root on 12/4/15.
 */
public class WorkflowOperation {
    private String wfoSid;
    private String wfoWfcSid;
    private String wfoName;
    private String wfoIcon;
    private String wfoTitle;
    private String wfoEntity;
    private String wfoSrcNode;
    private String wfoDesNode;
    private int wfoType;
    private String wfoPrevEvent;
    private String wfoNextEvent;
    private Boolean wfoRollback;
    private String wfoMailTemplate;
    private String wfoExt;
    private String wfoDesc;
    private WorkflowConfig workflowConfigByWfoWfcSid;
    private WorkflowNode workflowNodeByWfoDesNode;
    private WorkflowNode workflowNodeByWfoSrcNode;

    public String getWfoSid() {
        return wfoSid;
    }

    public void setWfoSid(String wfoSid) {
        this.wfoSid = wfoSid;
    }

    public String getWfoWfcSid() {
        return wfoWfcSid;
    }

    public void setWfoWfcSid(String wfoWfcSid) {
        this.wfoWfcSid = wfoWfcSid;
    }

    public String getWfoName() {
        return wfoName;
    }

    public void setWfoName(String wfoName) {
        this.wfoName = wfoName;
    }

    public String getWfoIcon() {
        return wfoIcon;
    }

    public void setWfoIcon(String wfoIcon) {
        this.wfoIcon = wfoIcon;
    }

    public String getWfoTitle() {
        return wfoTitle;
    }

    public void setWfoTitle(String wfoTitle) {
        this.wfoTitle = wfoTitle;
    }

    public String getWfoEntity() {
        return wfoEntity;
    }

    public void setWfoEntity(String wfoEntity) {
        this.wfoEntity = wfoEntity;
    }

    public String getWfoSrcNode() {
        return wfoSrcNode;
    }

    public void setWfoSrcNode(String wfoSrcNode) {
        this.wfoSrcNode = wfoSrcNode;
    }

    public String getWfoDesNode() {
        return wfoDesNode;
    }

    public void setWfoDesNode(String wfoDesNode) {
        this.wfoDesNode = wfoDesNode;
    }

    public int getWfoType() {
        return wfoType;
    }

    public void setWfoType(int wfoType) {
        this.wfoType = wfoType;
    }

    public String getWfoPrevEvent() {
        return wfoPrevEvent;
    }

    public void setWfoPrevEvent(String wfoPrevEvent) {
        this.wfoPrevEvent = wfoPrevEvent;
    }

    public String getWfoNextEvent() {
        return wfoNextEvent;
    }

    public void setWfoNextEvent(String wfoNextEvent) {
        this.wfoNextEvent = wfoNextEvent;
    }

    public Boolean getWfoRollback() {
        return wfoRollback;
    }

    public void setWfoRollback(Boolean wfoRollback) {
        this.wfoRollback = wfoRollback;
    }

    public String getWfoMailTemplate() {
        return wfoMailTemplate;
    }

    public void setWfoMailTemplate(String wfoMailTemplate) {
        this.wfoMailTemplate = wfoMailTemplate;
    }

    public String getWfoExt() {
        return wfoExt;
    }

    public void setWfoExt(String wfoExt) {
        this.wfoExt = wfoExt;
    }

    public String getWfoDesc() {
        return wfoDesc;
    }

    public void setWfoDesc(String wfoDesc) {
        this.wfoDesc = wfoDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkflowOperation that = (WorkflowOperation) o;

        if (wfoType != that.wfoType) return false;
        if (wfoSid != null ? !wfoSid.equals(that.wfoSid) : that.wfoSid != null) return false;
        if (wfoWfcSid != null ? !wfoWfcSid.equals(that.wfoWfcSid) : that.wfoWfcSid != null) return false;
        if (wfoName != null ? !wfoName.equals(that.wfoName) : that.wfoName != null) return false;
        if (wfoIcon != null ? !wfoIcon.equals(that.wfoIcon) : that.wfoIcon != null) return false;
        if (wfoTitle != null ? !wfoTitle.equals(that.wfoTitle) : that.wfoTitle != null) return false;
        if (wfoEntity != null ? !wfoEntity.equals(that.wfoEntity) : that.wfoEntity != null) return false;
        if (wfoSrcNode != null ? !wfoSrcNode.equals(that.wfoSrcNode) : that.wfoSrcNode != null) return false;
        if (wfoDesNode != null ? !wfoDesNode.equals(that.wfoDesNode) : that.wfoDesNode != null) return false;
        if (wfoPrevEvent != null ? !wfoPrevEvent.equals(that.wfoPrevEvent) : that.wfoPrevEvent != null) return false;
        if (wfoNextEvent != null ? !wfoNextEvent.equals(that.wfoNextEvent) : that.wfoNextEvent != null) return false;
        if (wfoRollback != null ? !wfoRollback.equals(that.wfoRollback) : that.wfoRollback != null) return false;
        if (wfoMailTemplate != null ? !wfoMailTemplate.equals(that.wfoMailTemplate) : that.wfoMailTemplate != null)
            return false;
        if (wfoExt != null ? !wfoExt.equals(that.wfoExt) : that.wfoExt != null) return false;
        if (wfoDesc != null ? !wfoDesc.equals(that.wfoDesc) : that.wfoDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = wfoSid != null ? wfoSid.hashCode() : 0;
        result = 31 * result + (wfoWfcSid != null ? wfoWfcSid.hashCode() : 0);
        result = 31 * result + (wfoName != null ? wfoName.hashCode() : 0);
        result = 31 * result + (wfoIcon != null ? wfoIcon.hashCode() : 0);
        result = 31 * result + (wfoTitle != null ? wfoTitle.hashCode() : 0);
        result = 31 * result + (wfoEntity != null ? wfoEntity.hashCode() : 0);
        result = 31 * result + (wfoSrcNode != null ? wfoSrcNode.hashCode() : 0);
        result = 31 * result + (wfoDesNode != null ? wfoDesNode.hashCode() : 0);
        result = 31 * result + wfoType;
        result = 31 * result + (wfoPrevEvent != null ? wfoPrevEvent.hashCode() : 0);
        result = 31 * result + (wfoNextEvent != null ? wfoNextEvent.hashCode() : 0);
        result = 31 * result + (wfoRollback != null ? wfoRollback.hashCode() : 0);
        result = 31 * result + (wfoMailTemplate != null ? wfoMailTemplate.hashCode() : 0);
        result = 31 * result + (wfoExt != null ? wfoExt.hashCode() : 0);
        result = 31 * result + (wfoDesc != null ? wfoDesc.hashCode() : 0);
        return result;
    }

    public WorkflowConfig getWorkflowConfigByWfoWfcSid() {
        return workflowConfigByWfoWfcSid;
    }

    public void setWorkflowConfigByWfoWfcSid(WorkflowConfig workflowConfigByWfoWfcSid) {
        this.workflowConfigByWfoWfcSid = workflowConfigByWfoWfcSid;
    }

    public WorkflowNode getWorkflowNodeByWfoDesNode() {
        return workflowNodeByWfoDesNode;
    }

    public void setWorkflowNodeByWfoDesNode(WorkflowNode workflowNodeByWfoDesNode) {
        this.workflowNodeByWfoDesNode = workflowNodeByWfoDesNode;
    }

    public WorkflowNode getWorkflowNodeByWfoSrcNode() {
        return workflowNodeByWfoSrcNode;
    }

    public void setWorkflowNodeByWfoSrcNode(WorkflowNode workflowNodeByWfoSrcNode) {
        this.workflowNodeByWfoSrcNode = workflowNodeByWfoSrcNode;
    }
}
