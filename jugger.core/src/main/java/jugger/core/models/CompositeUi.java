package jugger.core.models;

/**
 * Created by root on 12/4/15.
 */
public class CompositeUi {
    private String cuSid;
    private String cuEcSid;
    private String cuEuSid;
    private String cuView;
    private Boolean cuIsMain;
    private String cuParams;
    private String cuIcon;
    private int cuSort;
    private String cuTitle;
    private String cuDesc;
    private EntityUi entityUiByCuEuSid;

    public String getCuSid() {
        return cuSid;
    }

    public void setCuSid(String cuSid) {
        this.cuSid = cuSid;
    }

    public String getCuEcSid() {
        return cuEcSid;
    }

    public void setCuEcSid(String cuEcSid) {
        this.cuEcSid = cuEcSid;
    }

    public String getCuEuSid() {
        return cuEuSid;
    }

    public void setCuEuSid(String cuEuSid) {
        this.cuEuSid = cuEuSid;
    }

    public String getCuView() {
        return cuView;
    }

    public void setCuView(String cuView) {
        this.cuView = cuView;
    }

    public Boolean getCuIsMain() {
        return cuIsMain;
    }

    public void setCuIsMain(Boolean cuIsMain) {
        this.cuIsMain = cuIsMain;
    }

    public String getCuParams() {
        return cuParams;
    }

    public void setCuParams(String cuParams) {
        this.cuParams = cuParams;
    }

    public String getCuIcon() {
        return cuIcon;
    }

    public void setCuIcon(String cuIcon) {
        this.cuIcon = cuIcon;
    }

    public int getCuSort() {
        return cuSort;
    }

    public void setCuSort(int cuSort) {
        this.cuSort = cuSort;
    }

    public String getCuTitle() {
        return cuTitle;
    }

    public void setCuTitle(String cuTitle) {
        this.cuTitle = cuTitle;
    }

    public String getCuDesc() {
        return cuDesc;
    }

    public void setCuDesc(String cuDesc) {
        this.cuDesc = cuDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompositeUi that = (CompositeUi) o;

        if (cuSort != that.cuSort) return false;
        if (cuSid != null ? !cuSid.equals(that.cuSid) : that.cuSid != null) return false;
        if (cuEcSid != null ? !cuEcSid.equals(that.cuEcSid) : that.cuEcSid != null) return false;
        if (cuEuSid != null ? !cuEuSid.equals(that.cuEuSid) : that.cuEuSid != null) return false;
        if (cuView != null ? !cuView.equals(that.cuView) : that.cuView != null) return false;
        if (cuIsMain != null ? !cuIsMain.equals(that.cuIsMain) : that.cuIsMain != null) return false;
        if (cuParams != null ? !cuParams.equals(that.cuParams) : that.cuParams != null) return false;
        if (cuIcon != null ? !cuIcon.equals(that.cuIcon) : that.cuIcon != null) return false;
        if (cuTitle != null ? !cuTitle.equals(that.cuTitle) : that.cuTitle != null) return false;
        if (cuDesc != null ? !cuDesc.equals(that.cuDesc) : that.cuDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cuSid != null ? cuSid.hashCode() : 0;
        result = 31 * result + (cuEcSid != null ? cuEcSid.hashCode() : 0);
        result = 31 * result + (cuEuSid != null ? cuEuSid.hashCode() : 0);
        result = 31 * result + (cuView != null ? cuView.hashCode() : 0);
        result = 31 * result + (cuIsMain != null ? cuIsMain.hashCode() : 0);
        result = 31 * result + (cuParams != null ? cuParams.hashCode() : 0);
        result = 31 * result + (cuIcon != null ? cuIcon.hashCode() : 0);
        result = 31 * result + cuSort;
        result = 31 * result + (cuTitle != null ? cuTitle.hashCode() : 0);
        result = 31 * result + (cuDesc != null ? cuDesc.hashCode() : 0);
        return result;
    }

    public EntityUi getEntityUiByCuEuSid() {
        return entityUiByCuEuSid;
    }

    public void setEntityUiByCuEuSid(EntityUi entityUiByCuEuSid) {
        this.entityUiByCuEuSid = entityUiByCuEuSid;
    }
}
