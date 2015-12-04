package jugger.core.models;

/**
 * Created by root on 12/4/15.
 */
public class FormConfig {
    private String fcSid;
    private String fcEcSid;
    private String fcEuSid;
    private String fcPcSid;
    private byte fcVisibility;
    private Boolean fcReadonly;
    private String fcTemplate;
    private String fcDepsSid;
    private String fcDepsValue;
    private int fcSort;
    private EntityUi entityUiByFcEuSid;
    private PropertyConfig propertyConfigByFcPcSid;

    public String getFcSid() {
        return fcSid;
    }

    public void setFcSid(String fcSid) {
        this.fcSid = fcSid;
    }

    public String getFcEcSid() {
        return fcEcSid;
    }

    public void setFcEcSid(String fcEcSid) {
        this.fcEcSid = fcEcSid;
    }

    public String getFcEuSid() {
        return fcEuSid;
    }

    public void setFcEuSid(String fcEuSid) {
        this.fcEuSid = fcEuSid;
    }

    public String getFcPcSid() {
        return fcPcSid;
    }

    public void setFcPcSid(String fcPcSid) {
        this.fcPcSid = fcPcSid;
    }

    public byte getFcVisibility() {
        return fcVisibility;
    }

    public void setFcVisibility(byte fcVisibility) {
        this.fcVisibility = fcVisibility;
    }

    public Boolean getFcReadonly() {
        return fcReadonly;
    }

    public void setFcReadonly(Boolean fcReadonly) {
        this.fcReadonly = fcReadonly;
    }

    public String getFcTemplate() {
        return fcTemplate;
    }

    public void setFcTemplate(String fcTemplate) {
        this.fcTemplate = fcTemplate;
    }

    public String getFcDepsSid() {
        return fcDepsSid;
    }

    public void setFcDepsSid(String fcDepsSid) {
        this.fcDepsSid = fcDepsSid;
    }

    public String getFcDepsValue() {
        return fcDepsValue;
    }

    public void setFcDepsValue(String fcDepsValue) {
        this.fcDepsValue = fcDepsValue;
    }

    public int getFcSort() {
        return fcSort;
    }

    public void setFcSort(int fcSort) {
        this.fcSort = fcSort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FormConfig that = (FormConfig) o;

        if (fcVisibility != that.fcVisibility) return false;
        if (fcSort != that.fcSort) return false;
        if (fcSid != null ? !fcSid.equals(that.fcSid) : that.fcSid != null) return false;
        if (fcEcSid != null ? !fcEcSid.equals(that.fcEcSid) : that.fcEcSid != null) return false;
        if (fcEuSid != null ? !fcEuSid.equals(that.fcEuSid) : that.fcEuSid != null) return false;
        if (fcPcSid != null ? !fcPcSid.equals(that.fcPcSid) : that.fcPcSid != null) return false;
        if (fcReadonly != null ? !fcReadonly.equals(that.fcReadonly) : that.fcReadonly != null) return false;
        if (fcTemplate != null ? !fcTemplate.equals(that.fcTemplate) : that.fcTemplate != null) return false;
        if (fcDepsSid != null ? !fcDepsSid.equals(that.fcDepsSid) : that.fcDepsSid != null) return false;
        if (fcDepsValue != null ? !fcDepsValue.equals(that.fcDepsValue) : that.fcDepsValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fcSid != null ? fcSid.hashCode() : 0;
        result = 31 * result + (fcEcSid != null ? fcEcSid.hashCode() : 0);
        result = 31 * result + (fcEuSid != null ? fcEuSid.hashCode() : 0);
        result = 31 * result + (fcPcSid != null ? fcPcSid.hashCode() : 0);
        result = 31 * result + (int) fcVisibility;
        result = 31 * result + (fcReadonly != null ? fcReadonly.hashCode() : 0);
        result = 31 * result + (fcTemplate != null ? fcTemplate.hashCode() : 0);
        result = 31 * result + (fcDepsSid != null ? fcDepsSid.hashCode() : 0);
        result = 31 * result + (fcDepsValue != null ? fcDepsValue.hashCode() : 0);
        result = 31 * result + fcSort;
        return result;
    }

    public EntityUi getEntityUiByFcEuSid() {
        return entityUiByFcEuSid;
    }

    public void setEntityUiByFcEuSid(EntityUi entityUiByFcEuSid) {
        this.entityUiByFcEuSid = entityUiByFcEuSid;
    }

    public PropertyConfig getPropertyConfigByFcPcSid() {
        return propertyConfigByFcPcSid;
    }

    public void setPropertyConfigByFcPcSid(PropertyConfig propertyConfigByFcPcSid) {
        this.propertyConfigByFcPcSid = propertyConfigByFcPcSid;
    }
}
