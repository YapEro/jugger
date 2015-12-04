package jugger.core.models;

/**
 * Created by root on 12/4/15.
 */
public class AuthDependency {
    private String adSid;
    private String adApSid;
    private String adDepsType;
    private String adDepsSid;
    private String adExt;
    private AuthPoint authPointByAdApSid;

    public String getAdSid() {
        return adSid;
    }

    public void setAdSid(String adSid) {
        this.adSid = adSid;
    }

    public String getAdApSid() {
        return adApSid;
    }

    public void setAdApSid(String adApSid) {
        this.adApSid = adApSid;
    }

    public String getAdDepsType() {
        return adDepsType;
    }

    public void setAdDepsType(String adDepsType) {
        this.adDepsType = adDepsType;
    }

    public String getAdDepsSid() {
        return adDepsSid;
    }

    public void setAdDepsSid(String adDepsSid) {
        this.adDepsSid = adDepsSid;
    }

    public String getAdExt() {
        return adExt;
    }

    public void setAdExt(String adExt) {
        this.adExt = adExt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthDependency that = (AuthDependency) o;

        if (adSid != null ? !adSid.equals(that.adSid) : that.adSid != null) return false;
        if (adApSid != null ? !adApSid.equals(that.adApSid) : that.adApSid != null) return false;
        if (adDepsType != null ? !adDepsType.equals(that.adDepsType) : that.adDepsType != null) return false;
        if (adDepsSid != null ? !adDepsSid.equals(that.adDepsSid) : that.adDepsSid != null) return false;
        if (adExt != null ? !adExt.equals(that.adExt) : that.adExt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adSid != null ? adSid.hashCode() : 0;
        result = 31 * result + (adApSid != null ? adApSid.hashCode() : 0);
        result = 31 * result + (adDepsType != null ? adDepsType.hashCode() : 0);
        result = 31 * result + (adDepsSid != null ? adDepsSid.hashCode() : 0);
        result = 31 * result + (adExt != null ? adExt.hashCode() : 0);
        return result;
    }

    public AuthPoint getAuthPointByAdApSid() {
        return authPointByAdApSid;
    }

    public void setAuthPointByAdApSid(AuthPoint authPointByAdApSid) {
        this.authPointByAdApSid = authPointByAdApSid;
    }
}
