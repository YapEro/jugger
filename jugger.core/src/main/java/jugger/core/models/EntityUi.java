package jugger.core.models;

import java.util.Collection;

/**
 * Created by root on 12/4/15.
 */
public class EntityUi {
    private String euSid;
    private String euEcSid;
    private String euName;
    private int euType;
    private Boolean euReadonly;
    private String euTitle;
    private String euDesc;
    private Collection<CompositeUi> compositeUisByEuSid;
    private EntityConfig entityConfigByEuEcSid;
    private Collection<FormConfig> formConfigsByEuSid;
    private Collection<ListConfig> listConfigsByEuSid;
    private Collection<TreeviewConfig> treeviewConfigsByEuSid;
    private Collection<UiOperation> uiOperationsByEuSid;

    public String getEuSid() {
        return euSid;
    }

    public void setEuSid(String euSid) {
        this.euSid = euSid;
    }

    public String getEuEcSid() {
        return euEcSid;
    }

    public void setEuEcSid(String euEcSid) {
        this.euEcSid = euEcSid;
    }

    public String getEuName() {
        return euName;
    }

    public void setEuName(String euName) {
        this.euName = euName;
    }

    public int getEuType() {
        return euType;
    }

    public void setEuType(int euType) {
        this.euType = euType;
    }

    public Boolean getEuReadonly() {
        return euReadonly;
    }

    public void setEuReadonly(Boolean euReadonly) {
        this.euReadonly = euReadonly;
    }

    public String getEuTitle() {
        return euTitle;
    }

    public void setEuTitle(String euTitle) {
        this.euTitle = euTitle;
    }

    public String getEuDesc() {
        return euDesc;
    }

    public void setEuDesc(String euDesc) {
        this.euDesc = euDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityUi entityUi = (EntityUi) o;

        if (euType != entityUi.euType) return false;
        if (euSid != null ? !euSid.equals(entityUi.euSid) : entityUi.euSid != null) return false;
        if (euEcSid != null ? !euEcSid.equals(entityUi.euEcSid) : entityUi.euEcSid != null) return false;
        if (euName != null ? !euName.equals(entityUi.euName) : entityUi.euName != null) return false;
        if (euReadonly != null ? !euReadonly.equals(entityUi.euReadonly) : entityUi.euReadonly != null) return false;
        if (euTitle != null ? !euTitle.equals(entityUi.euTitle) : entityUi.euTitle != null) return false;
        if (euDesc != null ? !euDesc.equals(entityUi.euDesc) : entityUi.euDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = euSid != null ? euSid.hashCode() : 0;
        result = 31 * result + (euEcSid != null ? euEcSid.hashCode() : 0);
        result = 31 * result + (euName != null ? euName.hashCode() : 0);
        result = 31 * result + euType;
        result = 31 * result + (euReadonly != null ? euReadonly.hashCode() : 0);
        result = 31 * result + (euTitle != null ? euTitle.hashCode() : 0);
        result = 31 * result + (euDesc != null ? euDesc.hashCode() : 0);
        return result;
    }

    public Collection<CompositeUi> getCompositeUisByEuSid() {
        return compositeUisByEuSid;
    }

    public void setCompositeUisByEuSid(Collection<CompositeUi> compositeUisByEuSid) {
        this.compositeUisByEuSid = compositeUisByEuSid;
    }

    public EntityConfig getEntityConfigByEuEcSid() {
        return entityConfigByEuEcSid;
    }

    public void setEntityConfigByEuEcSid(EntityConfig entityConfigByEuEcSid) {
        this.entityConfigByEuEcSid = entityConfigByEuEcSid;
    }

    public Collection<FormConfig> getFormConfigsByEuSid() {
        return formConfigsByEuSid;
    }

    public void setFormConfigsByEuSid(Collection<FormConfig> formConfigsByEuSid) {
        this.formConfigsByEuSid = formConfigsByEuSid;
    }

    public Collection<ListConfig> getListConfigsByEuSid() {
        return listConfigsByEuSid;
    }

    public void setListConfigsByEuSid(Collection<ListConfig> listConfigsByEuSid) {
        this.listConfigsByEuSid = listConfigsByEuSid;
    }

    public Collection<TreeviewConfig> getTreeviewConfigsByEuSid() {
        return treeviewConfigsByEuSid;
    }

    public void setTreeviewConfigsByEuSid(Collection<TreeviewConfig> treeviewConfigsByEuSid) {
        this.treeviewConfigsByEuSid = treeviewConfigsByEuSid;
    }

    public Collection<UiOperation> getUiOperationsByEuSid() {
        return uiOperationsByEuSid;
    }

    public void setUiOperationsByEuSid(Collection<UiOperation> uiOperationsByEuSid) {
        this.uiOperationsByEuSid = uiOperationsByEuSid;
    }
}
