package jugger.core.models;

/**
 * Created by root on 12/4/15.
 */
public class RoleUserRef {
    private String rurSid;
    private String rurRlSid;
    private String rulUsrSid;
    private String rulOrgSid;
    private Orgnization orgnizationByRulOrgSid;
    private Role roleByRurRlSid;
    private Users usersByRulUsrSid;

    public String getRurSid() {
        return rurSid;
    }

    public void setRurSid(String rurSid) {
        this.rurSid = rurSid;
    }

    public String getRurRlSid() {
        return rurRlSid;
    }

    public void setRurRlSid(String rurRlSid) {
        this.rurRlSid = rurRlSid;
    }

    public String getRulUsrSid() {
        return rulUsrSid;
    }

    public void setRulUsrSid(String rulUsrSid) {
        this.rulUsrSid = rulUsrSid;
    }

    public String getRulOrgSid() {
        return rulOrgSid;
    }

    public void setRulOrgSid(String rulOrgSid) {
        this.rulOrgSid = rulOrgSid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleUserRef that = (RoleUserRef) o;

        if (rurSid != null ? !rurSid.equals(that.rurSid) : that.rurSid != null) return false;
        if (rurRlSid != null ? !rurRlSid.equals(that.rurRlSid) : that.rurRlSid != null) return false;
        if (rulUsrSid != null ? !rulUsrSid.equals(that.rulUsrSid) : that.rulUsrSid != null) return false;
        if (rulOrgSid != null ? !rulOrgSid.equals(that.rulOrgSid) : that.rulOrgSid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rurSid != null ? rurSid.hashCode() : 0;
        result = 31 * result + (rurRlSid != null ? rurRlSid.hashCode() : 0);
        result = 31 * result + (rulUsrSid != null ? rulUsrSid.hashCode() : 0);
        result = 31 * result + (rulOrgSid != null ? rulOrgSid.hashCode() : 0);
        return result;
    }

    public Orgnization getOrgnizationByRulOrgSid() {
        return orgnizationByRulOrgSid;
    }

    public void setOrgnizationByRulOrgSid(Orgnization orgnizationByRulOrgSid) {
        this.orgnizationByRulOrgSid = orgnizationByRulOrgSid;
    }

    public Role getRoleByRurRlSid() {
        return roleByRurRlSid;
    }

    public void setRoleByRurRlSid(Role roleByRurRlSid) {
        this.roleByRurRlSid = roleByRurRlSid;
    }

    public Users getUsersByRulUsrSid() {
        return usersByRulUsrSid;
    }

    public void setUsersByRulUsrSid(Users usersByRulUsrSid) {
        this.usersByRulUsrSid = usersByRulUsrSid;
    }
}
