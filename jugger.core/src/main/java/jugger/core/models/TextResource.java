package jugger.core.models;

/**
 * Created by root on 12/4/15.
 */
public class TextResource {
    private String trSid;
    private String trAppSid;
    private String trName;
    private String trValue;
    private String trGroup;
    private String trDesc;
    private Application applicationByTrAppSid;

    public String getTrSid() {
        return trSid;
    }

    public void setTrSid(String trSid) {
        this.trSid = trSid;
    }

    public String getTrAppSid() {
        return trAppSid;
    }

    public void setTrAppSid(String trAppSid) {
        this.trAppSid = trAppSid;
    }

    public String getTrName() {
        return trName;
    }

    public void setTrName(String trName) {
        this.trName = trName;
    }

    public String getTrValue() {
        return trValue;
    }

    public void setTrValue(String trValue) {
        this.trValue = trValue;
    }

    public String getTrGroup() {
        return trGroup;
    }

    public void setTrGroup(String trGroup) {
        this.trGroup = trGroup;
    }

    public String getTrDesc() {
        return trDesc;
    }

    public void setTrDesc(String trDesc) {
        this.trDesc = trDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TextResource that = (TextResource) o;

        if (trSid != null ? !trSid.equals(that.trSid) : that.trSid != null) return false;
        if (trAppSid != null ? !trAppSid.equals(that.trAppSid) : that.trAppSid != null) return false;
        if (trName != null ? !trName.equals(that.trName) : that.trName != null) return false;
        if (trValue != null ? !trValue.equals(that.trValue) : that.trValue != null) return false;
        if (trGroup != null ? !trGroup.equals(that.trGroup) : that.trGroup != null) return false;
        if (trDesc != null ? !trDesc.equals(that.trDesc) : that.trDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = trSid != null ? trSid.hashCode() : 0;
        result = 31 * result + (trAppSid != null ? trAppSid.hashCode() : 0);
        result = 31 * result + (trName != null ? trName.hashCode() : 0);
        result = 31 * result + (trValue != null ? trValue.hashCode() : 0);
        result = 31 * result + (trGroup != null ? trGroup.hashCode() : 0);
        result = 31 * result + (trDesc != null ? trDesc.hashCode() : 0);
        return result;
    }

    public Application getApplicationByTrAppSid() {
        return applicationByTrAppSid;
    }

    public void setApplicationByTrAppSid(Application applicationByTrAppSid) {
        this.applicationByTrAppSid = applicationByTrAppSid;
    }
}
