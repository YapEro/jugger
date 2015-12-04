package jugger.core.models;

/**
 * Created by root on 12/4/15.
 */
public class ListConfig {
    private String lcSid;
    private String lcEcSid;
    private String lcEuSid;
    private String lcPcSid;
    private Double lcWidth;
    private String lcWidthUnit;
    private Boolean lcVisibility;
    private int lcSort;
    private Boolean lcFilterable;
    private Boolean lcGroupable;
    private Boolean lcSortable;
    private EntityUi entityUiByLcEuSid;
    private PropertyConfig propertyConfigByLcPcSid;

    public String getLcSid() {
        return lcSid;
    }

    public void setLcSid(String lcSid) {
        this.lcSid = lcSid;
    }

    public String getLcEcSid() {
        return lcEcSid;
    }

    public void setLcEcSid(String lcEcSid) {
        this.lcEcSid = lcEcSid;
    }

    public String getLcEuSid() {
        return lcEuSid;
    }

    public void setLcEuSid(String lcEuSid) {
        this.lcEuSid = lcEuSid;
    }

    public String getLcPcSid() {
        return lcPcSid;
    }

    public void setLcPcSid(String lcPcSid) {
        this.lcPcSid = lcPcSid;
    }

    public Double getLcWidth() {
        return lcWidth;
    }

    public void setLcWidth(Double lcWidth) {
        this.lcWidth = lcWidth;
    }

    public String getLcWidthUnit() {
        return lcWidthUnit;
    }

    public void setLcWidthUnit(String lcWidthUnit) {
        this.lcWidthUnit = lcWidthUnit;
    }

    public Boolean getLcVisibility() {
        return lcVisibility;
    }

    public void setLcVisibility(Boolean lcVisibility) {
        this.lcVisibility = lcVisibility;
    }

    public int getLcSort() {
        return lcSort;
    }

    public void setLcSort(int lcSort) {
        this.lcSort = lcSort;
    }

    public Boolean getLcFilterable() {
        return lcFilterable;
    }

    public void setLcFilterable(Boolean lcFilterable) {
        this.lcFilterable = lcFilterable;
    }

    public Boolean getLcGroupable() {
        return lcGroupable;
    }

    public void setLcGroupable(Boolean lcGroupable) {
        this.lcGroupable = lcGroupable;
    }

    public Boolean getLcSortable() {
        return lcSortable;
    }

    public void setLcSortable(Boolean lcSortable) {
        this.lcSortable = lcSortable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListConfig that = (ListConfig) o;

        if (lcSort != that.lcSort) return false;
        if (lcSid != null ? !lcSid.equals(that.lcSid) : that.lcSid != null) return false;
        if (lcEcSid != null ? !lcEcSid.equals(that.lcEcSid) : that.lcEcSid != null) return false;
        if (lcEuSid != null ? !lcEuSid.equals(that.lcEuSid) : that.lcEuSid != null) return false;
        if (lcPcSid != null ? !lcPcSid.equals(that.lcPcSid) : that.lcPcSid != null) return false;
        if (lcWidth != null ? !lcWidth.equals(that.lcWidth) : that.lcWidth != null) return false;
        if (lcWidthUnit != null ? !lcWidthUnit.equals(that.lcWidthUnit) : that.lcWidthUnit != null) return false;
        if (lcVisibility != null ? !lcVisibility.equals(that.lcVisibility) : that.lcVisibility != null) return false;
        if (lcFilterable != null ? !lcFilterable.equals(that.lcFilterable) : that.lcFilterable != null) return false;
        if (lcGroupable != null ? !lcGroupable.equals(that.lcGroupable) : that.lcGroupable != null) return false;
        if (lcSortable != null ? !lcSortable.equals(that.lcSortable) : that.lcSortable != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lcSid != null ? lcSid.hashCode() : 0;
        result = 31 * result + (lcEcSid != null ? lcEcSid.hashCode() : 0);
        result = 31 * result + (lcEuSid != null ? lcEuSid.hashCode() : 0);
        result = 31 * result + (lcPcSid != null ? lcPcSid.hashCode() : 0);
        result = 31 * result + (lcWidth != null ? lcWidth.hashCode() : 0);
        result = 31 * result + (lcWidthUnit != null ? lcWidthUnit.hashCode() : 0);
        result = 31 * result + (lcVisibility != null ? lcVisibility.hashCode() : 0);
        result = 31 * result + lcSort;
        result = 31 * result + (lcFilterable != null ? lcFilterable.hashCode() : 0);
        result = 31 * result + (lcGroupable != null ? lcGroupable.hashCode() : 0);
        result = 31 * result + (lcSortable != null ? lcSortable.hashCode() : 0);
        return result;
    }

    public EntityUi getEntityUiByLcEuSid() {
        return entityUiByLcEuSid;
    }

    public void setEntityUiByLcEuSid(EntityUi entityUiByLcEuSid) {
        this.entityUiByLcEuSid = entityUiByLcEuSid;
    }

    public PropertyConfig getPropertyConfigByLcPcSid() {
        return propertyConfigByLcPcSid;
    }

    public void setPropertyConfigByLcPcSid(PropertyConfig propertyConfigByLcPcSid) {
        this.propertyConfigByLcPcSid = propertyConfigByLcPcSid;
    }
}
