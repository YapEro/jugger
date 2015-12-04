package jugger.core.models;

/**
 * Created by root on 12/4/15.
 */
public class AuthAssign {
    private String aaSid;
    private String aaApSid;
    private int aaAssignedType;
    private String aaAssignedSid;
    private String aaExt;
    private AuthPoint authPointByAaApSid;

    public String getAaSid() {
        return aaSid;
    }

    public void setAaSid(String aaSid) {
        this.aaSid = aaSid;
    }

    public String getAaApSid() {
        return aaApSid;
    }

    public void setAaApSid(String aaApSid) {
        this.aaApSid = aaApSid;
    }

    public int getAaAssignedType() {
        return aaAssignedType;
    }

    public void setAaAssignedType(int aaAssignedType) {
        this.aaAssignedType = aaAssignedType;
    }

    public String getAaAssignedSid() {
        return aaAssignedSid;
    }

    public void setAaAssignedSid(String aaAssignedSid) {
        this.aaAssignedSid = aaAssignedSid;
    }

    public String getAaExt() {
        return aaExt;
    }

    public void setAaExt(String aaExt) {
        this.aaExt = aaExt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthAssign that = (AuthAssign) o;

        if (aaAssignedType != that.aaAssignedType) return false;
        if (aaSid != null ? !aaSid.equals(that.aaSid) : that.aaSid != null) return false;
        if (aaApSid != null ? !aaApSid.equals(that.aaApSid) : that.aaApSid != null) return false;
        if (aaAssignedSid != null ? !aaAssignedSid.equals(that.aaAssignedSid) : that.aaAssignedSid != null)
            return false;
        if (aaExt != null ? !aaExt.equals(that.aaExt) : that.aaExt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aaSid != null ? aaSid.hashCode() : 0;
        result = 31 * result + (aaApSid != null ? aaApSid.hashCode() : 0);
        result = 31 * result + aaAssignedType;
        result = 31 * result + (aaAssignedSid != null ? aaAssignedSid.hashCode() : 0);
        result = 31 * result + (aaExt != null ? aaExt.hashCode() : 0);
        return result;
    }

    public AuthPoint getAuthPointByAaApSid() {
        return authPointByAaApSid;
    }

    public void setAuthPointByAaApSid(AuthPoint authPointByAaApSid) {
        this.authPointByAaApSid = authPointByAaApSid;
    }
}
