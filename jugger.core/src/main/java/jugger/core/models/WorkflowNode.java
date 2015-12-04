package jugger.core.models;

import java.util.Collection;

/**
 * Created by root on 12/4/15.
 */
public class WorkflowNode {
    private String wfnSid;
    private String wfnName;
    private String wfnTitle;
    private String wfnIcon;
    private Integer wfnDictValue;
    private String wfnWfcSid;
    private String wfnEntity;
    private String wfnExt;
    private String wfnDesc;
    private WorkflowConfig workflowConfigByWfnWfcSid;
    private Collection<WorkflowOperation> workflowOperationsByWfnSid;
    private Collection<WorkflowOperation> workflowOperationsByWfnSid_0;

    public String getWfnSid() {
        return wfnSid;
    }

    public void setWfnSid(String wfnSid) {
        this.wfnSid = wfnSid;
    }

    public String getWfnName() {
        return wfnName;
    }

    public void setWfnName(String wfnName) {
        this.wfnName = wfnName;
    }

    public String getWfnTitle() {
        return wfnTitle;
    }

    public void setWfnTitle(String wfnTitle) {
        this.wfnTitle = wfnTitle;
    }

    public String getWfnIcon() {
        return wfnIcon;
    }

    public void setWfnIcon(String wfnIcon) {
        this.wfnIcon = wfnIcon;
    }

    public Integer getWfnDictValue() {
        return wfnDictValue;
    }

    public void setWfnDictValue(Integer wfnDictValue) {
        this.wfnDictValue = wfnDictValue;
    }

    public String getWfnWfcSid() {
        return wfnWfcSid;
    }

    public void setWfnWfcSid(String wfnWfcSid) {
        this.wfnWfcSid = wfnWfcSid;
    }

    public String getWfnEntity() {
        return wfnEntity;
    }

    public void setWfnEntity(String wfnEntity) {
        this.wfnEntity = wfnEntity;
    }

    public String getWfnExt() {
        return wfnExt;
    }

    public void setWfnExt(String wfnExt) {
        this.wfnExt = wfnExt;
    }

    public String getWfnDesc() {
        return wfnDesc;
    }

    public void setWfnDesc(String wfnDesc) {
        this.wfnDesc = wfnDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkflowNode that = (WorkflowNode) o;

        if (wfnSid != null ? !wfnSid.equals(that.wfnSid) : that.wfnSid != null) return false;
        if (wfnName != null ? !wfnName.equals(that.wfnName) : that.wfnName != null) return false;
        if (wfnTitle != null ? !wfnTitle.equals(that.wfnTitle) : that.wfnTitle != null) return false;
        if (wfnIcon != null ? !wfnIcon.equals(that.wfnIcon) : that.wfnIcon != null) return false;
        if (wfnDictValue != null ? !wfnDictValue.equals(that.wfnDictValue) : that.wfnDictValue != null) return false;
        if (wfnWfcSid != null ? !wfnWfcSid.equals(that.wfnWfcSid) : that.wfnWfcSid != null) return false;
        if (wfnEntity != null ? !wfnEntity.equals(that.wfnEntity) : that.wfnEntity != null) return false;
        if (wfnExt != null ? !wfnExt.equals(that.wfnExt) : that.wfnExt != null) return false;
        if (wfnDesc != null ? !wfnDesc.equals(that.wfnDesc) : that.wfnDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = wfnSid != null ? wfnSid.hashCode() : 0;
        result = 31 * result + (wfnName != null ? wfnName.hashCode() : 0);
        result = 31 * result + (wfnTitle != null ? wfnTitle.hashCode() : 0);
        result = 31 * result + (wfnIcon != null ? wfnIcon.hashCode() : 0);
        result = 31 * result + (wfnDictValue != null ? wfnDictValue.hashCode() : 0);
        result = 31 * result + (wfnWfcSid != null ? wfnWfcSid.hashCode() : 0);
        result = 31 * result + (wfnEntity != null ? wfnEntity.hashCode() : 0);
        result = 31 * result + (wfnExt != null ? wfnExt.hashCode() : 0);
        result = 31 * result + (wfnDesc != null ? wfnDesc.hashCode() : 0);
        return result;
    }

    public WorkflowConfig getWorkflowConfigByWfnWfcSid() {
        return workflowConfigByWfnWfcSid;
    }

    public void setWorkflowConfigByWfnWfcSid(WorkflowConfig workflowConfigByWfnWfcSid) {
        this.workflowConfigByWfnWfcSid = workflowConfigByWfnWfcSid;
    }

    public Collection<WorkflowOperation> getWorkflowOperationsByWfnSid() {
        return workflowOperationsByWfnSid;
    }

    public void setWorkflowOperationsByWfnSid(Collection<WorkflowOperation> workflowOperationsByWfnSid) {
        this.workflowOperationsByWfnSid = workflowOperationsByWfnSid;
    }

    public Collection<WorkflowOperation> getWorkflowOperationsByWfnSid_0() {
        return workflowOperationsByWfnSid_0;
    }

    public void setWorkflowOperationsByWfnSid_0(Collection<WorkflowOperation> workflowOperationsByWfnSid_0) {
        this.workflowOperationsByWfnSid_0 = workflowOperationsByWfnSid_0;
    }
}
