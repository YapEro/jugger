package jugger.core.models;

import java.util.Collection;

/**
 * Created by root on 12/4/15.
 */
public class EntityConfig {
    private String ecSid;
    private String ecAppSid;
    private String ecModuleSid;
    private String ecName;
    private String ecClass;
    private String ecSchema;
    private Boolean ecCache;
    private String ecExtCol;
    private int ecExtValue;
    private String ecParent;
    private String ecStatusCol;
    private int ecStatusValue;
    private String ecDelCol;
    private String ecTypeCol;
    private String ecPkCol;
    private int ecColAmount;
    private String ecDesc;
    private Application applicationByEcAppSid;
    private Module moduleByEcModuleSid;
    private Collection<EntityUi> entityUisByEcSid;
    private Collection<PropertyConfig> propertyConfigsByEcSid;
    private Collection<WorkflowConfig> workflowConfigsByEcSid;

    public String getEcSid() {
        return ecSid;
    }

    public void setEcSid(String ecSid) {
        this.ecSid = ecSid;
    }

    public String getEcAppSid() {
        return ecAppSid;
    }

    public void setEcAppSid(String ecAppSid) {
        this.ecAppSid = ecAppSid;
    }

    public String getEcModuleSid() {
        return ecModuleSid;
    }

    public void setEcModuleSid(String ecModuleSid) {
        this.ecModuleSid = ecModuleSid;
    }

    public String getEcName() {
        return ecName;
    }

    public void setEcName(String ecName) {
        this.ecName = ecName;
    }

    public String getEcClass() {
        return ecClass;
    }

    public void setEcClass(String ecClass) {
        this.ecClass = ecClass;
    }

    public String getEcSchema() {
        return ecSchema;
    }

    public void setEcSchema(String ecSchema) {
        this.ecSchema = ecSchema;
    }

    public Boolean getEcCache() {
        return ecCache;
    }

    public void setEcCache(Boolean ecCache) {
        this.ecCache = ecCache;
    }

    public String getEcExtCol() {
        return ecExtCol;
    }

    public void setEcExtCol(String ecExtCol) {
        this.ecExtCol = ecExtCol;
    }

    public int getEcExtValue() {
        return ecExtValue;
    }

    public void setEcExtValue(int ecExtValue) {
        this.ecExtValue = ecExtValue;
    }

    public String getEcParent() {
        return ecParent;
    }

    public void setEcParent(String ecParent) {
        this.ecParent = ecParent;
    }

    public String getEcStatusCol() {
        return ecStatusCol;
    }

    public void setEcStatusCol(String ecStatusCol) {
        this.ecStatusCol = ecStatusCol;
    }

    public int getEcStatusValue() {
        return ecStatusValue;
    }

    public void setEcStatusValue(int ecStatusValue) {
        this.ecStatusValue = ecStatusValue;
    }

    public String getEcDelCol() {
        return ecDelCol;
    }

    public void setEcDelCol(String ecDelCol) {
        this.ecDelCol = ecDelCol;
    }

    public String getEcTypeCol() {
        return ecTypeCol;
    }

    public void setEcTypeCol(String ecTypeCol) {
        this.ecTypeCol = ecTypeCol;
    }

    public String getEcPkCol() {
        return ecPkCol;
    }

    public void setEcPkCol(String ecPkCol) {
        this.ecPkCol = ecPkCol;
    }

    public int getEcColAmount() {
        return ecColAmount;
    }

    public void setEcColAmount(int ecColAmount) {
        this.ecColAmount = ecColAmount;
    }

    public String getEcDesc() {
        return ecDesc;
    }

