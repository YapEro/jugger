package jugger.core.models;

/**
 * Created by root on 12/4/15.
 */
public class UiOperation {
    private String uoSid;
    private String uoEcSid;
    private String uoEuSid;
    private Integer uoType;
    private String uoName;
    private String uoTitle;
    private String uoIcon;
    private int uoSort;
    private String uoView;
    private String uoParam;
    private String uoAction;
    private EntityUi entityUiByUoEuSid;

    public String getUoSid() {
        return uoSid;
    }

    public void setUoSid(String uoSid) {
        this.uoSid = uoSid;
    }

    public String getUoEcSid() {
        return uoEcSid;
    }

    public void setUoEcSid(String uoEcSid) {
        this.uoEcSid = uoEcSid;
    }

    public String getUoEuSid() {
        return uoEuSid;
    }

    public void setUoEuSid(String uoEuSid) {
        this.uoEuSid = uoEuSid;
    }

    public Integer getUoType() {
        return uoType;
    }

    public void setUoType(Integer uoType) {
        this.uoType = uoType;
    }

    public String getUoName() {
        return uoName;
    }

    public void setUoName(String uoName) {
        this.uoName = uoName;
    }

    public String getUoTitle() {
        return uoTitle;
    }

    public void setUoTitle(String uoTitle) {
        this.uoTitle = uoTitle;
    }

    public String getUoIcon() {
        return uoIcon;
    }

    public void setUoIcon(String uoIcon) {
        this.uoIcon = uoIcon;
    }

    public int getUoSort() {
        return uoSort;
    }

    public void setUoSort(int uoSort) {
        this.uoSort = uoSort;
    }

    public String getUoView() {
        return uoView;
    }

    public void setUoView(String uoView) {
        this.uoView = uoView;
    }

    public String getUoParam() {
        return uoParam;
    }

    public void setUoParam(String uoParam) {
        this.uoParam = uoParam;
    }

    public String getUoAction() {
        return uoAction;
    }

    public void setUoAction(String uoAction) {
        this.uoAction = uoAction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UiOperation that = (UiOperation) o;

        if (uoSort != that.uoSort) return false;
        if (uoSid != null ? !uoSid.equals(that.uoSid) : that.uoSid != null) return false;
        if (uoEcSid != null ? !uoEcSid.equals(that.uoEcSid) : that.uoEcSid != null) return false;
        if (uoEuSid != null ? !uoEuSid.equals(that.uoEuSid) : that.uoEuSid != null) return false;
        if (uoType != null ? !uoType.equals(that.uoType) : that.uoType != null) return false;
        if (uoName != null ? !uoName.equals(that.uoName) : that.uoName != null) return false;
        if (uoTitle != null ? !uoTitle.equals(that.uoTitle) : that.uoTitle != null) return false;
        if (uoIcon != null ? !uoIcon.equals(that.uoIcon) : that.uoIcon != null) return false;
        if (uoView != null ? !uoView.equals(that.uoView) : that.uoView != null) return false;
        if (uoParam != null ? !uoParam.equals(that.uoParam) : that.uoParam != null) return false;
        if (uoAction != null ? !uoAction.equals(that.uoAction) : that.uoAction != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uoSid != null ? uoSid.hashCode() : 0;
        result = 31 * result + (uoEcSid != null ? uoEcSid.hashCode() : 0);
        result = 31 * result + (uoEuSid != null ? uoEuSid.hashCode() : 0);
        result = 31 * result + (uoType != null ? uoType.hashCode() : 0);
        result = 31 * result + (uoName != null ? uoName.hashCode() : 0);
        result = 31 * result + (uoTitle != null ? uoTitle.hashCode() : 0);
        result = 31 * result + (uoIcon != null ? uoIcon.hashCode() : 0);
        result = 31 * result + uoSort;
        result = 31 * result + (uoView != null ? uoView.hashCode() : 0);
        result = 31 * result + (uoParam != null ? uoParam.hashCode() : 0);
        result = 31 * result + (uoAction != null ? uoAction.hashCode() : 0);
        return result;
    }

    public EntityUi getEntityUiByUoEuSid() {
        return entityUiByUoEuSid;
    }

    public void setEntityUiByUoEuSid(EntityUi entityUiByUoEuSid) {
        this.entityUiByUoEuSid = entityUiByUoEuSid;
    }
}
