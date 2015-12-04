package jugger.core.models;

/**
 * Created by root on 12/4/15.
 */
public class ViewService {
    private String vsSid;
    private String vsName;
    private String vsFilePath;
    private String vsTitle;
    private String vsAppSid;
    private String vsModuleSid;
    private String vsDesc;
    private Application applicationByVsAppSid;

    public String getVsSid() {
        return vsSid;
    }

    public void setVsSid(String vsSid) {
        this.vsSid = vsSid;
    }

    public String getVsName() {
        return vsName;
    }

    public void setVsName(String vsName) {
        this.vsName = vsName;
    }

    public String getVsFilePath() {
        return vsFilePath;
    }

    public void setVsFilePath(String vsFilePath) {
        this.vsFilePath = vsFilePath;
    }

    public String getVsTitle() {
        return vsTitle;
    }

    public void setVsTitle(String vsTitle) {
        this.vsTitle = vsTitle;
    }

    public String getVsAppSid() {
        return vsAppSid;
    }

    public void setVsAppSid(String vsAppSid) {
        this.vsAppSid = vsAppSid;
    }

    public String getVsModuleSid() {
        return vsModuleSid;
    }

    public void setVsModuleSid(String vsModuleSid) {
        this.vsModuleSid = vsModuleSid;
    }

    public String getVsDesc() {
        return vsDesc;
    }

    public void setVsDesc(String vsDesc) {
        this.vsDesc = vsDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewService that = (ViewService) o;

        if (vsSid != null ? !vsSid.equals(that.vsSid) : that.vsSid != null) return false;
        if (vsName != null ? !vsName.equals(that.vsName) : that.vsName != null) return false;
        if (vsFilePath != null ? !vsFilePath.equals(that.vsFilePath) : that.vsFilePath != null) return false;
        if (vsTitle != null ? !vsTitle.equals(that.vsTitle) : that.vsTitle != null) return false;
        if (vsAppSid != null ? !vsAppSid.equals(that.vsAppSid) : that.vsAppSid != null) return false;
        if (vsModuleSid != null ? !vsModuleSid.equals(that.vsModuleSid) : that.vsModuleSid != null) return false;
        if (vsDesc != null ? !vsDesc.equals(that.vsDesc) : that.vsDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = vsSid != null ? vsSid.hashCode() : 0;
        result = 31 * result + (vsName != null ? vsName.hashCode() : 0);
        result = 31 * result + (vsFilePath != null ? vsFilePath.hashCode() : 0);
        result = 31 * result + (vsTitle != null ? vsTitle.hashCode() : 0);
        result = 31 * result + (vsAppSid != null ? vsAppSid.hashCode() : 0);
        result = 31 * result + (vsModuleSid != null ? vsModuleSid.hashCode() : 0);
        result = 31 * result + (vsDesc != null ? vsDesc.hashCode() : 0);
        return result;
    }

    public Application getApplicationByVsAppSid() {
        return applicationByVsAppSid;
    }

    public void setApplicationByVsAppSid(Application applicationByVsAppSid) {
        this.applicationByVsAppSid = applicationByVsAppSid;
    }
}