    public void setEcDesc(String ecDesc) {
        this.ecDesc = ecDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityConfig that = (EntityConfig) o;

        if (ecExtValue != that.ecExtValue) return false;
        if (ecStatusValue != that.ecStatusValue) return false;
        if (ecColAmount != that.ecColAmount) return false;
        if (ecSid != null ? !ecSid.equals(that.ecSid) : that.ecSid != null) return false;
        if (ecAppSid != null ? !ecAppSid.equals(that.ecAppSid) : that.ecAppSid != null) return false;
        if (ecModuleSid != null ? !ecModuleSid.equals(that.ecModuleSid) : that.ecModuleSid != null) return false;
        if (ecName != null ? !ecName.equals(that.ecName) : that.ecName != null) return false;
        if (ecClass != null ? !ecClass.equals(that.ecClass) : that.ecClass != null) return false;
        if (ecSchema != null ? !ecSchema.equals(that.ecSchema) : that.ecSchema != null) return false;
        if (ecCache != null ? !ecCache.equals(that.ecCache) : that.ecCache != null) return false;
        if (ecExtCol != null ? !ecExtCol.equals(that.ecExtCol) : that.ecExtCol != null) return false;
        if (ecParent != null ? !ecParent.equals(that.ecParent) : that.ecParent != null) return false;
        if (ecStatusCol != null ? !ecStatusCol.equals(that.ecStatusCol) : that.ecStatusCol != null) return false;
        if (ecDelCol != null ? !ecDelCol.equals(that.ecDelCol) : that.ecDelCol != null) return false;
        if (ecTypeCol != null ? !ecTypeCol.equals(that.ecTypeCol) : that.ecTypeCol != null) return false;
        if (ecPkCol != null ? !ecPkCol.equals(that.ecPkCol) : that.ecPkCol != null) return false;
        if (ecDesc != null ? !ecDesc.equals(that.ecDesc) : that.ecDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ecSid != null ? ecSid.hashCode() : 0;
        result = 31 * result + (ecAppSid != null ? ecAppSid.hashCode() : 0);
        result = 31 * result + (ecModuleSid != null ? ecModuleSid.hashCode() : 0);
        result = 31 * result + (ecName != null ? ecName.hashCode() : 0);
        result = 31 * result + (ecClass != null ? ecClass.hashCode() : 0);
        result = 31 * result + (ecSchema != null ? ecSchema.hashCode() : 0);
        result = 31 * result + (ecCache != null ? ecCache.hashCode() : 0);
        result = 31 * result + (ecExtCol != null ? ecExtCol.hashCode() : 0);
        result = 31 * result + ecExtValue;
        result = 31 * result + (ecParent != null ? ecParent.hashCode() : 0);
        result = 31 * result + (ecStatusCol != null ? ecStatusCol.hashCode() : 0);
        result = 31 * result + ecStatusValue;
        result = 31 * result + (ecDelCol != null ? ecDelCol.hashCode() : 0);
        result = 31 * result + (ecTypeCol != null ? ecTypeCol.hashCode() : 0);
        result = 31 * result + (ecPkCol != null ? ecPkCol.hashCode() : 0);
        result = 31 * result + ecColAmount;
        result = 31 * result + (ecDesc != null ? ecDesc.hashCode() : 0);
        return result;
    }

    public Application getApplicationByEcAppSid() {
        return applicationByEcAppSid;
    }

    public void setApplicationByEcAppSid(Application applicationByEcAppSid) {
        this.applicationByEcAppSid = applicationByEcAppSid;
    }

    public Module getModuleByEcModuleSid() {
        return moduleByEcModuleSid;
    }

    public void setModuleByEcModuleSid(Module moduleByEcModuleSid) {
        this.moduleByEcModuleSid = moduleByEcModuleSid;
    }

    public Collection<EntityUi> getEntityUisByEcSid() {
        return entityUisByEcSid;
    }

    public void setEntityUisByEcSid(Collection<EntityUi> entityUisByEcSid) {
        this.entityUisByEcSid = entityUisByEcSid;
    }

    public Collection<PropertyConfig> getPropertyConfigsByEcSid() {
        return propertyConfigsByEcSid;
    }

    public void setPropertyConfigsByEcSid(Collection<PropertyConfig> propertyConfigsByEcSid) {
        this.propertyConfigsByEcSid = propertyConfigsByEcSid;
    }

    public Collection<WorkflowConfig> getWorkflowConfigsByEcSid() {
        return workflowConfigsByEcSid;
    }

    public void setWorkflowConfigsByEcSid(Collection<WorkflowConfig> workflowConfigsByEcSid) {
        this.workflowConfigsByEcSid = workflowConfigsByEcSid;
    }
}
