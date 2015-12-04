package jugger.core.models;

/**
 * Created by root on 12/4/15.
 */
public class DataDictionary {
    private String ddSid;
    private String ddAppSid;
    private String ddName;
    private int ddValue;
    private String ddCode;
    private String ddParent;
    private Integer ddSubMax;
    private int ddType;
    private String ddIcon;
    private String ddDesc;
    private Application applicationByDdAppSid;

    public String getDdSid() {
        return ddSid;
    }

    public void setDdSid(String ddSid) {
        this.ddSid = ddSid;
    }

    public String getDdAppSid() {
        return ddAppSid;
    }

    public void setDdAppSid(String ddAppSid) {
        this.ddAppSid = ddAppSid;
    }

    public String getDdName() {
        return ddName;
    }

    public void setDdName(String ddName) {
        this.ddName = ddName;
    }

    public int getDdValue() {
        return ddValue;
    }

    public void setDdValue(int ddValue) {
        this.ddValue = ddValue;
    }

    public String getDdCode() {
        return ddCode;
    }

    public void setDdCode(String ddCode) {
        this.ddCode = ddCode;
    }

    public String getDdParent() {
        return ddParent;
    }

    public void setDdParent(String ddParent) {
        this.ddParent = ddParent;
    }

    public Integer getDdSubMax() {
        return ddSubMax;
    }

    public void setDdSubMax(Integer ddSubMax) {
        this.ddSubMax = ddSubMax;
    }

    public int getDdType() {
        return ddType;
    }

    public void setDdType(int ddType) {
        this.ddType = ddType;
    }

    public String getDdIcon() {
        return ddIcon;
    }

    public void setDdIcon(String ddIcon) {
        this.ddIcon = ddIcon;
    }

    public String getDdDesc() {
        return ddDesc;
    }

    public void setDdDesc(String ddDesc) {
        this.ddDesc = ddDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataDictionary that = (DataDictionary) o;

        if (ddValue != that.ddValue) return false;
        if (ddType != that.ddType) return false;
        if (ddSid != null ? !ddSid.equals(that.ddSid) : that.ddSid != null) return false;
        if (ddAppSid != null ? !ddAppSid.equals(that.ddAppSid) : that.ddAppSid != null) return false;
        if (ddName != null ? !ddName.equals(that.ddName) : that.ddName != null) return false;
        if (ddCode != null ? !ddCode.equals(that.ddCode) : that.ddCode != null) return false;
        if (ddParent != null ? !ddParent.equals(that.ddParent) : that.ddParent != null) return false;
        if (ddSubMax != null ? !ddSubMax.equals(that.ddSubMax) : that.ddSubMax != null) return false;
        if (ddIcon != null ? !ddIcon.equals(that.ddIcon) : that.ddIcon != null) return false;
        if (ddDesc != null ? !ddDesc.equals(that.ddDesc) : that.ddDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ddSid != null ? ddSid.hashCode() : 0;
        result = 31 * result + (ddAppSid != null ? ddAppSid.hashCode() : 0);
        result = 31 * result + (ddName != null ? ddName.hashCode() : 0);
        result = 31 * result + ddValue;
        result = 31 * result + (ddCode != null ? ddCode.hashCode() : 0);
        result = 31 * result + (ddParent != null ? ddParent.hashCode() : 0);
        result = 31 * result + (ddSubMax != null ? ddSubMax.hashCode() : 0);
        result = 31 * result + ddType;
        result = 31 * result + (ddIcon != null ? ddIcon.hashCode() : 0);
        result = 31 * result + (ddDesc != null ? ddDesc.hashCode() : 0);
        return result;
    }

    public Application getApplicationByDdAppSid() {
        return applicationByDdAppSid;
    }

    public void setApplicationByDdAppSid(Application applicationByDdAppSid) {
        this.applicationByDdAppSid = applicationByDdAppSid;
    }
}
