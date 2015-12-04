package jugger.core.models;

import java.util.Collection;

/**
 * Created by root on 12/4/15.
 */
public class TreeviewConfig {
    private String tvcSid;
    private String tvcEcSid;
    private String tvcEuSid;
    private String tvcNodeEntity;
    private int tvcNodeValue;
    private String tvcNodeTitle;
    private String tvcParent;
    private String tvcNodeIcon;
    private String tvcLinkView;
    private String tvcLinkParams;
    private String tvcFilterProperty;
    private String tvcExtCondition;
    private int tvcSort;
    private Boolean tvcSelfRef;
    private String tvcInvalidMenus;
    private String tvcExtProperty;
    private String tvcDesc;
    private EntityUi entityUiByTvcEuSid;
    private TreeviewConfig treeviewConfigByTvcParent;
    private Collection<TreeviewConfig> treeviewConfigsByTvcSid;

    public String getTvcSid() {
        return tvcSid;
    }

    public void setTvcSid(String tvcSid) {
        this.tvcSid = tvcSid;
    }

    public String getTvcEcSid() {
        return tvcEcSid;
    }

    public void setTvcEcSid(String tvcEcSid) {
        this.tvcEcSid = tvcEcSid;
    }

    public String getTvcEuSid() {
        return tvcEuSid;
    }

    public void setTvcEuSid(String tvcEuSid) {
        this.tvcEuSid = tvcEuSid;
    }

    public String getTvcNodeEntity() {
        return tvcNodeEntity;
    }

    public void setTvcNodeEntity(String tvcNodeEntity) {
        this.tvcNodeEntity = tvcNodeEntity;
    }

    public int getTvcNodeValue() {
        return tvcNodeValue;
    }

    public void setTvcNodeValue(int tvcNodeValue) {
        this.tvcNodeValue = tvcNodeValue;
    }

    public String getTvcNodeTitle() {
        return tvcNodeTitle;
    }

    public void setTvcNodeTitle(String tvcNodeTitle) {
        this.tvcNodeTitle = tvcNodeTitle;
    }

    public String getTvcParent() {
        return tvcParent;
    }

    public void setTvcParent(String tvcParent) {
        this.tvcParent = tvcParent;
    }

    public String getTvcNodeIcon() {
        return tvcNodeIcon;
    }

    public void setTvcNodeIcon(String tvcNodeIcon) {
        this.tvcNodeIcon = tvcNodeIcon;
    }

    public String getTvcLinkView() {
        return tvcLinkView;
    }

    public void setTvcLinkView(String tvcLinkView) {
        this.tvcLinkView = tvcLinkView;
    }

    public String getTvcLinkParams() {
        return tvcLinkParams;
    }

    public void setTvcLinkParams(String tvcLinkParams) {
        this.tvcLinkParams = tvcLinkParams;
    }

    public String getTvcFilterProperty() {
        return tvcFilterProperty;
    }

    public void setTvcFilterProperty(String tvcFilterProperty) {
        this.tvcFilterProperty = tvcFilterProperty;
    }

    public String getTvcExtCondition() {
        return tvcExtCondition;
    }

    public void setTvcExtCondition(String tvcExtCondition) {
        this.tvcExtCondition = tvcExtCondition;
    }

    public int getTvcSort() {
        return tvcSort;
    }

    public void setTvcSort(int tvcSort) {
        this.tvcSort = tvcSort;
    }

    public Boolean getTvcSelfRef() {
        return tvcSelfRef;
    }

    public void setTvcSelfRef(Boolean tvcSelfRef) {
        this.tvcSelfRef = tvcSelfRef;
    }

    public String getTvcInvalidMenus() {
        return tvcInvalidMenus;
    }

    public void setTvcInvalidMenus(String tvcInvalidMenus) {
        this.tvcInvalidMenus = tvcInvalidMenus;
    }

    public String getTvcExtProperty() {
        return tvcExtProperty;
    }

    public void setTvcExtProperty(String tvcExtProperty) {
        this.tvcExtProperty = tvcExtProperty;
    }

    public String getTvcDesc() {
        return tvcDesc;
    }

