package jugger.core.models;

/**
 * Created by root on 12/4/15.
 */
public class Configuration {
    private String cfSid;
    private Integer cfOwnerType;
    private String cfOwnerSid;
    private String cfName;
    private String cfTitle;
    private String cfContent;
    private String cfGroup;

    public String getCfSid() {
        return cfSid;
    }

    public void setCfSid(String cfSid) {
        this.cfSid = cfSid;
    }

    public Integer getCfOwnerType() {
        return cfOwnerType;
    }

    public void setCfOwnerType(Integer cfOwnerType) {
        this.cfOwnerType = cfOwnerType;
    }

    public String getCfOwnerSid() {
        return cfOwnerSid;
    }

    public void setCfOwnerSid(String cfOwnerSid) {
        this.cfOwnerSid = cfOwnerSid;
    }

    public String getCfName() {
        return cfName;
    }

    public void setCfName(String cfName) {
        this.cfName = cfName;
    }

    public String getCfTitle() {
        return cfTitle;
    }

    public void setCfTitle(String cfTitle) {
        this.cfTitle = cfTitle;
    }

    public String getCfContent() {
        return cfContent;
    }

    public void setCfContent(String cfContent) {
        this.cfContent = cfContent;
    }

    public String getCfGroup() {
        return cfGroup;
    }

    public void setCfGroup(String cfGroup) {
        this.cfGroup = cfGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Configuration that = (Configuration) o;

        if (cfSid != null ? !cfSid.equals(that.cfSid) : that.cfSid != null) return false;
        if (cfOwnerType != null ? !cfOwnerType.equals(that.cfOwnerType) : that.cfOwnerType != null) return false;
        if (cfOwnerSid != null ? !cfOwnerSid.equals(that.cfOwnerSid) : that.cfOwnerSid != null) return false;
        if (cfName != null ? !cfName.equals(that.cfName) : that.cfName != null) return false;
        if (cfTitle != null ? !cfTitle.equals(that.cfTitle) : that.cfTitle != null) return false;
        if (cfContent != null ? !cfContent.equals(that.cfContent) : that.cfContent != null) return false;
        if (cfGroup != null ? !cfGroup.equals(that.cfGroup) : that.cfGroup != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cfSid != null ? cfSid.hashCode() : 0;
        result = 31 * result + (cfOwnerType != null ? cfOwnerType.hashCode() : 0);
        result = 31 * result + (cfOwnerSid != null ? cfOwnerSid.hashCode() : 0);
        result = 31 * result + (cfName != null ? cfName.hashCode() : 0);
        result = 31 * result + (cfTitle != null ? cfTitle.hashCode() : 0);
        result = 31 * result + (cfContent != null ? cfContent.hashCode() : 0);
        result = 31 * result + (cfGroup != null ? cfGroup.hashCode() : 0);
        return result;
    }
}