    public void setTvcDesc(String tvcDesc) {
        this.tvcDesc = tvcDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TreeviewConfig that = (TreeviewConfig) o;

        if (tvcNodeValue != that.tvcNodeValue) return false;
        if (tvcSort != that.tvcSort) return false;
        if (tvcSid != null ? !tvcSid.equals(that.tvcSid) : that.tvcSid != null) return false;
        if (tvcEcSid != null ? !tvcEcSid.equals(that.tvcEcSid) : that.tvcEcSid != null) return false;
        if (tvcEuSid != null ? !tvcEuSid.equals(that.tvcEuSid) : that.tvcEuSid != null) return false;
        if (tvcNodeEntity != null ? !tvcNodeEntity.equals(that.tvcNodeEntity) : that.tvcNodeEntity != null)
            return false;
        if (tvcNodeTitle != null ? !tvcNodeTitle.equals(that.tvcNodeTitle) : that.tvcNodeTitle != null) return false;
        if (tvcParent != null ? !tvcParent.equals(that.tvcParent) : that.tvcParent != null) return false;
        if (tvcNodeIcon != null ? !tvcNodeIcon.equals(that.tvcNodeIcon) : that.tvcNodeIcon != null) return false;
        if (tvcLinkView != null ? !tvcLinkView.equals(that.tvcLinkView) : that.tvcLinkView != null) return false;
        if (tvcLinkParams != null ? !tvcLinkParams.equals(that.tvcLinkParams) : that.tvcLinkParams != null)
            return false;
        if (tvcFilterProperty != null ? !tvcFilterProperty.equals(that.tvcFilterProperty) : that.tvcFilterProperty != null)
            return false;
        if (tvcExtCondition != null ? !tvcExtCondition.equals(that.tvcExtCondition) : that.tvcExtCondition != null)
            return false;
        if (tvcSelfRef != null ? !tvcSelfRef.equals(that.tvcSelfRef) : that.tvcSelfRef != null) return false;
        if (tvcInvalidMenus != null ? !tvcInvalidMenus.equals(that.tvcInvalidMenus) : that.tvcInvalidMenus != null)
            return false;
        if (tvcExtProperty != null ? !tvcExtProperty.equals(that.tvcExtProperty) : that.tvcExtProperty != null)
            return false;
        if (tvcDesc != null ? !tvcDesc.equals(that.tvcDesc) : that.tvcDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tvcSid != null ? tvcSid.hashCode() : 0;
        result = 31 * result + (tvcEcSid != null ? tvcEcSid.hashCode() : 0);
        result = 31 * result + (tvcEuSid != null ? tvcEuSid.hashCode() : 0);
        result = 31 * result + (tvcNodeEntity != null ? tvcNodeEntity.hashCode() : 0);
        result = 31 * result + tvcNodeValue;
        result = 31 * result + (tvcNodeTitle != null ? tvcNodeTitle.hashCode() : 0);
        result = 31 * result + (tvcParent != null ? tvcParent.hashCode() : 0);
        result = 31 * result + (tvcNodeIcon != null ? tvcNodeIcon.hashCode() : 0);
        result = 31 * result + (tvcLinkView != null ? tvcLinkView.hashCode() : 0);
        result = 31 * result + (tvcLinkParams != null ? tvcLinkParams.hashCode() : 0);
        result = 31 * result + (tvcFilterProperty != null ? tvcFilterProperty.hashCode() : 0);
        result = 31 * result + (tvcExtCondition != null ? tvcExtCondition.hashCode() : 0);
        result = 31 * result + tvcSort;
        result = 31 * result + (tvcSelfRef != null ? tvcSelfRef.hashCode() : 0);
        result = 31 * result + (tvcInvalidMenus != null ? tvcInvalidMenus.hashCode() : 0);
        result = 31 * result + (tvcExtProperty != null ? tvcExtProperty.hashCode() : 0);
        result = 31 * result + (tvcDesc != null ? tvcDesc.hashCode() : 0);
        return result;
    }

    public EntityUi getEntityUiByTvcEuSid() {
        return entityUiByTvcEuSid;
    }

    public void setEntityUiByTvcEuSid(EntityUi entityUiByTvcEuSid) {
        this.entityUiByTvcEuSid = entityUiByTvcEuSid;
    }

    public TreeviewConfig getTreeviewConfigByTvcParent() {
        return treeviewConfigByTvcParent;
    }

    public void setTreeviewConfigByTvcParent(TreeviewConfig treeviewConfigByTvcParent) {
        this.treeviewConfigByTvcParent = treeviewConfigByTvcParent;
    }

    public Collection<TreeviewConfig> getTreeviewConfigsByTvcSid() {
        return treeviewConfigsByTvcSid;
    }

    public void setTreeviewConfigsByTvcSid(Collection<TreeviewConfig> treeviewConfigsByTvcSid) {
        this.treeviewConfigsByTvcSid = treeviewConfigsByTvcSid;
    }
}
